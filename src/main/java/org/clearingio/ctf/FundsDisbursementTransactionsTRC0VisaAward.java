package org.clearingio.ctf;


import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;

import org.beanio.annotation.Fields;

import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, literal = "20", rid = true),
	@Field(at = 2, length = 1, literal = "1", rid = true),
	@Field(at = 3, length = 1, literal = "0", rid = true)
})
public class FundsDisbursementTransactionsTRC0VisaAward {
	@Field(at = 4, length = 6, align = Align.RIGHT, padding = '0')
	private Long destinationBIN;

	@Field(at = 10, length = 6, align = Align.RIGHT, padding = '0')
	private Long sourceBIN;

	@Field(at = 16, length = 4, align = Align.RIGHT, padding = '0')
	private Long reasonCode;

	@Field(at = 20, length = 3)
	private String originatorCountryCode;

	@Field(at = 23, length = 4, align = Align.RIGHT, padding = '0')
	private Long eventDate;

	@Field(at = 27, length = 16)
	private String accountNumber;

	@Field(at = 43, length = 3)
	private String accountNumberExtension;

	@Field(at = 46, length = 12, align = Align.RIGHT, padding = '0')
	private Long destinationAmount;

	@Field(at = 58, length = 3)
	private String destinationCurrencyCode;

	@Field(at = 61, length = 12, align = Align.RIGHT, padding = '0')
	private Long sourceAmount;

	@Field(at = 73, length = 3)
	private String sourceCurrencyCode;

	@Field(at = 76, length = 25)
	private String originatorName;

	@Field(at = 101, length = 13)
	private String originatorCity;

	@Field(at = 114, length = 5)
	private String originatorZIPCode;

	@Field(at = 119, length = 3)
	private String originatorStateProvinceCode;

	@Field(at = 122, length = 14)
	private String merchantTelephoneNumber;

	@Field(at = 136, length = 10)
	private String merchantVerifcationValue;

	@Field(at = 146, length = 1, align = Align.RIGHT, padding = '0')
	private Long settlementFlag;

	@Field(at = 147, length = 15, align = Align.RIGHT, padding = '0')
	private Long transactionIdentifer;

	@Field(at = 162, length = 1)
	private String fundingSource;

	@Field(at = 163, length = 4, align = Align.RIGHT, padding = '0')
	private Long centralProcessingDate;

	@Field(at = 167, length = 1)
	private String reimbursementAttribute;
}
