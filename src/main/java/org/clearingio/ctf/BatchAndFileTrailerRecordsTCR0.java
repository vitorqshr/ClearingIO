package org.clearingio.ctf;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, regex = "(91|92)", rid = true),
	@Field(at = 3, length = 1, literal = "0", rid = true, align = Align.RIGHT, padding = '0')
})
public class BatchAndFileTrailerRecordsTCR0 {

	@Field(at = 2, length = 1, align = Align.RIGHT, padding = '0')
	private String transactionCodeQualifer;

	@Field(at = 4, length = 6, align = Align.RIGHT, padding = '0')
	private String bin;

	@Field(at = 10, length = 5, align = Align.RIGHT, padding = '0')
	private String processingDate;

	@Field(at = 15, length = 15, align = Align.RIGHT, padding = '0')
	private String destinationAmount;

	@Field(at = 30, length = 12, align = Align.RIGHT, padding = '0')
	private String numberofMonetaryTransactions;

	@Field(at = 42, length = 6, align = Align.RIGHT, padding = '0')
	private String batchNumber;

	@Field(at = 48, length = 12, align = Align.RIGHT, padding = '0')
	private String numberofTCRs;

	@Field(at = 60, length = 6, align = Align.RIGHT, padding = '0')
	private String reserved;

	@Field(at = 66, length = 8)
	private String centerBatchID;

	@Field(at = 74, length = 9, align = Align.RIGHT, padding = '0')
	private String numberofTransactions;

	@Field(at = 83, length = 18, align = Align.RIGHT, padding = '0')
	private String reserved1;

	@Field(at = 101, length = 15, align = Align.RIGHT, padding = '0')
	private String sourceAmount;

	@Field(at = 116, length = 15, align = Align.RIGHT, padding = '0')
	private String reserved2;

	@Field(at = 131, length = 15, align = Align.RIGHT, padding = '0')
	private String reserved3;

	@Field(at = 146, length = 15, align = Align.RIGHT, padding = '0')
	private String reserved4;

	@Field(at = 161, length = 7)
	private String reserved5;

}
