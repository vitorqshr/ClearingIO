package org.clearingio.elo;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Getter
@Setter
@Record(name = "Layout das transações - Registro Dados do Motivo de Rejeição Parcial (tipo “09”)")
@Fields({
		@Field(ordinal = 2, length = 2, rid =true, literal = "09", name = "codigoServico")
})
public class Transaction09PartialRejectionReasonData {

	@Field(ordinal = 1, length = 2, rid =true, regex = "(01|05|06|15|16|25|26,35,36,46)")
	private String transactionCode;

	@Field(ordinal = 3, length = 12)
	private String futureUse1;

	@Field(ordinal = 4, length = 2, required = true)
	private String codigoTransacaoOriginal;

	@Field(ordinal = 5, length = 2)
	private String futureUse2;

	@Field(ordinal = 6, length = 8, required = true)
	private String dataMovimento;

	@Field(ordinal = 7, length = 7)
	private String futureUse3;

	@Field(ordinal = 8, length = 3, required = true)
	private String codigoErro;

	@Field(ordinal = 9, length = 80)
	private String descricaoErro;

	@Field(ordinal = 10, length = 2)
	private String registroComErro;

	@Field(ordinal = 11, length = 3)
	private String posicaoErro;

	@Field(ordinal = 12, length = 45)
	private String futureUse4;
}
