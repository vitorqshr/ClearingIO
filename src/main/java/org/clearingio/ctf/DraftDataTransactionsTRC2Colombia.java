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
	@Field(at = 16, length = 3, literal = "CO", rid = true)
})
public class DraftDataTransactionsTRC2Colombia {

	@Field(at = 0, length = 2, regex = "(05|06|07|15|16|17|25|26|27|35|36|37)", rid = true)
	private String transactionCode;

	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 12)
	private String nationalNetSalesTaxAmount;

	@Field(at = 19, length = 1)
	private String nationalNetOtherAmountType;

	@Field(at = 20, length = 1)
	private String nationalNetImpactType;

	@Field(at = 21, length = 12, align = Align.RIGHT, padding = '0')
	private Long nationalNetOtherAmount;

	@Field(at = 33, length = 12, align = Align.RIGHT, padding = '0')
	private Long nationalNetIRFCalculationBaseAmount;

	@Field(at = 45, length = 22, align = Align.RIGHT, padding = '0')
	private Long nationalReference;

	@Field(at = 67, length = 8, align = Align.RIGHT, padding = '0')
	private Long nationalMerchantCode;

	@Field(at = 75, length = 9, align = Align.RIGHT, padding = '0')
	private Long miscellaneousAmount;

	@Field(at = 84, length = 2, align = Align.RIGHT, padding = '0')
	private Long nationalReasonCollectionCode;

	@Field(at = 86, length = 1, align = Align.RIGHT, padding = '0')
	private Long nationalCaptureIndicatorCode;

	@Field(at = 87, length = 8, align = Align.RIGHT, padding = '0')
	private Long amountBaseofAddValueTaxtoReturn;

	@Field(at = 95, length = 9, align = Align.RIGHT, padding = '0')
	private Long consumptionTaxAmount;

	@Field(at = 104, length = 9, align = Align.RIGHT, padding = '0')
	private Long addValueTaxAmount;

	@Field(at = 113, length = 1, align = Align.RIGHT, padding = '0')
	private Long costTransactionIndicator;

	@Field(at = 114, length = 1, align = Align.RIGHT, padding = '0')
	private Long emvTransactionIndicator;

	@Field(at = 115, length = 1, align = Align.RIGHT, padding = '0')
	private Long nationalCashbackIndicator;

	@Field(at = 116, length = 2)
	private String nationalChargebackReasonCode;

	@Field(at = 118, length = 50)
	private String nationalNetDomesticToken;

}
