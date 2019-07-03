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
	@Field(at = 16, length = 3, literal = "KR", rid = true)
})
public class DraftDataTransactionsTRC2SouthKorea {

	@Field(at = 0, length = 2, regex = "(05|06|07|15|16|17|25|26|27|35|36|37)", rid = true)
	private String transactionCode;

	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 12)
	private String reserved1;

	@Field(at = 19, length = 3)
	private String reserved2;

	@Field(at = 22, length = 1, align = Align.RIGHT, padding = '0')
	private Long paymentCode;

	@Field(at = 23, length = 2, align = Align.RIGHT, padding = '0')
	private Long numberofPayments;

	@Field(at = 25, length = 3, align = Align.RIGHT, padding = '0')
	private Long merchantDiscountRate;

	@Field(at = 28, length = 32)
	private String merchantNameKorean;

	@Field(at = 60, length = 12)
	private String merchantLocationKorean;

	@Field(at = 72, length = 10)
	private String reserved3;

	@Field(at = 82, length = 4, align = Align.RIGHT, padding = '0')
	private Long merchantType;

	@Field(at = 86, length = 8, align = Align.RIGHT, padding = '0')
	private Long localAuthorizationNumber;

	@Field(at = 94, length = 2)
	private String localChargebackReasonCode;

	@Field(at = 96, length = 2, align = Align.RIGHT, padding = '0')
	private Long interchangeReimbursementFeeMultiplier;

	@Field(at = 98, length = 8, align = Align.RIGHT, padding = '0')
	private Long purchaseDate;

	@Field(at = 106, length = 15, align = Align.RIGHT, padding = '0')
	private Long merchantID;

	@Field(at = 121, length = 2, align = Align.RIGHT, padding = '0')
	private Long paymentMethod;

	@Field(at = 123, length = 2)
	private String cardTypeLocal;

	@Field(at = 125, length = 43)
	private String reserved4;

}
