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
public class MemberSettlementDataTransactionsTCR1V9 {
	@Field(at = 4, length = 15)
	private String firstCount;

	@Field(at = 19, length = 15)
	private String secondCount;

	@Field(at = 34, length = 15)
	private String firstAmount;

	@Field(at = 49, length = 2, regex = "(DB|CR|\\s+)")
	private String firstAmountSign;

	@Field(at = 51, length = 15)
	private String secondAmount;

	@Field(at = 66, length = 2, regex = "(DB|CR|\\s+)")
	private String secondAmountSign;

	@Field(at = 68, length = 15)
	private String thirdAmount;

	@Field(at = 83, length = 2, regex = "(DB|CR|\\s+)")
	private String thirdAmountSign;

	@Field(at = 85, length = 15)
	private String fourthAmount;

	@Field(at = 100, length = 2, regex = "(DB|CR|\\s+)")
	private String fourthAmountSign;

	@Field(at = 102, length = 15)
	private String fifthAmount;

	@Field(at = 117, length = 2, regex = "(DB|CR|\\s+)")
	private String fifthAmountSign;

	@Field(at = 119, length = 15)
	private String sixthAmount;

	@Field(at = 134, length = 2, regex = "(DB|CR|\\s+)")
	private String sixthAmountSign;

	@Field(at = 136, length = 32)
	private String reserved;
}
