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
	@Field(at = 3, length = 1, literal = "0", rid = true)
})
public class RetrievalRequestRecordTransactionsTCR0 {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 16, align = Align.RIGHT, padding = '0')
	private Long accountNumber;

	@Field(at = 20, length = 3, align = Align.RIGHT, padding = '0')
	private Long accountNumberExtension;

	@Field(at = 23, length = 23)
	private String acquirerReferenceNumber;

	@Field(at = 46, length = 8, align = Align.RIGHT, padding = '0')
	private Long acquirersBusinessID;

	@Field(at = 54, length = 4, align = Align.RIGHT, padding = '0')
	private Long purchaseDate;

	@Field(at = 58, length = 12, align = Align.RIGHT, padding = '0')
	private Long transactionAmount;

	@Field(at = 70, length = 3, align = Align.RIGHT, padding = '0')
	private Long transactionCurrencyCode;

	@Field(at = 73, length = 25)
	private String merchantName;

	@Field(at = 98, length = 13)
	private String merchantCity;

	@Field(at = 111, length = 3)
	private String merchantCountryCode;

	@Field(at = 114, length = 4, align = Align.RIGHT, padding = '0')
	private Long merchantCategoryCode;

	@Field(at = 118, length = 5, align = Align.RIGHT, padding = '0')
	private Long usMerchantZIPCode;

	@Field(at = 123, length = 3)
	private String merchantStateProvinceCode;

	@Field(at = 126, length = 9, align = Align.RIGHT, padding = '0')
	private Long issuerControlNumber;

	@Field(at = 135, length = 2, align = Align.RIGHT, padding = '0')
	private Long requestReasonCode;

	@Field(at = 137, length = 1, align = Align.RIGHT, padding = '0')
	private Long settlementFlag;

	@Field(at = 138, length = 12, align = Align.RIGHT, padding = '0')
	private Long nationalReimbursementFee;

	@Field(at = 150, length = 1)
	private String accountSelection;

	@Field(at = 151, length = 12)
	private String retrievalRequestID;

	@Field(at = 163, length = 4, align = Align.RIGHT, padding = '0')
	private Long centralProcessingDate;

	@Field(at = 167, length = 1, align = Align.RIGHT, padding = '0')
	private Long reimbursementAttribute;
}
