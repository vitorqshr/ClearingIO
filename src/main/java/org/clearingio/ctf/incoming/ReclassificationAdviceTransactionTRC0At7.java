package org.clearingio.ctf.incoming;


import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Getter
@Setter
@Record
@Fields({
		@Field(at = 0, length = 2, literal = "04", rid = true, name = "Transaction Code"),
		@Field(at = 2, length = 1, literal = "0", rid = true, name = "Transaction Code Qualifer"),
})
public class ReclassificationAdviceTransactionTRC0At7 {
	@Field(at = 3, length = 1, regex = "(0|1|2|3|4|5|6|7|8)", rid = true, name = "Transaction Component Sequence Number")
	private String transactionComponentSequenceNumber;

	@Field(at = 45, length = 164)
	private String contentsOfReclassifedTCR;

}
