package org.clearingio.ipm;

import org.clearingio.ipm.dto.CardAcceptorNameLocationDto;
import org.clearingio.ipm.dto.ProcessingCodeDto;
import org.clearingio.iso8583.Msg;
import org.clearingio.iso8583.annotation.enumeration.DataLength;
import org.clearingio.iso8583.annotation.enumeration.Justification;
import org.clearingio.iso8583.builder.MsgBuilder;

public class MsgIpm extends Msg {

	public void setProcessingCode(String cardholderTransactionType, String cardholderFromAccountTypeCode, String cardholderToAccountTypeCode) {
		// Subfield 1
		cardholderTransactionType = MsgBuilder.padding(cardholderTransactionType, 2, '0', Justification.LEFT);

		// Subfield 2
		cardholderFromAccountTypeCode = MsgBuilder.padding(cardholderFromAccountTypeCode, 2, '0', Justification.LEFT);

		// Subfield 3
		cardholderToAccountTypeCode = MsgBuilder.padding(cardholderToAccountTypeCode, 2, '0', Justification.LEFT);

		String processingCode = cardholderTransactionType + cardholderFromAccountTypeCode + cardholderToAccountTypeCode;

		super.setProcessingCode(processingCode);
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
		cardAcceptorName = MsgBuilder.padding(cardAcceptorName, 0, ' ', Justification.RIGHT, 22, 22);
		cardAcceptorName = MsgBuilder.dataLength(cardAcceptorName, DataLength.LLVAR);

		// Subfield 2
		if(cardAcceptorStreetAddress != null) {
			cardAcceptorStreetAddress = MsgBuilder.padding(cardAcceptorStreetAddress, 0, ' ', Justification.RIGHT, 48, 48);
			cardAcceptorStreetAddress = MsgBuilder.dataLength(cardAcceptorStreetAddress, DataLength.LLVAR);
		} else {
			cardAcceptorStreetAddress = "UNKNOWN";
		}

		// Subfield 3
		cardAcceptorCity = MsgBuilder.padding(cardAcceptorCity, 0, ' ', Justification.RIGHT, 22, 13);
		cardAcceptorCity = MsgBuilder.dataLength(cardAcceptorCity, DataLength.LLLVAR);

		// Subfield 4
		cardAcceptorPostalZIPCode = MsgBuilder.padding(cardAcceptorPostalZIPCode, 10, ' ', Justification.RIGHT);

		// Subfield 5
		cardAcceptorStateProvinceorRegionCode = MsgBuilder.padding(cardAcceptorStateProvinceorRegionCode, 3, ' ', Justification.RIGHT);

		// Subfield 6
		cardAcceptorCountryCode = MsgBuilder.padding(cardAcceptorCountryCode, 3, ' ', Justification.RIGHT);

		String cardAcceptorNameLocation = cardAcceptorName + '\\' + cardAcceptorStreetAddress + '\\' + cardAcceptorCity + '\\' + cardAcceptorPostalZIPCode + cardAcceptorStateProvinceorRegionCode + cardAcceptorCountryCode;

		super.setCardAcceptorNameLocation(cardAcceptorNameLocation);
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
		int endOfcardAcceptorCity = this.getCardAcceptorNameLocation().indexOf('\\', endOfCardAcceptorStreetAddress + 3);
		dto.setCardAcceptorStreetAddress(this.getCardAcceptorNameLocation().substring(endOfCardAcceptorStreetAddress + 3, endOfcardAcceptorCity));

		// Subfield 4
		if(this.getCardAcceptorNameLocation().length() < endOfcardAcceptorCity + 10)
			return dto;
		dto.setCardAcceptorPostalZIPCode(this.getCardAcceptorNameLocation().substring(endOfcardAcceptorCity, endOfcardAcceptorCity + 10));

		// Subfield 5
		if(this.getCardAcceptorNameLocation().length() < endOfcardAcceptorCity + 13)
			return dto;
		dto.setCardAcceptorStateProvinceorRegionCode(this.getCardAcceptorNameLocation().substring(endOfcardAcceptorCity + 10, endOfcardAcceptorCity + 13));

		// Subfield 6
		if(this.getCardAcceptorNameLocation().length() < endOfcardAcceptorCity + 16)
			return dto;
		dto.setCardAcceptorCountryCode(this.getCardAcceptorNameLocation().substring(endOfcardAcceptorCity + 13, endOfcardAcceptorCity + 16));

		return dto;
	}
}
