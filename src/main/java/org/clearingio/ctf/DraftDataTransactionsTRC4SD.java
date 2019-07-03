package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, regex = "(05|06|07|15|16|17|25|26|27|35|36|37)", rid = true),
	@Field(at = 3, length = 1, literal = "4", rid = true),
	@Field(at = 14, length = 2, literal = "SD", rid = true)
})
public class DraftDataTransactionsTRC4SD {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifier;

	@Field(at = 4, length = 5)
	private String agentUniqueId;

	@Field(at = 9, length = 5)
	private String reserved;

	@Field(at = 16, length = 4)
	private String networkIdentificationCode;

	@Field(at = 20, length = 25)
	private String contactForInformation;

	@Field(at = 45, length = 1)
	private String adjustmentProcessingIndicator;

	@Field(at = 46, length = 4)
	private String messageReasonCode;

	@Field(at = 50, length = 8, align = Align.RIGHT, padding = '0')
	private Long surchargeAmount;

	@Field(at = 58, length = 2)
	private String surchargeAmountSign;

	@Field(at = 60, length = 16)
	private String visaInternalUseOnly;

	@Field(at = 76, length = 27)
	private String reserved2;

	@Field(at = 103, length = 8, align = Align.RIGHT, padding = '0')
	private Long surchargeAmountInCardholderBillingCurrency;

	@Field(at = 111, length = 8, align = Align.RIGHT, padding = '0')
	private Long moneyTransferForeignExchangeFee;

	@Field(at = 119, length = 29)
	private String paymentAccountReference;

	@Field(at = 148, length = 11)
	private String tokenRequestorId;

	@Field(at = 159, length = 9)
	private String reserved3;

}
