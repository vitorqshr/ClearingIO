package org.clearingio.iso8583.builder;

import org.clearingio.ipm.MsgIpm;
import org.clearingio.iso8583.annotation.enumeration.Encode;
import static org.junit.Assert.*;

import org.junit.Test;

public class MsgIpmBuildTest {

	@Test
	public void testCreateMsgIpmPackAndUnPack() throws Exception {
		MsgIpm expected = new MsgIpm();
		expected.setMessageTypeIdentifier(1240);
		expected.setPrimaryAccountNumber("5412345678909283");
		expected.setProcessingCode("003000");
		expected.setAmountTransaction(100);
		expected.setAmountReconciliation(100);
		expected.setAmountCardholderBilling(100);
		expected.setFunctionCode(200);
		expected.setDataRecord("teste");
		MsgBuilder<MsgIpm> MsgIpmBuilder = new MsgBuilder(MsgIpm.class, Encode.ASCII);
		byte[] buf = MsgIpmBuilder.pack(expected);
		System.out.println(new String(buf, Encode.ASCII.getName()));
		MsgIpm actual = MsgIpmBuilder.unpack(buf);
		assertEquals(actual.getMessageTypeIdentifier().longValue(), expected.getMessageTypeIdentifier().longValue());
		assertEquals(actual.getPrimaryAccountNumber(), expected.getPrimaryAccountNumber());
		assertEquals(actual.getProcessingCode(), expected.getProcessingCode());
		assertEquals(actual.getAmountTransaction().longValue(), expected.getAmountTransaction().longValue());
		assertEquals(actual.getAmountReconciliation().longValue(), expected.getAmountReconciliation().longValue());
		assertEquals(actual.getAmountCardholderBilling().longValue(), expected.getAmountCardholderBilling().longValue());
		assertEquals(actual.getFunctionCode().longValue(), expected.getFunctionCode().longValue());
		assertEquals(actual.getDataRecord(), expected.getDataRecord());

		expected = new MsgIpm();
		expected.setMessageTypeIdentifier(1240);
		expected.setPrimaryAccountNumber("5412345678909283");
		expected.setProcessingCode("003000");
		expected.setAmountTransaction(100);
		expected.setAmountReconciliation(100);
		expected.setAmountCardholderBilling(100);
		expected.setFunctionCode(200);
		expected.setDataRecord("teste");
		MsgBuilder<MsgIpm> msgIpmBuilder = new MsgBuilder(MsgIpm.class, Encode.ASCII);
		buf = msgIpmBuilder.pack(expected);
		System.out.println(new String(buf, Encode.ASCII.getName()));
		actual = MsgIpmBuilder.unpack(buf);
		assertEquals(actual.getMessageTypeIdentifier().longValue(), expected.getMessageTypeIdentifier().longValue());
		assertEquals(actual.getPrimaryAccountNumber(), expected.getPrimaryAccountNumber());
		assertEquals(actual.getProcessingCode(), expected.getProcessingCode());
		assertEquals(actual.getAmountTransaction().longValue(), expected.getAmountTransaction().longValue());
		assertEquals(actual.getAmountReconciliation().longValue(), expected.getAmountReconciliation().longValue());
		assertEquals(actual.getAmountCardholderBilling().longValue(), expected.getAmountCardholderBilling().longValue());
		assertEquals(actual.getFunctionCode().longValue(), expected.getFunctionCode().longValue());
	}

//	@Test
//	public void testGerarArquivo() {
//		try(DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\Users\\uesr\\Desktop\\asdf.ipm"))) {
//			MsgIpm expected = new MsgIpm();
//			expected.setMessageTypeIdentifier(1240);
//			expected.setPrimaryAccountNumber("5412345678909283");
//			expected.setProcessingCode(003000);
//			expected.setAmountTransaction(100);
//			expected.setAmountReconciliation(100);
//			expected.setAmountCardholderBilling(100);
//			expected.setFunctionCode(200);
//			expected.setDataRecord("teste");
//			MsgIpmBuilder<MsgIpm> MsgIpmBuilder = new MsgIpmBuilder(MsgIpm.class, Encode.EBCDIC);
//			byte[] buf = MsgIpmBuilder.pack(expected);
//			out.writeInt(buf.length);
//			out.write(buf);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//	@Test
//	public void testLerArquivo() {
//		try(DataInputStream in = new DataInputStream(new FileInputStream("C:\\Users\\uesr\\Desktop\\asdf.ipm"))) {
//			MsgIpmBuilder<MsgIpm> MsgIpmBuilder = new MsgIpmBuilder<>(MsgIpm.class, Encode.EBCDIC);
//			for (int len = in.readInt(); 0 < len; len = in.readInt()) {
//				byte[] array = new  byte[len];
//				in.read(array);
//				MsgIpm MsgIpm = MsgIpmBuilder.unpack(array);
//				System.out.println(MsgIpm.toString());
//			}
//		} catch (EOFException e) {
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		} catch (InvocationTargetException e) {
//			e.printStackTrace();
//		} catch (NoSuchMethodException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		} catch (NotFoundMTIException e) {
//			e.printStackTrace();
//		}
//	}

}

