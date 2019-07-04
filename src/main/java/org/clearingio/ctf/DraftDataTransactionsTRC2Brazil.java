package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;
import org.beanio.builder.Align;

@Getter
@Setter
@Record(name = "Draft Data Transactions TRC2 Brazil")
@Fields({
	@Field(at = 3, length = 1, literal = "2", rid = true, name = "Transaction Component Sequence Number"),
	@Field(at = 16, length = 3, literal = "BR", rid = true, name = "Country Code")
})
public class DraftDataTransactionsTRC2Brazil {

	@Field(at = 0, length = 2, regex = "(05|06|07|15|16|17|25|26|27|35|36|37)", rid = true, name = "Transaction Code")
	private String transactionCode;

	@Field(at = 2, length = 1, regex = "(0|1|2)", rid = true)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 12)
	private String reserved1;

	@Field(at = 19, length = 3)
	private String reserved2;

	@Field(at = 22, length = 3, align = Align.RIGHT, padding = '0')
	private Long settlementType;

	@Field(at = 25, length = 10, align = Align.RIGHT, padding = '0')
	private Long nationalReimbursementFee;

	@Field(at = 35, length = 4)
	private String nationalNetCPDofOriginal;

	@Field(at = 39, length = 2)
	private String installmentPaymentCount;

	@Field(at = 41, length = 5)
	private String specialMerchantIdentifer;

	@Field(at = 46, length = 1)
	private String specialPurchaseIdentifer;

	@Field(at = 47, length = 121)
	private String reserved3;

}
