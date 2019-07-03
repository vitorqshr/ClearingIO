package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.builder.Align;

import java.time.LocalDate;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, regex = "(05|06|15|16|25|26|35|36)", rid = true),
	@Field(at = 3, length = 1, literal = "3", rid = true),
	@Field(at = 16, length = 2, literal = "LG", rid = true)
})
public class DraftDataTransactionsTRC3IndustrySpecificDataLG {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 12)
	private String reserved1;

	@Field(at = 18, length = 8)
	private String reserved2;

	@Field(at = 26, length = 1)
	private String lodgingNoShowIndicator;

	@Field(at = 27, length = 6, align = Align.RIGHT, padding = '0')
	private Long lodgingExtraCharges;

	@Field(at = 33, length = 4)
	private String reserved3;

	@Field(at = 37, length = 6, format = "yyMMdd")
	private LocalDate lodgingCheckinDate;

	@Field(at = 43, length = 12, align = Align.RIGHT, padding = '0')
	private Long dailyRoomRate;

	@Field(at = 55, length = 12, align = Align.RIGHT, padding = '0')
	private Long totalTax;

	@Field(at = 67, length = 12, align = Align.RIGHT, padding = '0')
	private Long prepaidExpenses;

	@Field(at = 79, length = 12, align = Align.RIGHT, padding = '0')
	private Long foodBeverageCharges;

	@Field(at = 91, length = 12, align = Align.RIGHT, padding = '0')
	private Long folioCashAdvances;

	@Field(at = 103, length = 2, align = Align.RIGHT, padding = '0')
	private Long roomNights;

	@Field(at = 105, length = 12, align = Align.RIGHT, padding = '0')
	private Long totalRoomTax;

	@Field(at = 117, length = 51)
	private String reserved4;

}
