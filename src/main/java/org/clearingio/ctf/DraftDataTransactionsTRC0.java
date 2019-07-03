package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 3, length = 1, literal = "0", rid = true)
})
public class DraftDataTransactionsTRC0 {

	@Field(at = 0, length = 2, regex = "(04|05|06|07|15|16|17|25|26|27|35|36|37)", rid = true)
	private String transactionCode;

	@Field(at = 2, length = 1)
	private String transactionCodeQualifier;

	@Field(at = 4, length = 16)
	private String accountNumber;

	@Field(at = 20, length = 3, align = Align.RIGHT, padding = '0')
	private String accountNumberExtension;

	@Field(at = 23, length = 1)
	private String floorLimitIndicator;

	@Field(at = 24, length = 1)
	private String exceptionFileIndicator;

	@Field(at = 25, length = 1)
	private String positiveCardholderAuthorizationServiceIndicator;

	@Field(at = 26, length = 23)
	private String acquirerReferenceNumber;

	@Field(at = 49, length = 8, align = Align.RIGHT, padding = '0')
	private String acquirersBusinessId;

	@Field(at = 57, length = 4, format = "MMdd")
	private String purchaseDate;

	@Field(at = 61, length = 12, align = Align.RIGHT, padding = '0')
	private String destinationAmount;

	@Field(at = 73, length = 3)
	private String destinationCurrencyCode;

	@Field(at = 76, length = 12, align = Align.RIGHT, padding = '0')
	private String sourceAmount;

	@Field(at = 88, length = 3)
	private String sourceCurrencyCode;

	@Field(at = 91, length = 25)
	private String merchantName;

	@Field(at = 116, length = 13)
	private String merchantCity;

	@Field(at = 129, length = 3)
	private String merchantCountryCode;

	@Field(at = 132, length = 4)
	private String mcc;

	@Field(at = 136, length = 5, align = Align.RIGHT, padding = '0')
	private String merchantZipCode;

	@Field(at = 141, length = 3)
	private String merchantStateCode;

	@Field(at = 144, length = 1)
	private String requestedPaymentService;

	@Field(at = 145, length = 1)
	private String numberOfPaymentForms;

	@Field(at = 146, length = 1)
	private String usageCode;

	@Field(at = 147, length = 2, align = Align.RIGHT, padding = '0')
	private String reasonCode;

	@Field(at = 149, length = 1)
	private String settlementFlag;

	@Field(at = 150, length = 1)
	private String authorizationCharacteristicsIndicator;

	@Field(at = 151, length = 6)
	private String authorizationCode;

	@Field(at = 157, length = 1)
	private String posTerminalCapability;

	@Field(at = 158, length = 1)
	private String reserved;

	@Field(at = 159, length = 1)
	private String cardholderIdMethod;

	@Field(at = 160, length = 1)
	private String collectionOnlyFlag;

	@Field(at = 161, length = 2)
	private String posEntryMode;

	@Field(at = 163, length = 4, align = Align.RIGHT, padding = '0')
	private String centralProcessingDate;

	@Field(at = 167, length = 1)
	private String reimbursementAttribute;
}
