package org.clearingio.ctf.incoming;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Getter
@Setter
@ToString
@Record
@Fields({
		@Field(at = 0, length = 2, literal = "46", rid = true, name = "Transaction Code"),
		@Field(at = 2, length = 1, literal = "0", rid = true, name = "Transaction Code Qualifer"),
		@Field(at = 3, length = 1, literal = "0", rid = true, name = "Transaction Component Sequence Number"),
		@Field(at = 58, length = 1, literal = "V", rid = true, name = "Report Group"),
		@Field(at = 59, length = 1, literal = "9", rid = true, name = "Report Subgroup")
})
public class MemberSettlementDataTransactionsTCR0V9 {

	@Field(at = 4, length = 6)
	private String destinationBIN;

	@Field(at = 10, length = 6)
	private String sourceBIN;

	@Field(at = 16, length = 10)
	private String reportingforSREIdentifer;

	@Field(at = 26, length = 10)
	private String rolluptoSREIdentifer;

	@Field(at = 36, length = 10)
	private String fundsTransferSREIdentifer;

	@Field(at = 46, length = 3)
	private String settlementServiceIdentifer;

	@Field(at = 49, length = 3)
	private String settlementCurrencyCode;

	@Field(at = 52, length = 1)
	private String businessMode;

	@Field(at = 53, length = 1)
	private String noDataIndicator;

	@Field(at = 54, length = 4)
	private String reserved1;

	@Field(at = 58, length = 1)
	private String reportGroup;

	@Field(at = 59, length = 1)
	private String reportSubgroup;

	@Field(at = 60, length = 3)
	private String reportIdentifcationNumber;

	@Field(at = 63, length = 2)
	private String reportIdentifcationSuffx;

	@Field(at = 65, length = 7)
	private String settlementDate;

	@Field(at = 72, length = 7)
	private String anReportDate;

	@Field(at = 79, length = 7)
	private String anFromDate;

	@Field(at = 86, length = 7)
	private String anToDate;

	@Field(at = 93, length = 3)
	private String paymentModeSettlementType;

	@Field(at = 96, length = 3)
	private String businessTransactionType;

	@Field(at = 99, length = 1)
	private String businessTransactionCycle;

	@Field(at = 100, length = 1)
	private String twicePaymentNumber;

	@Field(at = 101, length = 7)
	private String originalDateProcessingDate;

	@Field(at = 108, length = 2)
	private String summaryLevel;

	@Field(at = 110, length = 1)
	private String reversalIndicator;

	@Field(at = 111, length = 1)
	private String installPaymentIndicator;

	@Field(at = 112, length = 55)
	private String reserved2;

	@Field(at = 167, length = 1)
	private String reimbursementAttribute;
}
