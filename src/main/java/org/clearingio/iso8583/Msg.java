package org.clearingio.iso8583;

import org.clearingio.iso8583.annotation.Bit;
import org.clearingio.iso8583.annotation.MTI;
import org.clearingio.iso8583.annotation.enumeration.DataLength;
import org.clearingio.iso8583.annotation.enumeration.DataRepresentation;
import org.clearingio.iso8583.annotation.enumeration.Justification;

import java.util.Arrays;

public class Msg {

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

	public Msg() {}

	public Number getMessageTypeIdentifier() {
		return messageTypeIdentifier;
	}

	public void setMessageTypeIdentifier(Number messageTypeIdentifier) {
		this.messageTypeIdentifier = messageTypeIdentifier;
	}

	public String getPrimaryAccountNumber() {
		return primaryAccountNumber;
	}

	public void setPrimaryAccountNumber(String primaryAccountNumber) {
		this.primaryAccountNumber = primaryAccountNumber;
	}

	public String getProcessingCode() {
		return processingCode;
	}

	public void setProcessingCode(String processingCode) {
		this.processingCode = processingCode;
	}

	public Number getAmountTransaction() {
		return amountTransaction;
	}

	public void setAmountTransaction(Number amountTransaction) {
		this.amountTransaction = amountTransaction;
	}

	public Number getAmountReconciliation() {
		return amountReconciliation;
	}

	public void setAmountReconciliation(Number amountReconciliation) {
		this.amountReconciliation = amountReconciliation;
	}

	public Number getAmountCardholderBilling() {
		return amountCardholderBilling;
	}

	public void setAmountCardholderBilling(Number amountCardholderBilling) {
		this.amountCardholderBilling = amountCardholderBilling;
	}

	public Number getConversionRateReconciliation() {
		return conversionRateReconciliation;
	}

	public void setConversionRateReconciliation(Number conversionRateReconciliation) {
		this.conversionRateReconciliation = conversionRateReconciliation;
	}

	public Number getConversionRateCardholderBilling() {
		return conversionRateCardholderBilling;
	}

	public void setConversionRateCardholderBilling(Number conversionRateCardholderBilling) {
		this.conversionRateCardholderBilling = conversionRateCardholderBilling;
	}

	public String getDateAndTimeLocalTransaction() {
		return dateAndTimeLocalTransaction;
	}

	public void setDateAndTimeLocalTransaction(String dateAndTimeLocalTransaction) {
		this.dateAndTimeLocalTransaction = dateAndTimeLocalTransaction;
	}

	public String getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public String getPointOfServiceDataCode() {
		return pointOfServiceDataCode;
	}

	public void setPointOfServiceDataCode(String pointOfServiceDataCode) {
		this.pointOfServiceDataCode = pointOfServiceDataCode;
	}

	public Number getCardSequenceNumber() {
		return cardSequenceNumber;
	}

	public void setCardSequenceNumber(Number cardSequenceNumber) {
		this.cardSequenceNumber = cardSequenceNumber;
	}

	public Number getFunctionCode() {
		return functionCode;
	}

	public void setFunctionCode(Number functionCode) {
		this.functionCode = functionCode;
	}

	public Number getMessageReasonCode() {
		return messageReasonCode;
	}

	public void setMessageReasonCode(Number messageReasonCode) {
		this.messageReasonCode = messageReasonCode;
	}

	public Number getCardAcceptorBusinessCode() {
		return cardAcceptorBusinessCode;
	}

	public void setCardAcceptorBusinessCode(Number cardAcceptorBusinessCode) {
		this.cardAcceptorBusinessCode = cardAcceptorBusinessCode;
	}

	public Number getAmountsOriginal() {
		return amountsOriginal;
	}

	public void setAmountsOriginal(Number amountsOriginal) {
		this.amountsOriginal = amountsOriginal;
	}

	public Number getAcquirerReferenceData() {
		return acquirerReferenceData;
	}

	public void setAcquirerReferenceData(Number acquirerReferenceData) {
		this.acquirerReferenceData = acquirerReferenceData;
	}

	public Number getAcquiringInstitutionIDCode() {
		return acquiringInstitutionIDCode;
	}

	public void setAcquiringInstitutionIDCode(Number acquiringInstitutionIDCode) {
		this.acquiringInstitutionIDCode = acquiringInstitutionIDCode;
	}

	public Number getForwardingInstitutionIDCode() {
		return forwardingInstitutionIDCode;
	}

	public void setForwardingInstitutionIDCode(Number forwardingInstitutionIDCode) {
		this.forwardingInstitutionIDCode = forwardingInstitutionIDCode;
	}

	public String getRetrievalReferenceNumber() {
		return retrievalReferenceNumber;
	}

	public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
		this.retrievalReferenceNumber = retrievalReferenceNumber;
	}

	public String getApprovalCode() {
		return approvalCode;
	}

	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}

	public Number getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(Number serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getCardAcceptorTerminalID() {
		return cardAcceptorTerminalID;
	}

	public void setCardAcceptorTerminalID(String cardAcceptorTerminalID) {
		this.cardAcceptorTerminalID = cardAcceptorTerminalID;
	}

	public String getCardAcceptorIDCode() {
		return cardAcceptorIDCode;
	}

	public void setCardAcceptorIDCode(String cardAcceptorIDCode) {
		this.cardAcceptorIDCode = cardAcceptorIDCode;
	}

	public String getCardAcceptorNameLocation() {
		return cardAcceptorNameLocation;
	}

	public void setCardAcceptorNameLocation(String cardAcceptorNameLocation) {
		this.cardAcceptorNameLocation = cardAcceptorNameLocation;
	}

	public String getAdditionalData() {
		return additionalData;
	}

	public void setAdditionalData(String additionalData) {
		this.additionalData = additionalData;
	}

	public Number getCurrencyCodeTransaction() {
		return currencyCodeTransaction;
	}

	public void setCurrencyCodeTransaction(Number currencyCodeTransaction) {
		this.currencyCodeTransaction = currencyCodeTransaction;
	}

	public Number getCurrencyCodeReconciliation() {
		return currencyCodeReconciliation;
	}

	public void setCurrencyCodeReconciliation(Number currencyCodeReconciliation) {
		this.currencyCodeReconciliation = currencyCodeReconciliation;
	}

	public Number getCurrencyCodeCardholderBilling() {
		return currencyCodeCardholderBilling;
	}

	public void setCurrencyCodeCardholderBilling(Number currencyCodeCardholderBilling) {
		this.currencyCodeCardholderBilling = currencyCodeCardholderBilling;
	}

	public String getAmountsAdditional() {
		return amountsAdditional;
	}

	public void setAmountsAdditional(String amountsAdditional) {
		this.amountsAdditional = amountsAdditional;
	}

	public Byte[] getIntegratedCircuitCard() {
		return integratedCircuitCard;
	}

	public void setIntegratedCircuitCard(Byte[] integratedCircuitCard) {
		this.integratedCircuitCard = integratedCircuitCard;
	}

	public String getAdditionalData2() {
		return additionalData2;
	}

	public void setAdditionalData2(String additionalData2) {
		this.additionalData2 = additionalData2;
	}

	public String getTransactionLifeCycleID() {
		return transactionLifeCycleID;
	}

	public void setTransactionLifeCycleID(String transactionLifeCycleID) {
		this.transactionLifeCycleID = transactionLifeCycleID;
	}

	public Number getMessageNumber() {
		return messageNumber;
	}

	public void setMessageNumber(Number messageNumber) {
		this.messageNumber = messageNumber;
	}

	public String getDataRecord() {
		return dataRecord;
	}

	public void setDataRecord(String dataRecord) {
		this.dataRecord = dataRecord;
	}

	public Number getDateAction() {
		return dateAction;
	}

	public void setDateAction(Number dateAction) {
		this.dateAction = dateAction;
	}

	public Number getTransactionDestinationInstitutionIDCode() {
		return transactionDestinationInstitutionIDCode;
	}

	public void setTransactionDestinationInstitutionIDCode(Number transactionDestinationInstitutionIDCode) {
		this.transactionDestinationInstitutionIDCode = transactionDestinationInstitutionIDCode;
	}

	public Number getTransactionOriginatorInstitutionIDCode() {
		return transactionOriginatorInstitutionIDCode;
	}

	public void setTransactionOriginatorInstitutionIDCode(Number transactionOriginatorInstitutionIDCode) {
		this.transactionOriginatorInstitutionIDCode = transactionOriginatorInstitutionIDCode;
	}

	public Number getCardIssuerReferenceData() {
		return cardIssuerReferenceData;
	}

	public void setCardIssuerReferenceData(Number cardIssuerReferenceData) {
		this.cardIssuerReferenceData = cardIssuerReferenceData;
	}

	public Number getReceivingInstitutionIDCode() {
		return receivingInstitutionIDCode;
	}

	public void setReceivingInstitutionIDCode(Number receivingInstitutionIDCode) {
		this.receivingInstitutionIDCode = receivingInstitutionIDCode;
	}

	public Number getAmountCurrencyConversionAssessment() {
		return amountCurrencyConversionAssessment;
	}

	public void setAmountCurrencyConversionAssessment(Number amountCurrencyConversionAssessment) {
		this.amountCurrencyConversionAssessment = amountCurrencyConversionAssessment;
	}

	public String getAdditionalData3() {
		return additionalData3;
	}

	public void setAdditionalData3(String additionalData3) {
		this.additionalData3 = additionalData3;
	}

	public String getAdditionalData4() {
		return additionalData4;
	}

	public void setAdditionalData4(String additionalData4) {
		this.additionalData4 = additionalData4;
	}

	public String getAdditionalData5() {
		return additionalData5;
	}

	public void setAdditionalData5(String additionalData5) {
		this.additionalData5 = additionalData5;
	}

	@Override
	public String toString() {
		return "Msg{" +
				"messageTypeIdentifier=" + messageTypeIdentifier +
				", primaryAccountNumber='" + primaryAccountNumber + '\'' +
				", processingCode=" + processingCode +
				", amountTransaction=" + amountTransaction +
				", amountReconciliation=" + amountReconciliation +
				", amountCardholderBilling=" + amountCardholderBilling +
				", conversionRateReconciliation=" + conversionRateReconciliation +
				", conversionRateCardholderBilling=" + conversionRateCardholderBilling +
				", dateAndTimeLocalTransaction='" + dateAndTimeLocalTransaction + '\'' +
				", dateExpiration='" + dateExpiration + '\'' +
				", pointOfServiceDataCode='" + pointOfServiceDataCode + '\'' +
				", cardSequenceNumber=" + cardSequenceNumber +
				", functionCode=" + functionCode +
				", messageReasonCode=" + messageReasonCode +
				", cardAcceptorBusinessCode=" + cardAcceptorBusinessCode +
				", amountsOriginal=" + amountsOriginal +
				", acquirerReferenceData=" + acquirerReferenceData +
				", acquiringInstitutionIDCode=" + acquiringInstitutionIDCode +
				", forwardingInstitutionIDCode=" + forwardingInstitutionIDCode +
				", retrievalReferenceNumber='" + retrievalReferenceNumber + '\'' +
				", approvalCode='" + approvalCode + '\'' +
				", serviceCode=" + serviceCode +
				", cardAcceptorTerminalID='" + cardAcceptorTerminalID + '\'' +
				", cardAcceptorIDCode='" + cardAcceptorIDCode + '\'' +
				", cardAcceptorNameLocation='" + cardAcceptorNameLocation + '\'' +
				", additionalData='" + additionalData + '\'' +
				", currencyCodeTransaction=" + currencyCodeTransaction +
				", currencyCodeReconciliation=" + currencyCodeReconciliation +
				", currencyCodeCardholderBilling=" + currencyCodeCardholderBilling +
				", amountsAdditional='" + amountsAdditional + '\'' +
				", integratedCircuitCard=" + Arrays.toString(integratedCircuitCard) +
				", additionalData2='" + additionalData2 + '\'' +
				", transactionLifeCycleID='" + transactionLifeCycleID + '\'' +
				", messageNumber=" + messageNumber +
				", dataRecord='" + dataRecord + '\'' +
				", dateAction=" + dateAction +
				", transactionDestinationInstitutionIDCode=" + transactionDestinationInstitutionIDCode +
				", transactionOriginatorInstitutionIDCode=" + transactionOriginatorInstitutionIDCode +
				", cardIssuerReferenceData=" + cardIssuerReferenceData +
				", receivingInstitutionIDCode=" + receivingInstitutionIDCode +
				", amountCurrencyConversionAssessment=" + amountCurrencyConversionAssessment +
				", additionalData3='" + additionalData3 + '\'' +
				", additionalData4='" + additionalData4 + '\'' +
				", additionalData5='" + additionalData5 + '\'' +
				'}';
	}
}
