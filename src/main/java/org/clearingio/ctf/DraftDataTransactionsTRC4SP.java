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
	@Field(at = 3, length = 1, literal = "4", rid = true),
	@Field(at = 14, length = 2, literal = "SP", rid = true)
})
public class DraftDataTransactionsTRC4SP {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 5)
	private String agentUniqueID;

	@Field(at = 9, length = 5)
	private String reserved1;

	@Field(at = 16, length = 4)
	private String networkIdentifcationCode;

	@Field(at = 20, length = 25)
	private String contactInformation;

	@Field(at = 45, length = 1)
	private String adjustmentProcessingIndicator;

	@Field(at = 46, length = 4, align = Align.RIGHT, padding = '0')
	private Long messageReasonCode;

	@Field(at = 50, length = 8)
	private String surchargeAmount;

	@Field(at = 58, length = 2)
	private String surchargeCreditDebitIndicator;

	@Field(at = 60, length = 16)
	private String visaInternalUseOnly;

	@Field(at = 76, length = 2)
	private String promotionType;

	@Field(at = 78, length = 25, align = Align.RIGHT, padding = '0')
	private Long promotionCode;

	@Field(at = 103, length = 8, align = Align.RIGHT, padding = '0')
	private Long surchargeAmountinCardholderBillingCurrency;

	@Field(at = 111, length = 57)
	private String reserved2;
}
