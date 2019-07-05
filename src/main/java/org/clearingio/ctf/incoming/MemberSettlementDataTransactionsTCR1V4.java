package org.clearingio.ctf.incoming;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Getter
@Setter
@ToString
@Record
@Fields({
		@Field(at = 0, length = 2, literal = "46", rid = true, name = "Transaction Code"),
		@Field(at = 2, length = 1, literal = "0", rid = true, name = "Transaction Code Qualifer"),
		@Field(at = 3, length = 1, literal = "1", rid = true, name = "Transaction Component Sequence Number")
})
public class MemberSettlementDataTransactionsTCR1V4 {

	@Field(at = 4, length = 7)
	 private String currencyTableDate;

	@Field(at = 11, length = 15)
	private String firstCount;

	@Field(at = 26, length = 15)
	private String secondCount;

	@Field(at = 41, length = 15)
	private String firstAmount;

	@Field(at = 56, length = 2, regex = "(DB|CR|  )")
	private String firstAmountSign;

	@Field(at = 58, length = 15)
	private String secondAmount;

	@Field(at = 73, length = 2, regex = "(DB|CR|  )")
	private String secondAmountSign;

	@Field(at = 75, length = 15)
	private String thirdAmount;

	@Field(at = 90, length = 2, regex = "(DB|CR|  )")
	private String thirdAmountSign;

	@Field(at = 92, length = 15)
	private String fourthAmount;

	@Field(at = 107, length = 2, regex = "(DB|CR|  )")
	private String fourthAmountSign;

	@Field(at = 109, length = 15)
	private String fifthAmount;

	@Field(at = 124, length = 2, regex = "(DB|CR|  )")
	private String fifthAmountSign;

	@Field(at = 126, length = 15)
	private String sixthAmount;

	@Field(at = 141, length = 2, regex = "(DB|CR|  )")
	private String sixthAmountSign;

	@Field(at = 143, length = 25)
	private String reserved;
}
