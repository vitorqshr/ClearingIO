package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.builder.Align;

import java.util.Date;

@Getter
@Setter
@Fields({
	@Field(at = 3, length = 1, literal = "3", rid = true),
	@Field(at = 16, length = 2, literal = "CA", rid = true)
})
public class DraftDataTransactionsTRC3IndustrySpecificDataCA {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 12)
	private String reserved1;

	@Field(at = 18, length = 2, align = Align.RIGHT, padding = '0')
	private Long daysRented;

	@Field(at = 20, length = 6)
	private String reserved2;

	@Field(at = 26, length = 1)
	private String carRentalNoShowIndicator;

	@Field(at = 27, length = 6, align = Align.RIGHT, padding = '0')
	private Long carRentalExtraCharges;

	@Field(at = 33, length = 4)
	private String reserved3;

	@Field(at = 37, length = 6, format = "yyMMdd")
	private Date carRentalCheckoutDate;

	@Field(at = 43, length = 12, align = Align.RIGHT, padding = '0')
	private Long dailyRentalRate;

	@Field(at = 55, length = 12, align = Align.RIGHT, padding = '0')
	private Long weeklyRentalRate;

	@Field(at = 67, length = 12, align = Align.RIGHT, padding = '0')
	private Long insuranceCharges;

	@Field(at = 79, length = 12, align = Align.RIGHT, padding = '0')
	private Long fuelCharges;

	@Field(at = 91, length = 2)
	private String carClassCode;

	@Field(at = 93, length = 12, align = Align.RIGHT, padding = '0')
	private Long oneWayDropoffCharges;

	@Field(at = 105, length = 40)
	private String renterName;

	@Field(at = 145, length = 23)
	private String reserved4;

}
