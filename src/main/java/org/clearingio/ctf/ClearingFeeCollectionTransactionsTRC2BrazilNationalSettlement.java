package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, literal = "10", rid = true),
	@Field(at = 2, length = 1, literal = "0", rid = true),
	@Field(at = 3, length = 1, literal = "2", rid = true)
})
public class ClearingFeeCollectionTransactionsTRC2BrazilNationalSettlement {

	@Field(at = 4, length = 12)
	private String reserved1;

	@Field(at = 16, length = 3)
	private String countryCode;

	@Field(at = 19, length = 3)
	private String reserved2;

	@Field(at = 22, length = 3)
	private String settlementType;

	@Field(at = 25, length = 10, align = Align.RIGHT, padding = '0')
	private Long nationalReimbursementFee;

	@Field(at = 35, length = 4, align = Align.RIGHT, padding = '0')
	private Long centralProcessingDate;

	@Field(at = 39, length = 2)
	private String installmentPaymentCount;

	@Field(at = 41, length = 127)
	private String reserved3;

}
