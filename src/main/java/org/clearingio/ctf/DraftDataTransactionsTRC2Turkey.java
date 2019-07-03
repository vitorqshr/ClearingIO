package org.clearingio.ctf;


import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 3, length = 1, literal = "2", rid = true),
	@Field(at = 16, length = 3, literal = "TR", rid = true)
})
public class DraftDataTransactionsTRC2Turkey {

	@Field(at = 0, length = 2, regex = "(05|06|07|15|16|17|25|26|27|35|36|37)", rid = true)
	private String transactionCode;

	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 12)
	private String reserved1;

	@Field(at = 19, length = 25)
	private String merchantNameTurkish;

	@Field(at = 44, length = 13)
	private String merchantLocationTurkish;

	@Field(at = 57, length = 8, align = Align.RIGHT, padding = '0')
	private Long centralMerchantIdentifer;

	@Field(at = 65, length = 1)
	private String cmiValidIndicator;

	@Field(at = 66, length = 4, align = Align.RIGHT, padding = '0')
	private Long acquiringInstitutionCodeEFT;

	@Field(at = 70, length = 1)
	private String typeofATM;

	@Field(at = 71, length = 97)
	private String reserved2;

}
