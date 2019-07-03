package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, regex = "(05|06|07|15|16|17|25|26|27|35|36|37)", rid = true),
	@Field(at = 3, length = 1, literal = "6", rid = true)
})
public class DraftDataTransactionsTRC6LimitedUseData {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 12, align = Align.RIGHT, padding = '0')
	private Long localTax;

	@Field(at = 16, length = 1, align = Align.RIGHT, padding = '0')
	private Long localTaxIncluded;

	@Field(at = 17, length = 12, align = Align.RIGHT, padding = '0')
	private Long nationalTax;

	@Field(at = 29, length = 1, align = Align.RIGHT, padding = '0')
	private Long NationalTaxIncluded;

	@Field(at = 30, length = 20)
	private String merchantVATRegistrationSingleBusinessReferenceNumber;

	@Field(at = 50, length = 13)
	private String customerVATRegistrationNumber;

	@Field(at = 63, length = 12)
	private String reserved1;

	@Field(at = 75, length = 4)
	private String summaryCommodityCode;

	@Field(at = 79, length = 12, align = Align.RIGHT, padding = '0')
	private Long otherTax;

	@Field(at = 91, length = 15)
	private String messageIdentifer;

	@Field(at = 106, length = 4)
	private String timeofPurchase;

	@Field(at = 110, length = 17)
	private String customerCodeCustomerReferenceIdentifer;

	@Field(at = 127, length = 2)
	private String nonFuelProductCode1;

	@Field(at = 129, length = 2)
	private String nonFuelProductCode2;

	@Field(at = 131, length = 2)
	private String nonFuelProductCode3;

	@Field(at = 133, length = 2)
	private String nonFuelProductCode4;

	@Field(at = 135, length = 2)
	private String nonFuelProductCode5;

	@Field(at = 137, length = 2)
	private String nonFuelProductCode6;

	@Field(at = 139, length = 2)
	private String nonFuelProductCode7;

	@Field(at = 141, length = 2)
	private String nonFuelProductCode8;

	@Field(at = 143, length = 11)
	private String merchantPostalCode;

	@Field(at = 154, length = 14)
	private String reserved2;

}
