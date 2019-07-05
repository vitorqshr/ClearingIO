package org.clearingio.ctf.incoming;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Field;

import org.beanio.annotation.Fields;

import org.beanio.annotation.Record;
import org.beanio.builder.Align;

@Getter
@Setter
@ToString
@Record
@Fields({
	@Field(at = 0, length = 2, literal = "46", rid = true, name = "Transaction Code"),
	@Field(at = 2, length = 1, literal = "0", rid = true, name = "Transaction Code Qualifer"),
	@Field(at = 3, length = 1, literal = "0", rid = true, name = "Transaction Component Sequence Number"),
	@Field(at = 58, length = 1, literal = "V", rid = true, name = "Report Group"),
	@Field(at = 59, length = 1, literal = "6", rid = true, name = "Report Subgroup")
})
public class MemberSettlementDataTransactionsTCR0V6 {
	@Field(at = 4, length = 6)
	private String destinationBin;

	@Field(at = 10, length = 6)
	private String sourceBin;

	@Field(at = 16, length = 10)
	private String reportingForSreIdentifier;

	@Field(at = 26, length = 10)
	private String processorIdentifier;

	@Field(at = 36, length = 10)
	private String clearingBin;

	@Field(at = 46, length = 3)
	private String clearingCurrencyCode;

	@Field(at = 49, length = 3)
	private String settlementServiceIdentifier;

	@Field(at = 52, length = 1)
	private String businessMode;

	@Field(at = 53, length = 1)
	private String noDataIndicator;

	@Field(at = 54, length = 4)
	private String reserved;

	@Field(at = 58, length = 1)
	private String reportGroup;

	@Field(at = 60, length = 3)
	private String reportIdentificationNumber;

	@Field(at = 63, length = 2)
	private String reportIdentificationSuffix;

	@Field(at = 65, length = 7)
	private String settlementDate;

	@Field(at = 72, length = 7)
	private String reportDate;

	@Field(at = 79, length = 1)
	private String financialIndicator;

	@Field(at = 80, length = 1)
	private String clearingOnlyIndicator;

	@Field(at = 81, length = 3)
	private String businessTransactionType;

	@Field(at = 84, length = 1)
	private String businessTransactionCycle;

	@Field(at = 85, length = 1)
	private String reversalIndicator;

	@Field(at = 86, length = 2)
	private String transactionDisposition;

	@Field(at = 88, length = 15)
	private String count;

	@Field(at = 103, length = 15)
	private String amount;

	@Field(at = 118, length = 2)
	private String amountSign;

	@Field(at = 120, length = 2)
	private String summaryLevel;

	@Field(at = 122, length = 7)
	private String crsDate;

	@Field(at = 129, length = 15)
	private String interchangeReimbursementFees;

	@Field(at = 144, length = 2)
	private String interchangeReimbursementFeesSign;

	@Field(at = 146, length = 15)
	private String paymentAmount;

	@Field(at = 161, length = 2)
	private String paymentAmountSign;

	@Field(at = 163, length = 3)
	private String paymentModeSettlementType;

	@Field(at = 166, length = 1)
	private String installmentPaymentIndicator;

	@Field(at = 167, length = 1)
	private String reimbursementAttribute;
}
