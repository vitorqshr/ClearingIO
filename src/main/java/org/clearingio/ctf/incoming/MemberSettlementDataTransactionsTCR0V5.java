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
	@Field(at = 59, length = 1, literal = "5", rid = true, name = "Report Subgroup")
})
public class MemberSettlementDataTransactionsTCR0V5 {
	@Field(at = 4, length = 6)
	private String destinationBin;

	@Field(at = 10, length = 6)
	private String sourceBin;

	@Field(at = 16, length = 10)
	private String reportingForSreIdentifier;

	@Field(at = 26, length = 10)
	private String recapForSreIdentifier;

	@Field(at = 36, length = 3)
	private String settlementServiceIdentifier;

	@Field(at = 39, length = 3)
	private String settlementCurrencyCode;

	@Field(at = 42, length = 1)
	private String businessMode;

	@Field(at = 43, length = 1)
	private String noDataIndicator;

	@Field(at = 44, length = 14)
	private String reserved;

	@Field(at = 60, length = 3)
	private String reportIdentificationNumber;

	@Field(at = 63, length = 2)
	private String reportIdentificationSuffix;

	@Field(at = 65, length = 7)
	private String settlementDate;

	@Field(at = 72, length = 7)
	private String reportDate;

	@Field(at = 79, length = 15)
	private String totalInterchangeCount;

	@Field(at = 94, length = 15)
	private String totalInterchangeValue;

	@Field(at = 109, length = 2)
	private String interchangeValueSign;

	@Field(at = 111, length = 15)
	private String totalReimburesementFees;

	@Field(at = 126, length = 2)
	private String reimbursementFeesSign;

	@Field(at = 128, length = 15)
	private String totalVisaCharges;

	@Field(at = 143, length = 2)
	private String visaChargesSign;

	@Field(at = 145, length = 15)
	private String netSettlementAmount;

	@Field(at = 160, length = 2)
	private String netSettlementAmountSign;

	@Field(at = 162, length = 2)
	private String summaryLevel;

	@Field(at = 164, length = 3)
	private String reserved1;

	@Field(at = 167, length = 1)
	private String reimbursementAttribute;
}
