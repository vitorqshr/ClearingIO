package org.clearingio.ctf.incoming;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Field;

import org.beanio.annotation.Fields;

import org.beanio.annotation.Record;
import org.beanio.builder.Align;

@Getter
@Setter
@ToString
@Record
@Fields({
	@Field(at = 0, length = 2, literal = "04", rid = true, name = "Transaction Code"),
	@Field(at = 2, length = 1, literal = "0", rid = true, name = "Transaction Code Qualifer"),
	@Field(at = 3, length = 1, literal = "9", rid = true, name = "Transaction Component Sequence Number")
})
public class ReclassificationAdviceTransactionTRC9 {
	@Field(at = 4, length = 6)
	private String destinationBIN;

	@Field(at = 10, length = 6)
	private String sourceBIN;

	@Field(at = 16, length = 2)
	private String originalTransactionCode;

	@Field(at = 18, length = 1)
	private String originalTransactionCodeQualifer;

	@Field(at = 19, length = 1)
	private String originalTransactionComponentSequenceNumber;

	@Field(at = 20, length = 5/*, format = "yyddd"*/)
	private String sourceBatchDate;

	@Field(at = 25, length = 6, align = Align.RIGHT, padding = '0')
	private String sourceBatchNumber;

	@Field(at = 31, length = 4, align = Align.RIGHT, padding = '0')
	private String itemSequenceNumber;

	@Field(at = 35, length = 3)
	private String productReclassifcationReason;

	@Field(at = 38, length = 2)
	private String settledProductID;

	@Field(at = 40, length = 1)
	private String settledSpendQualifedIndicator;

	@Field(at = 41, length = 26)
	private String reserved1;

	@Field(at = 67, length = 1)
	private String reserved2;

	@Field(at = 68, length = 1)
	private String settledAuthorizationCharacteristicsIndicator;

	@Field(at = 69, length = 1)
	private String settledRequestedPaymentService;

	@Field(at = 70, length = 1)
	private String settledReimbursementAttribute;

	@Field(at = 71, length = 16)
	private String derivedIRFDescriptor;

	@Field(at = 87, length = 16)
	private String settledIRFDescriptor;

	@Field(at = 103, length = 3)
	private String paymentServiceReclassifcationReason;

	@Field(at = 106, length = 3)
	private String feeReclassifcationReason;

	@Field(at = 109, length = 3)
	private String merchantVolumeReclassifcationReason;

	@Field(at = 112, length = 3)
	private String submittedFeeProgramIndicator;

	@Field(at = 115, length = 3)
	private String assessedFeeProgramIndicator;

	@Field(at = 118, length = 3)
	private String feeProgramIndicatorReclassifcationReason;

	@Field(at = 121, length = 3)
	private String MOTOECIReclassifcationReason;

	@Field(at = 124, length = 15, align = Align.RIGHT, padding = '0')
	private String interchangeFeeAmount;

	@Field(at = 139, length = 1)
	private String interchangeFeeSign;

	@Field(at = 140, length = 3)
	private String transactionIntegrityFeeReclassifcationReason;

	@Field(at = 143, length = 3)
	private String spendQualifedIndicatorReclassifcationReason;

	@Field(at = 146, length = 22)
	private String reserved3;
}
