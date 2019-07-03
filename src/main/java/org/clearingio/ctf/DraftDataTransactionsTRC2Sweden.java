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
	@Field(at = 16, length = 3, literal = "SE", rid = true)
})
public class DraftDataTransactionsTRC2Sweden {

	@Field(at = 0, length = 2, regex = "(05|06|07|15|16|17|25|26|27|35|36|37)", rid = true)
	private String transactionCode;

	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 12)
	private String reserved1;

	@Field(at = 19, length = 12, align = Align.RIGHT, padding = '0')
	private Long nationalTax;

	@Field(at = 31, length = 1)
	private String reserved2;

	@Field(at = 32, length = 2)
	private String paymentIndicator;

	@Field(at = 34, length = 15, align = Align.RIGHT, padding = '0')
	private Long nationalMerchantID;

	@Field(at = 49, length = 25)
	private String merchantName;

	@Field(at = 74, length = 13)
	private String merchantCity;

	@Field(at = 87, length = 30)
	private String departmentID;

	@Field(at = 117, length = 51)
	private String reserved3;

}
