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
	@Field(at = 3, length = 1, literal = "0", rid = true)
})
public class FraudAdviceTransactionsTCR0 {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 6, align = Align.RIGHT, padding = '0')
	private Long destinationBIN;

	@Field(at = 10, length = 6, align = Align.RIGHT, padding = '0')
	private Long sourceBIN;

	@Field(at = 16, length = 16, align = Align.RIGHT, padding = '0')
	private Long transactionDataCardNumber;

	@Field(at = 32, length = 7)
	private String transactionDataCardComplement;

	@Field(at = 39, length = 23)
	private String transactionDataNumberARD;

	@Field(at = 62, length = 8, align = Align.RIGHT, padding = '0')
	private Long transactionDataAcquirerID;

	@Field(at = 70, length = 2)
	private String transactionDataReasonCode;

	@Field(at = 72, length = 4, align = Align.RIGHT, padding = '0')
	private Long transactionDataTransactionDate;

	@Field(at = 76, length = 25)
	private String transactionDataMarketName;

	@Field(at = 101, length = 13)
	private String transactionDataMarketCity;

	@Field(at = 114, length = 3)
	private String transactionDataCodeContry;

	@Field(at = 117, length = 4, align = Align.RIGHT, padding = '0')
	private Long transactionDataMarketMCC;

	@Field(at = 121, length = 3)
	private String transactionDataMarketUFState;

	@Field(at = 124, length = 12, align = Align.RIGHT, padding = '0')
	private Long transactionDataFraudValue;

	@Field(at = 136, length = 3, align = Align.RIGHT, padding = '0')
	private Long transactionDataFraudCodeCurrency;

	@Field(at = 139, length = 4, align = Align.RIGHT, padding = '0')
	private Long transactionDataProcessingDate;

	@Field(at = 143, length = 1)
	private String transactionDataIssuingAuthorization;

	@Field(at = 144, length = 1, align = Align.RIGHT, padding = '0')
	private Long transactionDataNotificationCode;

	@Field(at = 145, length = 4, align = Align.RIGHT, padding = '0')
	private Long transactionDataAccountNumberSequence;

	@Field(at = 149, length = 1)
	private String transactionDataReserved;

	@Field(at = 150, length = 1)
	private String transactionDataFraudType;

	@Field(at = 151, length = 4, align = Align.RIGHT, padding = '0')
	private Long transactionDataCardExpirationDate;

	@Field(at = 155, length = 10)
	private String transactionDataMarketZipCode;

	@Field(at = 165, length = 2)
	private String transactionDataFraudStatusInvest;

	@Field(at = 167, length = 1)
	private String reimbursementAttribute;
}
