package org.clearingio.ctf.incoming;


import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;

import org.beanio.annotation.Fields;

import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, literal = "46", rid = true),
	@Field(at = 3, length = 1, literal = "0", rid = true),
	@Field(at = 58, length = 1, literal = "V", rid = true),
	@Field(at = 59, length = 1, literal = "1", rid = true)
})
public class MemberSettlementDataTransactionsTCR0V1 {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifier;

	@Field(at = 4, length = 6)
	private String destinationBin;

	@Field(at = 10, length = 6)
	private String sourceBin;

	@Field(at = 16, length = 10)
	private String reportingForSreIdentifier;

	@Field(at = 26, length = 3)
	private String settlementServiceIdentifier;

	@Field(at = 29, length = 7)
	private String reportDate;

	@Field(at = 36, length = 1)
	private String sreLevelNumber;

	@Field(at = 37, length = 7)
	private String lastChangeDate;

	@Field(at = 44, length = 14)
	private String reserved;

	@Field(at = 60, length = 3)
	private String reportIdentificationNumber;

	@Field(at = 63, length = 2)
	private String reportIdentificationSuffix;

	@Field(at = 65, length = 10)
	private String subordinateSreIdentifier;

	@Field(at = 75, length = 15)
	private String subordinateSreName;

	@Field(at = 90, length = 1)
	private String fundsTransferIndicator;

	@Field(at = 91, length = 1)
	private String clearingEntityIdentifierType;

	@Field(at = 92, length = 18)
	private String clearingEntityIdentifier1;

	@Field(at = 110, length = 18)
	private String clearingEntityIdentifier2;

	@Field(at = 128, length = 1)
	private String processorSpecifiedIndicator;

	@Field(at = 129, length = 10)
	private String processorIdentifier;

	@Field(at = 139, length = 1)
	private String networkSpecifiedIndicator;

	@Field(at = 140, length = 4)
	private String networkIdentifier;

	@Field(at = 144, length = 3)
	private String settlementCurrency;

	@Field(at = 147, length = 3)
	private String transactionCurrencyAcquirerPerspective;

	@Field(at = 150, length = 3)
	private String transactionCurrencyIssuerPerspective;

	@Field(at = 153, length = 14)
	private String reserved2;

	@Field(at = 167, length = 1)
	private String reimbursementAttribute;


}
