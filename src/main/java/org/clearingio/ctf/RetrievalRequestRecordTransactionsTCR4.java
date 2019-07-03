package org.clearingio.ctf;


import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;

import org.beanio.annotation.Fields;

import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, literal = "52", rid = true),
	@Field(at = 3, length = 1, literal = "4", rid = true)
})
public class RetrievalRequestRecordTransactionsTCR4 {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 12)
	private String reserved1;

	@Field(at = 16, length = 4, align = Align.RIGHT, padding = '0')
	private Long networkIdentifcationCode;

	@Field(at = 20, length = 25)
	private String contactforInformation;

	@Field(at = 45, length = 123)
	private String reserved2;
}
