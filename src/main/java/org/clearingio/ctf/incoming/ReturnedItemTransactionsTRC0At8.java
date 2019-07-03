package org.clearingio.ctf.incoming;


import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;

import org.beanio.annotation.Fields;

import org.beanio.builder.Align;

@Getter
@Setter
@Fields({
	@Field(at = 0, length = 2, regex = "(01|02|03)", rid = true),
	@Field(at = 3, length = 1, regex = "(0|1|2|3|4|5|6|7|8)", rid = true)
})
public class ReturnedItemTransactionsTRC0At8 {
	@Field(at = 2, length = 1)
	private String transactionCodeQualifer;

	@Field(at = 4, length = 164)
	private String returnedTCR;
}
