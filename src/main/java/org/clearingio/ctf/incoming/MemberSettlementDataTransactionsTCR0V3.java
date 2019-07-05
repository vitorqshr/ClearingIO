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
	@Field(at = 59, length = 1, literal = "3", rid = true, name = "Report Subgroup")
})
public class MemberSettlementDataTransactionsTCR0V3 {
	@Field(at = 4, length = 6)
	private String destinationBin;

	@Field(at = 10, length = 6)
	private String sourceBin;

	@Field(at = 16, length = 10)
	private String reportingForSreIdentifier;

	@Field(at = 26, length = 10)
	private String rollUpToSreIdentifier;

	@Field(at = 36, length = 10)
	private String fundsTransferSreIdentifier;

	@Field(at = 46, length = 3, align = Align.RIGHT, padding = '0')
	private String settlementServiceIdentifier;

	@Field(at = 49, length = 3)
	private String settlementCurrencyCode;

	@Field(at = 52, length = 1)
	private String amountType;

	@Field(at = 53, length = 1)
	private String businessMode;

	@Field(at = 54, length = 1)
	private String noDataIndicator;

	@Field(at = 55, length = 1)
	private String summaryLevel;

	@Field(at = 56, length = 2)
	private String jurisdiction;

	@Field(at = 60, length = 3)
	private String reportIdentificationNumber;

	@Field(at = 63, length = 2)
	private String reportIdentificationSuffix;

	@Field(at = 65, length = 7)
	private String settlementDate;

	@Field(at = 72, length = 7)
	private String reportDate;

	@Field(at = 79, length = 7)
	private String fromDate;

	@Field(at = 86, length = 7)
	private String toDate;

	@Field(at = 93, length = 3)
	private String businessTransactionType;

	@Field(at = 96, length = 1)
	private String businessTransactionCycle;

	@Field(at = 97, length = 1)
	private String reversalIndicator;

	@Field(at = 98, length = 11)
	private String creditsCount;

	@Field(at = 109, length = 15)
	private String creditsAmount;

	@Field(at = 124, length = 11)
	private String debitsCount;

	@Field(at = 135, length = 15)
	private String debitsAmount;

	@Field(at = 150, length = 15)
	private String totalAmount;

	@Field(at = 165, length = 2)
	private String totalAmountSign;

	@Field(at = 167, length = 1)
	private String reimbursementAttribute;
}
