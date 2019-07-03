package org.clearingio.ipm.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProcessingCodeDto {

	private String cardholderTransactionType;

	private String cardholderFromAccountTypeCode;

	private String cardholderToAccountTypeCode;
}
