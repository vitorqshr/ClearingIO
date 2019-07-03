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
@Record(name = "Registro de dados adicionais de ajuste")
@Fields({
	@Field(ordinal = 2,  length = 2 , rid = true, literal = "02")
})
public class FeeCollection12AdditionalData {
	
	@Field(ordinal = 1,  length = 2 , rid = true, regex = "(10|20)")
	private String transactionCode;

	@Field(ordinal = 3,  length = 12 )
	private String futureUse1;
	
	@Field(ordinal = 4,  length = 3 )
	private String codPais;
	
	@Field(ordinal = 5,  length = 3 )
	private String futureUse2;
	
	@Field(ordinal = 6,  length = 3 )
	private Long qtdDiasLiquidacao;
	
	@Field(ordinal = 7,  length = 8,  format = "yyyyMMdd" )
	private String dataProcessamento;
	
	@Field(ordinal = 8,  length = 3 )
	private String codErro;
	
	@Field(ordinal = 9,  length = 19 )
	private String tokenPan;

	@Field(ordinal = 10,  length = 8,  format = "yyyyMMdd" )
	private String dataLiquidacao;
	
	@Field(ordinal = 11,  length = 105 , literal = " ")
	private String futureUse3;
}
