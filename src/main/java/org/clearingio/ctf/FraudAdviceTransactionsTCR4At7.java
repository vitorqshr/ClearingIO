package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, literal = "40", rid = true),
	@Field(at = 3, length = 1, regex = "(04|05|06|07)", rid = true)
})
public class FraudAdviceTransactionsTCR4At7 {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 164)
	private String transactionData;

}
