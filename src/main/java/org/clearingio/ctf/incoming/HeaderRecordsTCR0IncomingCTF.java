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
@Record(name = "Header Records TCR0 Incoming CTF")
@Fields({
	@Field(at = 0, length = 2, literal = "90", rid = true, name = "Transaction Code")
})
public class HeaderRecordsTCR0IncomingCTF {

	@Field(at = 2, length = 6)
	private String processingBIN;

	@Field(at = 8, length = 5/*, format = "yyddd"*/)
	private String processingDate;

	@Field(at = 13, length = 6)
	private String reserved1;

	@Field(at = 8, length = 5/*, format = "yyddd"*/)
	private String settlementDate;

	@Field(at = 24, length = 6)
	private String reserved2;

	@Field(at = 26, length = 3, align = Align.RIGHT, padding = '0')
	private String releaseNumber;

	@Field(at = 29, length = 4, align = Align.RIGHT, padding = '0')
	private String testOption;

	@Field(at = 33, length = 29, align = Align.RIGHT, padding = '0')
	private String reserved3;

	@Field(at = 62, length = 8)
	private String securityCode;

	@Field(at = 70, length = 6)
	private String reserved4;

	@Field(at = 76, length = 3)
	private String incomingFileID;

	@Field(at = 79, length = 89)
	private String reserved5;

}
