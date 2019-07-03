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
	@Field(at = 16, length = 3, literal = "MX", rid = true)
})
public class DraftDataTransactionsTRC2Mexico {

	@Field(at = 0, length = 2, regex = "(05|06|07|25|26|27)", rid = true)
	private String transactionCode;

	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 12)
	private String interchangeReimbursementFee;

	@Field(at = 19, length = 2)
	private String accountType;

	@Field(at = 21, length = 1)
	private String irfType;

	@Field(at = 22, length = 2)
	private String irfCategory;

	@Field(at = 24, length = 10)
	private String taxforIRF;

	@Field(at = 34, length = 13)
	private String merchantFiscalId;

	@Field(at = 47, length = 1)
	private String installmentPaymentIndicator;

	@Field(at = 48, length = 3, align = Align.RIGHT, padding = '0')
	private Long numberofInstallmentPayments;

	@Field(at = 51, length = 3, align = Align.RIGHT, padding = '0')
	private Long gracePeriod;

	@Field(at = 54, length = 1)
	private String frequencyofPayment;

	@Field(at = 55, length = 12, align = Align.RIGHT, padding = '0')
	private Long installmentPaymentInterest;

	@Field(at = 67, length = 10, align = Align.RIGHT, padding = '0')
	private Long vatForInstallmentPaymentInterest;

	@Field(at = 77, length = 3, align = Align.RIGHT, padding = '0')
	private Long installmentPaymentNumber;

	@Field(at = 80, length = 88)
	private String reserved1;

}
