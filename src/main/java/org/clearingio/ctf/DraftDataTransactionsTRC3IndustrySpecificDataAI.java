package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;

import java.time.LocalDate;

@Getter
@Setter
@Fields({
	@Field(at = 3, length = 1, literal = "3", rid = true),
	@Field(at = 16, length = 2, literal = "AI", rid = true)
})
public class DraftDataTransactionsTRC3IndustrySpecificDataAI {

	@Field(at = 0, length = 2, regex = "(05|06|15|16|25|26|35|36)", rid = true)
	private String transactionCode;

	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 12)
	private String reserved1;

	@Field(at = 18, length = 8)
	private String reserved2;

	@Field(at = 26, length = 20)
	private String passengerName;

	@Field(at = 46, length = 6, format = "MMddyy")
	private LocalDate departureDate;

	@Field(at = 52, length = 3)
	private String originationCityAirportCode;

	@Field(at = 55, length = 2)
	private String tripLeg1InformationCompanhia;

	@Field(at = 57, length = 1)
	private String tripLeg1InformationClasse;

	@Field(at = 58, length = 1)
	private String tripLeg1InformationEscala;

	@Field(at = 59, length = 3)
	private String tripLeg1InformationCityAirPort;

	@Field(at = 62, length = 2)
	private String tripLeg2InformationCompanhia;

	@Field(at = 64, length = 1)
	private String tripLeg2InformationClasse;

	@Field(at = 65, length = 1)
	private String tripLeg2InformationEscala;

	@Field(at = 66, length = 3)
	private String tripLeg2InformationCityAirPort;

	@Field(at = 69, length = 2)
	private String tripLeg3InformationCompanhia;

	@Field(at = 71, length = 1)
	private String tripLeg3InformationClasse;

	@Field(at = 72, length = 1)
	private String tripLeg3InformationEscala;

	@Field(at = 73, length = 3)
	private String tripLeg3InformationCityAirPort;

	@Field(at = 76, length = 2)
	private String tripLeg4InformationCompanhia;

	@Field(at = 78, length = 1)
	private String tripLeg4InformationClasse;

	@Field(at = 79, length = 1)
	private String tripLeg4InformationEscala;

	@Field(at = 80, length = 3)
	private String tripLeg4InformationCityAirPort;

	@Field(at = 83, length = 8)
	private String travelAgencyCode;

	@Field(at = 91, length = 25)
	private String travelAgencyName;

	@Field(at = 116, length = 1)
	private String restrictedTicketIndicator;

	@Field(at = 117, length = 6)
	private String fareBasisCodeLeg1;

	@Field(at = 123, length = 6)
	private String fareBasisCodeLeg2;

	@Field(at = 129, length = 6)
	private String fareBasisCodeLeg3;

	@Field(at = 135, length = 6)
	private String fareBasisCodeLeg4;

	@Field(at = 141, length = 4)
	private String computerizedReservationSystem;

	@Field(at = 145, length = 5)
	private String flightNumberLeg1;

	@Field(at = 150, length = 5)
	private String flightNumberLeg2;

	@Field(at = 155, length = 5)
	private String flightNumberLeg3;

	@Field(at = 160, length = 5)
	private String flightNumberLeg4;

	@Field(at = 165, length = 3)
	private String creditReasonIndicator;

}
