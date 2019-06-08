package org.clearingio.ipm;

import org.clearingio.ipm.file.FileIO;
import org.clearingio.ipm.file.RdwDataInputStream;
import org.clearingio.iso8583.Msg;
import org.clearingio.iso8583.annotation.enumeration.Encode;
import org.clearingio.iso8583.builder.MsgBuilder;
import org.clearingio.iso8583.exception.NotFoundMTIException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class MsgIpmTest {

	private Logger LOGGER = LoggerFactory.getLogger(MsgIpmTest.class);

	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "DEBUG");
	}

	@Test
	public void test() throws IOException, NotFoundMTIException {
		MsgBuilder<MsgIpm> builder = new MsgBuilder<>(MsgIpm.class, Encode.EBCDIC);
		FileIO fileIO = new FileIO(Encode.EBCDIC);
		File file = fileIO.fromFileBlocked(new File("C:\\Users\\uesr\\Desktop\\rjb"));
		try(RdwDataInputStream in = new RdwDataInputStream(new FileInputStream(file));
			DataOutputStream out = new DataOutputStream(new FileOutputStream(file.getAbsolutePath() + ".out"))) {
			while(in.hasNext()) {
				byte[] array = in.next();
				LOGGER.info(new String(array, Encode.EBCDIC.getName()));
				MsgIpm msg = builder.unpack(array);
				LOGGER.info(msg.toString());
				array = builder.pack(msg);
				out.writeInt(array.length);
				out.write(array);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
