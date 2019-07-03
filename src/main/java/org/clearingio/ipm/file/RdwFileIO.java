package org.clearingio.ipm.file;

import org.clearingio.iso8583.annotation.enumeration.Encode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class RdwFileIO {

	private static Logger LOGGER = LoggerFactory.getLogger(RdwFileIO.class);

	private Encode encode;

	public RdwFileIO(Encode encode) {
		this.encode = encode;
	}

	public File fromFileBlocked(File fileBlocked)
			throws IOException {
		File fileRdw = new File(fileBlocked.getAbsolutePath() + ".rwd");
		try(FileInputStream in = new FileInputStream(fileBlocked);
			FileOutputStream out = new FileOutputStream(fileRdw)) {
			// Size 1014 bytes block...
			byte[] byteBlock = new byte[1014];
			int size = 0;// size length rwd
			byte[] unusedByte = new byte[2];
			while ((size = in.read(byteBlock)) != -1) {
				// Remove last to 2 Unused Bytes
				if (size == 1014) {
					size -= 2;
					unusedByte[0] = byteBlock[1012];
					unusedByte[1] = byteBlock[1013];
				}
				out.write(byteBlock, 0, size);
			}
			LOGGER.info("Unused Byte 1 = "+ unusedByte[0] + " Unused Byte 2 = "+ unusedByte[0]);
		}
		return fileRdw;
	}

	public File toMPENonCompress(File fileRdw)
			throws IOException, ParseException {
		File fileNonCompress = new File(fileRdw.getAbsolutePath() + "nonCompress");
		HashMap<String, String> tableSubIndicator = new HashMap<>();
		try (RdwDataInputStream in = new RdwDataInputStream(new FileInputStream(fileRdw));
			 DataOutputStream out = new DataOutputStream(new FileOutputStream(fileNonCompress))) {
			while(in.hasNext()) {
				byte[] array = in.next();
				String line = new String(array, encode.getName());
				String tableId = tableSubIndicator.get(line.substring(8, 11));
				if (tableId != null) {
					String yyD = line.substring(0, 5);
					String effectiveTimestamp = convertJulianoToGregoriano(yyD);
					line = effectiveTimestamp + line.substring(5, 8) + tableId + line.substring(11);
				} else if (line.substring(11, 19).equals("IP0000T1")) {
					String subIndicator = line.substring(243, 246);
					String subjectTableId = line.substring(19, 27);
					tableSubIndicator.put(subIndicator, subjectTableId);
				}
				out.writeInt(line.length());
				out.write(line.getBytes(encode.getName()));
			}
		}
		return fileNonCompress;
	}

	private String convertJulianoToGregoriano(String yyD) throws ParseException {
		if(yyD.equals("00000")){
			return "00000000";
		}
		Date data = new SimpleDateFormat("yyD").parse(yyD);
		return new SimpleDateFormat("yyyyMMdd").format(data);
	}

	public File toFileBlocked(File fileRdw)
			throws IOException {
		File fileBlockerd = new File(fileRdw.getAbsolutePath() + ".blocked");
		try(DataInputStream in = new DataInputStream(new FileInputStream(fileRdw));
			FileOutputStream out = new FileOutputStream(fileBlockerd)) {
			byte[] array = new byte[1012];
			int length;
			while ((length = in.read(array)) != -1) {
				out.write(array, 0, length);
				if (length == 1012) out.write(new byte[2]);// unused byte
			}
		}
		return fileBlockerd;
	}
}
