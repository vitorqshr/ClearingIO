package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, regex = "(05|06|15|16|25|26|35|36)", rid = true),
	@Field(at = 3, length = 1, literal = "4", rid = true),
	@Field(at = 14, length = 2, literal = "PD", rid = true)
})
public class DraftDataTransactionsTRC4PD {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 10)
	private String reserved1;

	@Field(at = 16, length = 2)
	private String promotionType;

	@Field(at = 18, length = 25)
	private String promotionCode;

	@Field(at = 43, length = 125)
	private String reserved2;
}
