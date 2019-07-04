package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;
import org.beanio.builder.Align;

@Getter
@Setter
@Record(name = "Draft Data Transactions TRC1 Additional Data")
@Fields({
	@Field(at = 3, length = 1, literal = "1", rid = true, name = "Transaction Component Sequence Number")
})
public class DraftDataTransactionsTRC1AdditionalData {

	@Field(at = 0, length = 2, regex = "(05|06|07|15|16|17|25|26|27|35|36|37)", rid = true, name = "Transaction Code")
	private String transactionCode;

	@Field(at = 2, length = 1, regex = "(0|1|2)", rid = true)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 1)
	private String businessFormatCode;

	@Field(at = 5, length = 2)
	private String tokenAssuranceLevel;

	@Field(at = 7, length = 9, align = Align.RIGHT, padding = '0')
	private Long reserved1;

	@Field(at = 16, length = 6, align = Align.RIGHT, padding = '0')
	private Long chargebackReferenceNumber;

	@Field(at = 22, length = 1)
	private String documentationIndicator;

	@Field(at = 23, length = 50)
	private String memberMessageText;

	@Field(at = 73, length = 2)
	private String specialConditionIndicators;

	@Field(at = 75, length = 3)
	private String feeProgramIndicator;

	@Field(at = 78, length = 1)
	private String issuerCharge;

	@Field(at = 79, length = 1)
	private String reserved2;
	@Field(at = 80, length = 15)
	private String cardAcceptorId;

	@Field(at = 95, length = 8)
	private String terminalId;

	@Field(at = 103, length = 12, align = Align.RIGHT, padding = '0')
	private Long nationalReimbursementFee;

	@Field(at = 115, length = 1)
	private String mailPhoneElectronicCommerceandPaymentIndicator;

	@Field(at = 116, length = 1)
	private String specialChargebackIndicator;

	@Field(at = 117, length = 4)
	private String dataConversao;

	@Field(at = 119, length = 2)
	private String reservado;

	@Field(at = 123, length = 1)
	private String acceptanceTerminalIndicator;

	@Field(at = 124, length = 1)
	private String prepaidCardIndicator;

	@Field(at = 125, length = 1)
	private String serviceDevelopmentField;

	@Field(at = 126, length = 1)
	private String avsResponseCode;

	@Field(at = 127, length = 1)
	private String authorizationSourceCode;

	@Field(at = 128, length = 1)
	private String purchaseIdentiferFormat;

	@Field(at = 129, length = 1, align = Align.RIGHT, padding = '0')
	private Long accountSelection;

	@Field(at = 130, length = 2)
	private String installmentPaymentCount;

	@Field(at = 132, length = 25, align = Align.RIGHT, padding = '0')
	private Long purchaseIdentifer;

	@Field(at = 157, length = 9, align = Align.RIGHT, padding = '0')
	private Long cashback;

	@Field(at = 166, length = 1)
	private String chipConditionCode;

	@Field(at = 167, length = 1)
	private String posEnvironment;

}
