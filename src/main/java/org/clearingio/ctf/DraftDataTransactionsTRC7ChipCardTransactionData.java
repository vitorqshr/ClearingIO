package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.builder.Align;

import java.util.Date;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, regex = "(05|06|07|15|16|17|25|26|27|35|36|37)", rid = true) ,
	@Field(at = 3, length = 1, literal = "7", rid = true)
})
public class DraftDataTransactionsTRC7ChipCardTransactionData {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 2)
	private String transactionType;

	@Field(at = 6, length = 3, align = Align.RIGHT, padding = '0')
	private Long cardSequenceNumber;

	@Field(at = 9, length = 6, format = "yyMMdd")
	private Date terminalTransactionDate;

	@Field(at = 15, length = 6)
	private String terminalCapabilityProfle;

	@Field(at = 21, length = 3)
	private String terminalCountryCode;
	@Field(at = 24, length = 8, align = Align.RIGHT, padding = '0')
	private Long terminalSerialNumber;

	@Field(at = 32, length = 8)
	private String unpredictableNumber;

	@Field(at = 40, length = 4)
	private String applicationTransactionCounter;

	@Field(at = 44, length = 4)
	private String applicationInterchangeProfle;

	@Field(at = 48, length = 16)
	private String cryptogram;

	@Field(at = 64, length = 2)
	private String issuerApplicationDataByte2;

	@Field(at = 66, length = 2)
	private String issuerApplicationDataByte3;

	@Field(at = 68, length = 10)
	private String terminalVerifcationResults;
	@Field(at = 78, length = 8)
	private String issuerApplicationDataByte47;
	@Field(at = 86, length = 12)
	private String cryptogramAmount;

	@Field(at = 98, length = 2)
	private String issuerApplicationDataByte8;

	@Field(at = 100, length = 16)
	private String issuerApplicationDataByte916;

	@Field(at = 116, length = 2)
	private String issuerApplicationDataByte1;

	@Field(at = 118, length = 2)
	private String issuerApplicationDataByte17;

	@Field(at = 120, length = 30)
	private String issuerApplicationDataByte1832;

	@Field(at = 150, length = 8)
	private String FormFactorIndicator;

	@Field(at = 158, length = 10)
	private String issuerScript1Results;
}
