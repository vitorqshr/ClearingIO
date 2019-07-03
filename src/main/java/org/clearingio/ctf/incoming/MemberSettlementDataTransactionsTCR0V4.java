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
	@Field(at = 58, length = 1, literal = "V", rid = true),
	@Field(at = 59, length = 1, literal = "4", rid = true)
})
public class MemberSettlementDataTransactionsTCR0V4 {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifier;

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

	@Field(at = 52, length = 3)
	private String clearingCurrencyCode;

	@Field(at = 55, length = 1)
	private String businessMode;

	@Field(at = 56, length = 1)
	private String noDataIndicator;

	@Field(at = 57, length = 1)
	private String reserved;

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
	private String chargeTypeCode;

	@Field(at = 96, length = 3)
	private String businessTransactionType;

	@Field(at = 99, length = 1)
	private String businessTransactionCycle;

	@Field(at = 100, length = 1)
	private String reversalIndicator;

	@Field(at = 101, length = 1)
	private String returnIndicator;

	@Field(at = 102, length = 2)
	private String jurisdictionCode;

	@Field(at = 104, length = 1)
	private String interregionalRoutingIndicator;

	@Field(at = 105, length = 3)
	private String sourceCountryCode;

	@Field(at = 108, length = 3)
	private String destinationCountryCode;

	@Field(at = 111, length = 2)
	private String sourceRegionCode;

	@Field(at = 113, length = 2)
	private String destinationRegionCode;

	@Field(at = 115, length = 16)
	private String feeLevelDescriptor;

	@Field(at = 131, length = 1)
	private String crDbNetIndicator;

	@Field(at = 132, length = 2)
	private String summaryLevel;

	@Field(at = 134, length = 2)
	private String reserved1;

	@Field(at = 136, length = 31)
	private String reserved2;

	@Field(at = 167, length = 1)
	private String reimbursementAttribute;
}
