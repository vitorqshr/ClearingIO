package org.clearingio.elo;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Getter
@Setter
@Record(name = "Layout das transações - Registro Dados de Companhias Aéreas (tipo “08”)")
@Fields({
		@Field(ordinal = 2, length = 2 , literal = "08")
})
public class Transaction08LiquidationOfAirlineCompanies {
	
	@Field(ordinal = 1, length = 2 , regex = "(01|05|06|15|16|25|26|35|36|46)")
	private String transactionCode;

	@Field(ordinal = 3, length = 3 )
	private String codCompanhiaAerea;
	
	@Field(ordinal = 4, length = 10 )
	private String numeroDocumentoEmbarque;
	
	@Field(ordinal = 5, length = 7 )
	private String codigoAgenteIata;
	
	@Field(ordinal = 6, length = 25 )
	private String nomePassageiro;
	
	@Field(ordinal = 7, length = 3 )
	private String codigoCidade1;
	
	@Field(ordinal = 8, length = 4 )
	private String transportadora1;
	
	@Field(ordinal = 9, length = 2 )
	private String classeServico1;
	
	@Field(ordinal = 10, length = 3 )
	private String codigoCidade2;
	
	@Field(ordinal = 11, length = 4 )
	private String transportadora2;
	
	@Field(ordinal = 12, length = 2 )
	private String classeServico2;
	
	@Field(ordinal = 13, length = 3 )
	private String codigoCidade3;
	
	@Field(ordinal = 14, length = 4 )
	private String transportadora3;
	
	@Field(ordinal = 15, length = 2 )
	private String classeServico3;
	
	@Field(ordinal = 16, length = 3 )
	private String codigoCidade4;
	
	@Field(ordinal = 17, length = 4 )
	private String transportadora4;
	
	@Field(ordinal = 18, length = 2 )
	private String classeServico4;
	
	@Field(ordinal = 19, length = 3 )
	private String codigoCidade_5;
	
	@Field(ordinal = 20, length = 3 )
	private String codAeroporteDestino;
	
	@Field(ordinal = 21, length = 6,  format = "AAMMDD" )
	private String dataPrimeiroVoo;
	
	@Field(ordinal = 22, length = 30 )
	private String nomeAgenteEmissorDoc;
	
	@Field(ordinal = 23, length = 41 )
	private String futureUse;
}
