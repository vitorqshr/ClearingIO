package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 3, length = 1, literal = "2", rid = true),
	@Field(at = 16, length = 3, literal = "JP", rid = true)
})
public class DraftDataTransactionsTRC2Japan {

	@Field(at = 0, length = 2, regex = "(05|06|07|25|26|27)", rid = true)
	private String transactionCode;

	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 1)
	private String numberofBonusPayments;

	@Field(at = 5, length = 1)
	private String bonusMonthSign;

	@Field(at = 6, length = 4, align = Align.RIGHT, padding = '0')
	private Long bonusAmount;

	@Field(at = 10, length = 4, align = Align.RIGHT, padding = '0')
	private Long nationalNetCPDofOriginal;

	@Field(at = 14, length = 2)
	private String reserved1;

	@Field(at = 19, length = 3, align = Align.RIGHT, padding = '0')
	private Long numberofInstallmentPayments;

	@Field(at = 22, length = 2, align = Align.RIGHT, padding = '0')
	private Long paymentMode;

	@Field(at = 24, length = 1)
	private String reserved2;

	@Field(at = 25, length = 8, align = Align.RIGHT, padding = '0')
	private Long netSalesAmount;

	@Field(at = 33, length = 8, align = Align.RIGHT, padding = '0')
	private Long taxandMailingCharge;

	@Field(at = 41, length = 17, align = Align.RIGHT, padding = '0')
	private Long salesDraftReferenceNumber;

	@Field(at = 58, length = 15)
	private String acquiringBankMerchantNumber;

	@Field(at = 73, length = 23)
	private String merchantNameKatakana;

	@Field(at = 96, length = 2)
	private String nationalChargebackReasonCode;

	@Field(at = 98, length = 40)
	private String merchantNameKanji;

	@Field(at = 138, length = 1, align = Align.RIGHT, padding = '0')
	private Long netGrossFlag;

	@Field(at = 139, length = 20)
	private String textMessage;

	@Field(at = 159, length = 8, align = Align.RIGHT, padding = '0')
	private Long acquirersInvoiceAmount;

	@Field(at = 167, length = 1, align = Align.RIGHT, padding = '0')
	private Long bonusCode;

}
