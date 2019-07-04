package org.clearingio.ctf.incoming;


import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;

import org.beanio.annotation.Fields;

import org.beanio.annotation.Record;
import org.beanio.builder.Align;

@Getter
@Setter
@Record
@Fields({
	@Field(at = 3, length = 1, literal = "9", rid = true, name = "Transaction Component Sequence Number")
})
public class ReturnedItemTransactionsTRC9 {

	@Field(at = 0, length = 2, regex = "(01|02|03)", rid = true, name = "Transaction Code")
	private String transactionCode;

	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 6)
	private String destinationBIN;

	@Field(at = 10, length = 6)
	private String sourceBIN;

	@Field(at = 16, length = 2)
	private String originalTransactionCode;

	@Field(at = 18, length = 1)
	private String originalTransactionCodeQualifier;

	@Field(at = 19, length = 1)
	private String originalTransactionComponentSequenceNumber;

	@Field(at = 20, length = 5/*, format = "yyddd"*/)
	private String sourceBatchDate;

	@Field(at = 25, length = 6, align = Align.RIGHT, padding = '0')
	private String sourceBatchNumber;

	@Field(at = 31, length = 4, align = Align.RIGHT, padding = '0')
	private String itemSequenceNumber;

	@Field(at = 35, length = 3)
	private String returnReasonCode1;

	@Field(at = 38, length = 12, align = Align.RIGHT, padding = '0')
	private String originalSourceAmount;

	@Field(at = 50, length = 3, align = Align.RIGHT, padding = '0')
	private String originalSourceCurrency;

	@Field(at = 53, length = 1)
	private String originalSettlementFlag;

	@Field(at = 54, length = 1)
	private String chargebackReductionService;

	@Field(at = 55, length = 3)
	private String returnReasonCode2;

	@Field(at = 58, length = 3)
	private String returnReasonCode3;

	@Field(at = 61, length = 3)
	private String returnReasonCode4;

	@Field(at = 64, length = 3)
	private String returnReasonCode5;

	@Field(at = 67, length = 101)
	private String reserved1;
}
