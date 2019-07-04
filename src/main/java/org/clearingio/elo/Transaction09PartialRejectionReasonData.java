package org.clearingio.elo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Getter
@Setter
@ToString
@Record(name = "Layout das transações - Registro Dados do Motivo de Rejeição Parcial (tipo “09”)")
@Fields({
	@Field(ordinal = 2, length = 2, rid =true, literal = "09", name = "Subcódigo da Transação")
})
public class Transaction09PartialRejectionReasonData {

	@Field(ordinal = 1, length = 2, rid =true, regex = "(01|05|06|15|16|25|26,35,36,46)", name = "Código da Transação")
	private String transactionCode;

	@Field(ordinal = 3, length = 12, name = "Uso futuro")
	private String futureUse1;

	@Field(ordinal = 4, length = 2, required = true, name = "Código da Transação original")
	private String originalTransactionCode;

	@Field(ordinal = 5, length = 2, name = "Uso futuro")
	private String futureUse2;

	@Field(ordinal = 6, length = 8, required = true, name = "Data do Movimento")
	private String dateOfMovement;

	@Field(ordinal = 7, length = 7, name = "Uso futuro")
	private String futureUse3;

	@Field(ordinal = 8, length = 3, required = true, name = "Código do Erro")
	private String errorCode;

	@Field(ordinal = 9, length = 80, name = "Descrição do Erro")
	private String errorDescription;

	@Field(ordinal = 10, length = 2, name = "Registro com Erro")
	private String errorLog;

	@Field(ordinal = 11, length = 3, name = "Posição com Erro")
	private String positionWithError;

	@Field(ordinal = 12, length = 45, name = "Uso futuro")
	private String futureUse4;
}
