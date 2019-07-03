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
	@Field(at = 58, length = 1, literal = "N", rid = true)
})
public class MemberSettlementDataTransactionsTCR0N {
	@Field(at = 4, length = 6)
	private String destinationBin;

	@Field(at = 10, length = 6)
	private String sourceBin;

	@Field(at = 16, length = 5, format = "yyDDD")
	private String centralProcString;

	@Field(at = 21, length = 3)
	private String currencyCode;

	@Field(at = 24, length = 1)
	private String reportLevel;

	@Field(at = 25, length = 2)
	private String recordType;

	@Field(at = 27, length = 1)
	private String summaryLevel;

	@Field(at = 28, length = 2)
	private String summaryTransCode;

	@Field(at = 30, length = 1)
	private String summaryTransUsage;

	@Field(at = 31, length = 5, format = "yyDDD")
	private String settlementString;

	@Field(at = 36, length = 22)
	private String reservado1;

	@Field(at = 59, length = 2)
	private String reportId;

	@Field(at = 61, length = 2)
	private String resevado2;

	@Field(at = 63, length = 15, align = Align.RIGHT, padding = '0')
	private String outgoingAmount;

	@Field(at = 78, length = 2)
	private String outgoingAmountSign;

	@Field(at = 80, length = 15, align = Align.RIGHT, padding = '0')
	private String incomingAmount;

	@Field(at = 95, length = 2)
	private String incomingAmoutSign;

	@Field(at = 97, length = 15, align = Align.RIGHT, padding = '0')
	private String netAmount;

	@Field(at = 112, length = 2)
	private String netAmountSign;

	@Field(at = 114, length = 8, align = Align.RIGHT, padding = '0')
	private String outgoingCount;

	@Field(at = 122, length = 8, align = Align.RIGHT, padding = '0')
	private String incomingCount;

	@Field(at = 130, length = 37)
	private String reservado3;

	@Field(at = 167, length = 1)
	private String attribute;

}
