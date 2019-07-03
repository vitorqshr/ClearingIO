package org.clearingio.ctf.incoming;


import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;

import org.beanio.annotation.Fields;

import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, literal = "46", rid = true),
	@Field(at = 3, length = 1, literal = "0", rid = true),
	@Field(at = 59, length = 1, literal = "7", rid = true)
})
public class MemberSettlementDataTransactionsTCR0V7 {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifier;

	@Field(at = 4, length = 6)
	private String destinationBin;

	@Field(at = 10, length = 6)
	private String sourceBin;

	@Field(at = 16, length = 3)
	private String settlementServiceIdentifier;

	@Field(at = 19, length = 3)
	private String settlementCurrencyCode;

	@Field(at = 22, length = 7)
	private String settlementDate;

	@Field(at = 29, length = 7)
	private String reportDate;

	@Field(at = 36, length = 10)
	private String fundsTransferSre;

	@Field(at = 46, length = 1)
	private String noDataIndicator;

	@Field(at = 47, length = 10)
	private String reportingForSre;

	@Field(at = 57, length = 1)
	private String reserved;

	@Field(at = 58, length = 1)
	private String reportGroup;

	@Field(at = 60, length = 3)
	private String reportIdentificationNumber;

	@Field(at = 63, length = 2)
	private String reportIdentificationSuffix;

	@Field(at = 65, length = 1)
	private String amountType;

	@Field(at = 66, length = 15)
	private String creditAmount;

	@Field(at = 81, length = 15)
	private String debitAmount;

	@Field(at = 96, length = 15)
	private String netAmount;

	@Field(at = 111, length = 2)
	private String netAmountSign;

	@Field(at = 113, length = 15)
	private String visaChargesProcessingFee;

	@Field(at = 128, length = 2)
	private String visaChargesProcessingFeeSign;

	@Field(at = 130, length = 15)
	private String count;

	@Field(at = 145, length = 15)
	private String netAmountInSettlementCurrency;

	@Field(at = 160, length = 2)
	private String netAmountInSettlementCurrencySign;

	@Field(at = 162, length = 3)
	private String settlementBalancingCurrencyCode;

	@Field(at = 165, length = 2)
	private String reserved1;

	@Field(at = 167, length = 1)
	private String reimbursemetAttribute;
}
