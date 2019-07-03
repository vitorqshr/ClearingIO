package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 3, length = 1, literal = "3", rid = true),
	@Field(at = 16, length = 2, literal = "FL", rid = true)
})
public class DraftDataTransactionsTRC3IndustrySpecificDataFL {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 12)
	private String reserved1;

	@Field(at = 18, length = 8)
	private String reserved2;

	@Field(at = 26, length = 1)
	private String expandedFuelType;

	@Field(at = 27, length = 2)
	private String typeofPurchase;

	@Field(at = 29, length = 1)
	private String fuelType;

	@Field(at = 30, length = 12, align = Align.RIGHT, padding = '0')
	private Long unitofMeasure;

	@Field(at = 42, length = 12, align = Align.RIGHT, padding = '0')
	private Long quantity;

	@Field(at = 54, length = 12, align = Align.RIGHT, padding = '0')
	private Long unitCost;

	@Field(at = 66, length = 12, align = Align.RIGHT, padding = '0')
	private Long grossFuelPrice;

	@Field(at = 78, length = 12, align = Align.RIGHT, padding = '0')
	private Long netFuelPrice;

	@Field(at = 90, length = 12, align = Align.RIGHT, padding = '0')
	private Long grossNonFuelPrice;

	@Field(at = 102, length = 7)
	private String netNonFuelPrice;

	@Field(at = 109, length = 4, align = Align.RIGHT, padding = '0')
	private Long odometerReading;

	@Field(at = 113, length = 12, align = Align.RIGHT, padding = '0')
	private Long vatTaxRate;

	@Field(at = 125, length = 12)
	private String miscellaneousFuelTax;
	@Field(at = 137, length = 12, align = Align.RIGHT, padding = '0')
	private Long productQualifer;

	@Field(at = 149, length = 1)
	private String reserved3;

	@Field(at = 150, length = 1)
	private String miscellaneousNonFuelTax;

	@Field(at = 151, length = 1)
	private String serviceType;

	@Field(at = 152, length = 16)
	private String miscellaneousFuelTaxExemptionStatus;

}
