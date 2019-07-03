package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, regex = "(05|06|15|16|25|26|35|36)", rid = true),
	@Field(at = 3, length = 1, literal = "3", rid = true),
	@Field(at = 16, length = 2, literal = "LD", rid = true)
})
public class DraftDataTransactionsTRC3IndustrySpecificDataLD {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 12)
	private String reserved1;

	@Field(at = 18, length = 4)
	private String cardholderTaxIDType;

	@Field(at = 22, length = 15)
	private String cardholderTaxID;

	@Field(at = 37, length = 2)
	private String reserved2;

	@Field(at = 39, length = 1)
	private String assetIndicator;

	@Field(at = 40, length = 20)
	private String loanType;

	@Field(at = 60, length = 6)
	private String merchantProgramIdentifer;

	@Field(at = 66, length = 102)
	private String reserved3;

}
