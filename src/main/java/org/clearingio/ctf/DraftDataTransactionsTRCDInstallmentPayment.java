package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.builder.Align;

@Getter
@Setter
@Fields({ @Field(at = 0, length = 2, regex = "(05|06|25|26)", rid = true),
		@Field(at = 3, length = 1, literal = "D", rid = true),
		@Field(at = 4, length = 2, literal = "IP", rid = true) })
public class DraftDataTransactionsTRCDInstallmentPayment {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 6, length = 12, align = Align.RIGHT, padding = '0')
	private Long installmentPaymentTotalAmount;

	@Field(at = 18, length = 3)
	private String installmentPaymentCurrencyCode;

	@Field(at = 21, length = 3, align = Align.RIGHT, padding = '0')
	private Long numberofInstallments;

	@Field(at = 24, length = 12, align = Align.RIGHT, padding = '0')
	private Long amountofEachInstallment;

	@Field(at = 36, length = 3, align = Align.RIGHT, padding = '0')
	private Long installmentPaymentNumber;

	@Field(at = 39, length = 1)
	private String frequencyofInstallments;

	@Field(at = 40, length = 128)
	private String reserved1;

}
