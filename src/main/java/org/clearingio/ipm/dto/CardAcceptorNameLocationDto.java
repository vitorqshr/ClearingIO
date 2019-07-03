package org.clearingio.ipm.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardAcceptorNameLocationDto {

	private String cardAcceptorName;

	private String cardAcceptorStreetAddress;

	private String cardAcceptorCity;

	private String cardAcceptorPostalZIPCode;

	private String cardAcceptorStateProvinceorRegionCode;

	private String cardAcceptorCountryCode;
}
