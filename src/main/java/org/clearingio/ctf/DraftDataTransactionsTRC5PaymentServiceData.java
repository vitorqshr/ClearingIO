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
	@Field(at = 3, length = 1, literal = "5", rid = true)
})
public class DraftDataTransactionsTRC5PaymentServiceData {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifier;

	@Field(at = 4, length = 15)
	private String transactionIdentifier;

	@Field(at = 19, length = 12, align = Align.RIGHT, padding = '0')
	private Long authorizedAmount;

	@Field(at = 31, length = 3)
	private String authorizationCurrencyCode;

	@Field(at = 34, length = 2)
	private String authorizationResponseCode;

	@Field(at = 36, length = 4)
	private String validationCode;

	@Field(at = 40, length = 1)
	private String excludedTransactionIdentifierReason;

	@Field(at = 41, length = 1)
	private String crsProcessingCode;

	@Field(at = 42, length = 2)
	private String chargebackRightsIndicator;

	@Field(at = 44, length = 2, align = Align.RIGHT, padding = '0')
	private Long multipleClearingSequenceNumber;

	@Field(at = 46, length = 2, align = Align.RIGHT, padding = '0')
	private Long multipleClearingSequenceCount;

	@Field(at = 48, length = 1)
	private String marketSpecificAuthorizationDataIndicator;

	@Field(at = 49, length = 12, align = Align.RIGHT, padding = '0')
	private Long totalAuthorizedAmount;

	@Field(at = 61, length = 1)
	private String informationIndicator;

	@Field(at = 62, length = 14)
	private String merchantTelephoneNumber;

	@Field(at = 76, length = 1)
	private String additionalDataIndicator;

	@Field(at = 77, length = 2)
	private String merchantVolumeIndicator;

	@Field(at = 79, length = 2)
	private String eCommerceGoodsIndicator;

	@Field(at = 81, length = 10)
	private String merchantVerificationValue;

	@Field(at = 91, length = 15, align = Align.RIGHT, padding = '0')
	private Long interchangeFeeAmount;

	@Field(at = 106, length = 1)
	private String interchangeFeeSign;

	@Field(at = 107, length = 8)
	private String sourceToBaseCurrencyExchangeRate;

	@Field(at = 115, length = 8)
	private String baseToDestinationCurrencyExchangeRate;

	@Field(at = 123, length = 12, align = Align.RIGHT, padding = '0')
	private Long optinalIssuerIsaAmount;

	@Field(at = 135, length = 2)
	private String productId;

	@Field(at = 137, length = 6)
	private String programId;

	@Field(at = 143, length = 1)
	private String dynamicCurrencyConversionIndicator;

	@Field(at = 144, length = 4)
	private String accountTypeIdentification;

	@Field(at = 148, length = 1)
	private String spendQualifiedIndicator;

	@Field(at = 149, length = 16)
	private String panToken;

	@Field(at = 165, length = 2)
	private String reserved;

	@Field(at = 167, length = 1)
	private String cvv2ResultCode;
}
