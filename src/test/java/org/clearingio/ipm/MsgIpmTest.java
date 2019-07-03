package org.clearingio.ipm;

public class MsgIpmTest {

//	private Logger LOGGER = LoggerFactory.getLogger(MsgIpmTest.class);
//
//	static {
//		//System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "DEBUG");
//	}
//
//	@Test
//	public void test() throws IOException, NotFoundMTIException {
//		MsgBuilder<MsgIpm> builder = new MsgBuilder<>(MsgIpm.class, Encode.EBCDIC);
//		RdwFileIO fileIO = new RdwFileIO(Encode.EBCDIC);
//		File file = fileIO.fromFileBlocked(new File("C:\\Users\\uesr\\Desktop\\rjb"));
//		try(RdwDataInputStream in = new RdwDataInputStream(new FileInputStream(file));
//			DataOutputStream out = new DataOutputStream(new FileOutputStream(file.getAbsolutePath() + ".out"))) {
//			while(in.hasNext()) {
//				byte[] array1 = in.next();
//				LOGGER.info(new String(array1, Encode.EBCDIC.getName()));
//				MsgIpm msg = builder.unpack(array1);
//				LOGGER.info(msg.toString());
//				byte[] array2 = builder.pack(msg);
//				out.writeInt(array2.length);
//				out.write(array2);
//				LOGGER.info(new String(array2, Encode.EBCDIC.getName()));
//			}
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
}
