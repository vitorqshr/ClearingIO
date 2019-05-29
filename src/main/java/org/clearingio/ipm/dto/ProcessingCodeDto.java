package org.clearingio.ipm.dto;

public class ProcessingCodeDto {

	private String cardholderTransactionType;

	private String cardholderFromAccountTypeCode;

	private String cardholderToAccountTypeCode;

	public String getCardholderTransactionType() {
		return cardholderTransactionType;
	}

	public void setCardholderTransactionType(String cardholderTransactionType) {
		this.cardholderTransactionType = cardholderTransactionType;
	}

	public String getCardholderFromAccountTypeCode() {
		return cardholderFromAccountTypeCode;
	}

	public void setCardholderFromAccountTypeCode(String cardholderFromAccountTypeCode) {
		this.cardholderFromAccountTypeCode = cardholderFromAccountTypeCode;
	}

	public String getCardholderToAccountTypeCode() {
		return cardholderToAccountTypeCode;
	}

	public void setCardholderToAccountTypeCode(String cardholderToAccountTypeCode) {
		this.cardholderToAccountTypeCode = cardholderToAccountTypeCode;
	}
}
