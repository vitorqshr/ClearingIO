package org.clearingio.ipm;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.clearingio.ipm.dto.CardAcceptorNameLocationDto;
import org.clearingio.ipm.dto.ProcessingCodeDto;
import org.clearingio.iso8583.annotation.Bit;
import org.clearingio.iso8583.annotation.MTI;
import org.clearingio.iso8583.annotation.enumeration.DataLength;
import org.clearingio.iso8583.annotation.enumeration.DataRepresentation;
import org.clearingio.iso8583.annotation.enumeration.Justification;
import org.clearingio.iso8583.builder.MsgBuilder;

import java.util.Arrays;

@Getter
@Setter
@ToString
public class MsgIpm {

	@MTI
	private Number messageTypeIdentifier;

	@Bit(value = 2, dataLength = DataLength.LLVAR, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', fixedLength = 6, maximumLength = 19, justification = Justification.LEFT, name = "Primary Account Number (PAN) n...19; LLVAR")
	private String primaryAccountNumber;

	@Bit(value = 3, fixedLength = 6, justification = Justification.LEFT, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Processing Code n-6")
	private String processingCode;

	@Bit(value = 4, fixedLength = 12, justification = Justification.LEFT, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Amount, Transaction n-12")
	private Number amountTransaction;

	@Bit(value = 5, fixedLength = 12, justification = Justification.LEFT, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Amount, Reconciliation n-12")
	private Number amountReconciliation;

	@Bit(value = 6, fixedLength = 12, justification = Justification.LEFT, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Amount, Cardholder Billing n-12")
	private Number amountCardholderBilling;

	@Bit(value = 9, fixedLength = 8, justification = Justification.LEFT, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Conversion Rate, Reconciliation n-8")
	private Number conversionRateReconciliation;

	@Bit(value = 10, fixedLength = 8, justification = Justification.LEFT, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Conversion Rate, Cardholder Billing n-8")
	private Number conversionRateCardholderBilling;

	@Bit(value = 12, fixedLength = 12, dataRepresentation = DataRepresentation.YYMMDDhhmmss, name = "Date and Time, Local Transaction n-12; YYMMDDhhmmss")
	private String dateAndTimeLocalTransaction;

	@Bit(value = 14, fixedLength = 4, dataRepresentation = DataRepresentation.YYMM, name = "Date, Expiration n-4; YYMM")
	private String dateExpiration;

	@Bit(value = 22, fixedLength = 12, dataRepresentation = DataRepresentation.ALPHABETIC_NUMERIC, name = "Point of Service Data Code an-12")
	private String pointOfServiceDataCode;

	@Bit(value = 23, fixedLength = 3, justification = Justification.LEFT, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Card Sequence Number n-3")
	private Number cardSequenceNumber;

	@Bit(value = 24, fixedLength = 3, justification = Justification.LEFT, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Function Code n-3")
	private Number functionCode;

	@Bit(value = 25, fixedLength = 4, justification = Justification.LEFT, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Message Reason Code n-4")
	private Number messageReasonCode;

	@Bit(value = 26, fixedLength = 4, justification = Justification.LEFT, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Card Acceptor Business Code (MCC) n-4")
	private Number cardAcceptorBusinessCode;

	@Bit(value = 30, fixedLength = 24, justification = Justification.LEFT, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Amounts, Original n-24")
	private Number amountsOriginal;

	@Bit(value = 31, dataLength = DataLength.LLVAR, justification = Justification.LEFT, maximumLength = 23, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Acquirer Reference Data n-23; LLVAR")
	private Number acquirerReferenceData;

	@Bit(value = 32, dataLength = DataLength.LLVAR, justification = Justification.LEFT, fixedLength = 11, maximumLength = 11, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Acquiring Institution ID Code n...11; LLVAR")
	private Number acquiringInstitutionIDCode;

	@Bit(value = 33, dataLength = DataLength.LLVAR, justification = Justification.LEFT, fixedLength = 11, maximumLength = 11, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Forwarding Institution ID Code n...11; LLVAR")
	private Number forwardingInstitutionIDCode;

	@Bit(value = 37, fixedLength = 12, justification = Justification.RIGHT, dataRepresentation = DataRepresentation.ALPHABETIC_NUMERIC_SPACE, padding = ' ', name = "Retrieval Reference Number ans-12")
	private String retrievalReferenceNumber;

	@Bit(value = 38, fixedLength = 6, justification = Justification.RIGHT, dataRepresentation = DataRepresentation.ALPHABETIC_NUMERIC_SPACE, padding = ' ', name = "Approval Code ans-6")
	private String approvalCode;

	@Bit(value = 40, fixedLength = 3, justification = Justification.RIGHT, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Service Code n-3")
	private Number serviceCode;

	@Bit(value = 41, fixedLength = 8, justification = Justification.RIGHT, dataRepresentation = DataRepresentation.ALPHABETIC_NUMERIC_SPACE, padding = ' ', name = "Card Acceptor Terminal ID ans-8")
	private String cardAcceptorTerminalID;

	@Bit(value = 42, fixedLength = 15, justification = Justification.RIGHT, dataRepresentation = DataRepresentation.ALPHABETIC_NUMERIC_SPACE, padding = ' ', name = "Card Acceptor ID Code ans-15")
	private String cardAcceptorIDCode;

	@Bit(value = 43, dataLength = DataLength.LLVAR, maximumLength = 99, dataRepresentation = DataRepresentation.ALPHABETIC_NUMERIC_SPACE, padding = ' ', name = "Card Acceptor Name/Location ans...99; LLVAR")
	private String cardAcceptorNameLocation;

	@Bit(value = 48, dataLength = DataLength.LLLVAR, maximumLength = 999, dataRepresentation = DataRepresentation.ALPHABETIC_NUMERIC_SPACE, name = "Additional Data an...999; LLLVAR")
	private String additionalData;

	@Bit(value = 49, fixedLength = 3, justification = Justification.LEFT, dataRepresentation = DataRepresentation.NUMERIC, name = "Currency Code, Transaction n-3")
	private Number currencyCodeTransaction;

	@Bit(value = 50, fixedLength = 3, justification = Justification.LEFT, dataRepresentation = DataRepresentation.NUMERIC, name = "Currency Code, Reconciliation n-3")
	private Number currencyCodeReconciliation;

	@Bit(value = 51, fixedLength = 3, justification = Justification.LEFT, dataRepresentation = DataRepresentation.NUMERIC, name = "Currency Code, Cardholder Billing n-3")
	private Number currencyCodeCardholderBilling;

	@Bit(value = 54, dataLength = DataLength.LLLVAR, maximumLength = 20, dataRepresentation = DataRepresentation.ALPHABETIC_NUMERIC_SPACE, name = "Amounts, Additional ans-20; LLLVAR")
	private String amountsAdditional;

	@Bit(value = 55, dataLength = DataLength.LLLVAR, maximumLength = 255, dataRepresentation = DataRepresentation.BYTE, name = "Integrated Circuit Card (ICC) System Related Data b...255; LLLVAR")
	private Byte[] integratedCircuitCard;

	@Bit(value = 62, dataLength = DataLength.LLLVAR, maximumLength = 999, dataRepresentation = DataRepresentation.ALPHABETIC_NUMERIC_SPACE, name = "Additional Data 2 ans...999; LLLVAR")
	private String additionalData2;

	@Bit(value = 63, dataLength = DataLength.LLLVAR, maximumLength = 16, dataRepresentation = DataRepresentation.ALPHABETIC_NUMERIC_SPACE, name = "Transaction Life Cycle ID ans-16; LLLVAR")
	private String transactionLifeCycleID;

	@Bit(value = 71, fixedLength = 8, justification = Justification.LEFT, dataRepresentation = DataRepresentation.NUMERIC, padding = '0', name = "Message Number n-8")
	private Number messageNumber;

	@Bit(value = 72, dataLength = DataLength.LLLVAR, maximumLength = 999, dataRepresentation = DataRepresentation.ALPHABETIC_NUMERIC_SPACE, name = "Data Record ans...999; LLLVAR")
	private String dataRecord;

	@Bit(value = 73, fixedLength = 6, justification = Justification.LEFT, dataRepresentation = DataRepresentation.YYMMDD, name = "Date, Action n-6; YYMMDD")
	private Number dateAction;

	@Bit(value = 93, dataLength = DataLength.LLVAR, fixedLength = 6, maximumLength = 11, dataRepresentation = DataRepresentation.NUMERIC, justification = Justification.LEFT, padding = '0', name = "Transaction Destination Institution ID Code n...11; LLVAR")
	private Number transactionDestinationInstitutionIDCode;

	@Bit(value = 94, dataLength = DataLength.LLVAR, fixedLength = 6, maximumLength = 11, dataRepresentation = DataRepresentation.NUMERIC, justification = Justification.LEFT, padding = '0', name = "Transaction Originator Institution ID Code n...11; LLVAR")
	private Number transactionOriginatorInstitutionIDCode;

	@Bit(value = 95, dataLength = DataLength.LLVAR, maximumLength = 10, dataRepresentation = DataRepresentation.NUMERIC, name = "Card Issuer Reference Data n-10; LLVAR")
	private Number cardIssuerReferenceData;

	@Bit(value = 100, dataLength = DataLength.LLVAR, fixedLength = 6, maximumLength = 11, dataRepresentation = DataRepresentation.NUMERIC, justification = Justification.LEFT, padding = '0', name = "Receiving Institution ID Code n...11; LLVAR")
	private Number receivingInstitutionIDCode;

	@Bit(value = 111, dataLength = DataLength.LLLVAR, maximumLength = 12, dataRepresentation = DataRepresentation.NUMERIC, name = "Amount, Currency Conversion Assessment n-12; LLLVAR")
	private Number amountCurrencyConversionAssessment;

	@Bit(value = 123, dataLength = DataLength.LLLVAR, maximumLength = 999, dataRepresentation = DataRepresentation.ALPHABETIC_NUMERIC_SPACE, name = "Additional Data 3 ans...999; LLLVAR")
	private String additionalData3;

	@Bit(value = 124, dataLength = DataLength.LLLVAR, maximumLength = 999, dataRepresentation = DataRepresentation.ALPHABETIC_NUMERIC_SPACE, name = "Additional Data 4 ans...999; LLLVAR")
	private String additionalData4;

	@Bit(value = 125, dataLength = DataLength.LLLVAR, maximumLength = 999, dataRepresentation = DataRepresentation.ALPHABETIC_NUMERIC_SPACE, name = "Additional Data 5 ans...999; LLLVAR")
	private String additionalData5;

	public void setProcessingCode(String cardholderTransactionType, String cardholderFromAccountTypeCode, String cardholderToAccountTypeCode) {
		// Subfield 1
		cardholderTransactionType = MsgBuilder.padding(cardholderTransactionType, 2, '0', Justification.LEFT);

		// Subfield 2
		cardholderFromAccountTypeCode = MsgBuilder.padding(cardholderFromAccountTypeCode, 2, '0', Justification.LEFT);

		// Subfield 3
		cardholderToAccountTypeCode = MsgBuilder.padding(cardholderToAccountTypeCode, 2, '0', Justification.LEFT);

		String processingCode = cardholderTransactionType + cardholderFromAccountTypeCode + cardholderToAccountTypeCode;

		setProcessingCode(processingCode);
	}

	public void setProcessingCodeDto(ProcessingCodeDto dto) {
		setProcessingCode(dto.getCardholderTransactionType(), dto.getCardholderFromAccountTypeCode(), dto.getCardholderToAccountTypeCode());
	}

	public ProcessingCodeDto getProcessingCodeDto() {
		ProcessingCodeDto dto = new ProcessingCodeDto();
		dto.setCardholderTransactionType(this.getProcessingCode().substring(0, 2));
		dto.setCardholderFromAccountTypeCode(this.getProcessingCode().substring(2, 4));
		dto.setCardholderToAccountTypeCode(this.getProcessingCode().substring(4));
		return dto;
	}

	public void setCardAcceptorNameLocation(String cardAcceptorName, String cardAcceptorStreetAddress, String cardAcceptorCity, String cardAcceptorPostalZIPCode, String cardAcceptorStateProvinceorRegionCode, String cardAcceptorCountryCode) {
		// Subfield 1
		cardAcceptorName = MsgBuilder.padding(cardAcceptorName, 0, ' ', Justification.RIGHT, 22);
		cardAcceptorName = MsgBuilder.dataLength(cardAcceptorName, DataLength.LLVAR);

		// Subfield 2
		if(cardAcceptorStreetAddress == null || cardAcceptorStreetAddress.trim().isEmpty()) {
			cardAcceptorStreetAddress = "UNKNOWN";
		}
		cardAcceptorStreetAddress = MsgBuilder.padding(cardAcceptorStreetAddress, 0, ' ', Justification.RIGHT, 48);
		cardAcceptorStreetAddress = MsgBuilder.dataLength(cardAcceptorStreetAddress, DataLength.LLVAR);

		// Subfield 3
		cardAcceptorCity = MsgBuilder.padding(cardAcceptorCity, 0, ' ', Justification.RIGHT, 13);
		cardAcceptorCity = MsgBuilder.dataLength(cardAcceptorCity, DataLength.LLLVAR);

		// Subfield 4
		cardAcceptorPostalZIPCode = MsgBuilder.padding(cardAcceptorPostalZIPCode, 10, ' ', Justification.RIGHT);

		// Subfield 5
		cardAcceptorStateProvinceorRegionCode = MsgBuilder.padding(cardAcceptorStateProvinceorRegionCode, 3, ' ', Justification.RIGHT);

		// Subfield 6
		cardAcceptorCountryCode = MsgBuilder.padding(cardAcceptorCountryCode, 3, ' ', Justification.RIGHT);

		String cardAcceptorNameLocation = cardAcceptorName + '\\' + cardAcceptorStreetAddress + '\\' + cardAcceptorCity + '\\' + cardAcceptorPostalZIPCode + cardAcceptorStateProvinceorRegionCode + cardAcceptorCountryCode;

		setCardAcceptorNameLocation(cardAcceptorNameLocation);
	}

	public void setCardAcceptorNameLocationDto(CardAcceptorNameLocationDto dto) {
		setCardAcceptorNameLocation(dto.getCardAcceptorName(), dto.getCardAcceptorStreetAddress(), dto.getCardAcceptorCity(), dto.getCardAcceptorPostalZIPCode(), dto.getCardAcceptorStateProvinceorRegionCode(), dto.getCardAcceptorCountryCode());
	}

	public CardAcceptorNameLocationDto getCardAcceptorNameLocationDto() {
		CardAcceptorNameLocationDto dto = new CardAcceptorNameLocationDto();
		// Subfield 1
		int endOfCardAcceptorNameLocation = this.getCardAcceptorNameLocation().indexOf('\\');
		dto.setCardAcceptorName(this.getCardAcceptorNameLocation().substring(2, endOfCardAcceptorNameLocation));

		// Subfield 2
		int endOfCardAcceptorStreetAddress = this.getCardAcceptorNameLocation().indexOf('\\', endOfCardAcceptorNameLocation + 2);
		dto.setCardAcceptorStreetAddress(this.getCardAcceptorNameLocation().substring(endOfCardAcceptorNameLocation + 2, endOfCardAcceptorStreetAddress));

		// Subfield 3
		int endOfCardAcceptorCity = this.getCardAcceptorNameLocation().indexOf('\\', endOfCardAcceptorStreetAddress + 3);
		dto.setCardAcceptorStreetAddress(this.getCardAcceptorNameLocation().substring(endOfCardAcceptorStreetAddress + 3, endOfCardAcceptorCity));

		// Subfield 4
		if(this.getCardAcceptorNameLocation().length() < endOfCardAcceptorCity + 10)
			return dto;
		dto.setCardAcceptorPostalZIPCode(this.getCardAcceptorNameLocation().substring(endOfCardAcceptorCity, endOfCardAcceptorCity + 10));

		// Subfield 5
		if(this.getCardAcceptorNameLocation().length() < endOfCardAcceptorCity + 13)
			return dto;
		dto.setCardAcceptorStateProvinceorRegionCode(this.getCardAcceptorNameLocation().substring(endOfCardAcceptorCity + 10, endOfCardAcceptorCity + 13));

		// Subfield 6
		if(this.getCardAcceptorNameLocation().length() < endOfCardAcceptorCity + 16)
			return dto;
		dto.setCardAcceptorCountryCode(this.getCardAcceptorNameLocation().substring(endOfCardAcceptorCity + 13, endOfCardAcceptorCity + 16));

		return dto;
	}
}
