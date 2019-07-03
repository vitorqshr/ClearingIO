package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, regex = "(05|06|15|16|25|26|35|36)", rid = true),
	@Field(at = 3, length = 1, literal = "E", rid = true),
	@Field(at = 4, length = 2, literal = "JA", rid = true)
})
public class DraftDataTransactionsTRCEVisaEuropeVMeData {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 6, length = 5)
	private String agentUniqueID;

	@Field(at = 11, length = 2)
	private String additionalAuthenticationMethod;

	@Field(at = 13, length = 2)
	private String additionalAuthenticationReasonCode;

	@Field(at = 15, length = 153)
	private String reserved1;

}
