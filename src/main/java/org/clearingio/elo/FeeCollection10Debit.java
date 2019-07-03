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
@Record(name = "Registro 00 - Fee colectionde - Debito")
@Fields({
		@Field(ordinal = 2,  length = 2 , rid = true, literal = "00")
})
public class FeeCollection10Debit {
	
	@Field(ordinal = 1,  length = 2 , rid = true, regex = "(10|20)")
	private String transactionCode;

	@Field(ordinal = 3,  length = 4 )
	private Long codigoDestino;
	
	@Field(ordinal = 4,  length = 4 )
	private Long codigoOrigem;
	
	@Field(ordinal = 5,  length = 4 )
	private String codMotivoTransacao;
	
	@Field(ordinal = 6,  length = 3 )
	private String codPais;
	
	@Field(ordinal = 7,  length = 8,  format = "yyyyMMdd" )
	private String dataEnvio;
	
	@Field(ordinal = 8,  length = 19 )
	private String numeroCartao;
	
	@Field(ordinal = 9,  length = 12 )
	private String valorDestino;
	
	@Field(ordinal = 10,  length = 3 )
	private Long codMoedaDestino;
	
	@Field(ordinal = 11,  length = 12 )
	private String valorOrigem;
	
	@Field(ordinal = 12,  length = 3 )
	private String codMoedaOrigem;
	
	@Field(ordinal = 13,  length = 70 )
	private String msgTexto;
	
	@Field(ordinal = 14,  length = 1 , regex = "(8|0)")
	private Long indicadorLiquidacao;
	
	@Field(ordinal = 15,  length = 15 )
	private Long indicaTransacaoOriginal;
	
	@Field(ordinal = 16,  length = 4)
	private String dataProcessamento;
	
	@Field(ordinal = 17,  length = 2 )
	private String futureUse;
}
