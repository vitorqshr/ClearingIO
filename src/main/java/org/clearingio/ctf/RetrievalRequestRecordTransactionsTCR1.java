package org.clearingio.ctf;


import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;

import org.beanio.annotation.Fields;

import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, literal = "52", rid = true),
	@Field(at = 3, length = 1, literal = "1", rid = true)
})
public class RetrievalRequestRecordTransactionsTCR1 {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 12)
	private String reserved1;

	@Field(at = 16, length = 16)
	private String faxNumber;

	@Field(at = 32, length = 6)
	private String interfaceTraceNumber;

	@Field(at = 38, length = 1)
	private String requestedFulfllmentMethod;

	@Field(at = 39, length = 1)
	private String establishedFulfllmentMethod;

	@Field(at = 40, length = 6)
	private String issuerRFCBIN;

	@Field(at = 46, length = 7, align = Align.RIGHT, padding = '0')
	private Long issuerRFCSubAddress;

	@Field(at = 53, length = 3, align = Align.RIGHT, padding = '0')
	private Long issuerBillingCurrencyCode;

	@Field(at = 56, length = 12)
	private String issuerBillingTransactionAmount;

	@Field(at = 68, length = 15, align = Align.RIGHT, padding = '0')
	private Long transactionIdentifer;

	@Field(at = 83, length = 1)
	private String excludedTransactionIdentiferReason;

	@Field(at = 84, length = 1)
	private String crsProcessingCode;

	@Field(at = 85, length = 2, align = Align.RIGHT, padding = '0')
	private Long multipleClearingSequenceNumber;

	@Field(at = 87, length = 16)
	private String panToken;

	@Field(at = 103, length = 65)
	private String reserved2;
}
