package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, regex = "(06|16|26|36)", rid = true),
	@Field(at = 3, length = 1, literal = "3", rid = true),
	@Field(at = 16, length = 2, literal = "CR", rid = true)
})
public class DraftDataTransactionsTRC3IndustrySpecificDataCR {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 12)
	private String reserved1;

	@Field(at = 18, length = 2)
	private String businessFormatCode;

	@Field(at = 20, length = 1)
	private String businessApplicationID;

	@Field(at = 21, length = 2)
	private String sourceofFunds;

	@Field(at = 23, length = 16)
	private String paymentReversalReasonCode;

	@Field(at = 39, length = 34)
	private String senderReferenceNumber;

	@Field(at = 73, length = 30)
	private String senderAccountNumber;

	@Field(at = 103, length = 35)
	private String senderName;

	@Field(at = 138, length = 25)
	private String senderAddress;

	@Field(at = 163, length = 2)
	private String senderCity;

	@Field(at = 165, length = 3)
	private String senderState;

}
