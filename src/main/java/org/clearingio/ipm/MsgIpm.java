package org.clearingio.ipm;

import org.clearingio.iso8583.Msg;

import java.math.BigInteger;

public class MsgIpm extends Msg {

	public void setProcessingCode(String cardholderTransactionType, String cardholderFromAccountTypeCode, String cardholderToAccountTypeCode) {
		String processingCode = cardholderTransactionType + cardholderFromAccountTypeCode + cardholderToAccountTypeCode;
		super.setProcessingCode(processingCode);
	}

	public String getProcessingCodeCardholderTransactionType() {
		return this.getProcessingCode().substring(0, 2);
	}

	public String getProcessingCodeCardholderFromAccountTypeCode() {
		return this.getProcessingCode().substring(2, 4);
	}

	public String getProcessingCodeCardholderToAccountTypeCode() {
		return this.getProcessingCode().substring(4);
	}

//	public void setCardAcceptorNameLocation(String cardAcceptorName, String cardAcceptorStreetAddress, String cardAcceptorCity, String Card Acceptor Postal (ZIP) Code  ) {
//		String cardAcceptorNameLocation = cardAcceptorName + '\\' + cardAcceptorStreetAddress + '\\' + cardAcceptorCity + '\\' +
//		super.setCardAcceptorNameLocation();
//	}
}
