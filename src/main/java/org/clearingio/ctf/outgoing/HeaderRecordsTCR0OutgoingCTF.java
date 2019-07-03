package org.clearingio.ctf.outgoing;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, literal = "90", rid = true)
})
public class HeaderRecordsTCR0OutgoingCTF {

	@Field(at = 2, length = 6)
	private String processingBIN;

	@Field(at = 8, length = 5, format = "yyddd")
	private String processingDate;

	@Field(at = 13, length = 16)
	private String reserved1;

	@Field(at = 29, length = 4)
	private String testOption;

	@Field(at = 33, length = 29)
	private String reserved2;

	@Field(at = 62, length = 8)
	private String securityCode;

	@Field(at = 70, length = 6)
	private String reserved3;

	@Field(at = 76, length = 3, align = Align.RIGHT, padding = '0')
	private String outgoingFileID;

	@Field(at = 79, length = 89)
	private String reserved4;
}
