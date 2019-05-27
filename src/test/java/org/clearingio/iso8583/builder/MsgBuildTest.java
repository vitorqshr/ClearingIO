package org.clearingio.iso8583.builder;

import org.clearingio.iso8583.annotation.enumeration.Encode;
import static org.junit.Assert.*;
import org.junit.Test;

public class MsgBuildTest {

	@Test
	public void testCreateMsgPackAndUnPack() throws Exception {
		Msg expected = new Msg();
		expected.setMessageTypeIdentifier(1240);
		expected.setPrimaryAccountNumber("5412345678909283");
		expected.setProcessingCode(003000);
		expected.setAmountTransaction(100);
		expected.setAmountReconciliation(100);
		expected.setAmountCardholderBilling(100);
		expected.setFunctionCode(200);
		expected.setDataRecord("teste");
		MsgBuilder<Msg> msgBuilder = new MsgBuilder(Msg.class, Encode.ASCII);
		byte[] buf = msgBuilder.pack(expected);
		System.out.println(new String(buf, Encode.ASCII.getName()));
		Msg actual = msgBuilder.unpack(buf);
		assertEquals(actual.getMessageTypeIdentifier().longValue(), expected.getMessageTypeIdentifier().longValue());
		assertEquals(actual.getPrimaryAccountNumber(), expected.getPrimaryAccountNumber());
		assertEquals(actual.getProcessingCode().longValue(), expected.getProcessingCode().longValue());
		assertEquals(actual.getAmountTransaction().longValue(), expected.getAmountTransaction().longValue());
		assertEquals(actual.getAmountReconciliation().longValue(), expected.getAmountReconciliation().longValue());
		assertEquals(actual.getAmountCardholderBilling().longValue(), expected.getAmountCardholderBilling().longValue());
		assertEquals(actual.getFunctionCode().longValue(), expected.getFunctionCode().longValue());
		assertEquals(actual.getDataRecord(), expected.getDataRecord());
	}

}

