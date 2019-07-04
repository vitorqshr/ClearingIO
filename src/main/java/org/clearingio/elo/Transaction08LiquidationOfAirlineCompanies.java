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
@Record(name = "Layout das transações - Registro Dados de Companhias Aéreas (tipo “08”)")
@Fields({
	@Field(ordinal = 2, length = 2 , literal = "08", name = "Subcódigo da Transação")
})
public class Transaction08LiquidationOfAirlineCompanies {
	
	@Field(ordinal = 1, length = 2 , regex = "(01|05|06|15|16|25|26|35|36|46)", name = "Código da Transação")
	private String transactionCode;

	@Field(ordinal = 3, length = 3, name = "Código da Companhia Aérea")
	private String airlineCode;
	
	@Field(ordinal = 4, length = 10, name = "Número do Documento de Embarque")
	private String billOfLadingNumber;
	
	@Field(ordinal = 5, length = 7, name = "Código do Agente IATA")
	private String  agentCodeIATA;
	
	@Field(ordinal = 6, length = 25, name = "Nome do Passageiro")
	private String passengerName;
	
	@Field(ordinal = 7, length = 3, name = "Código da Cidade 1")
	private String cityCode1;
	
	@Field(ordinal = 8, length = 4, name = "Transportadora 1")
	private String shippingCompany1;
	
	@Field(ordinal = 9, length = 2, name = "Classe de Serviço 1")
	private String classOfService1;
	
	@Field(ordinal = 10, length = 3, name = "Código da Cidade 2")
	private String cityCode2;
	
	@Field(ordinal = 11, length = 4, name = "Transportadora 2")
	private String shippingCompany2;
	
	@Field(ordinal = 12, length = 2, name = "Classe de Serviço 2")
	private String classOfService2;
	
	@Field(ordinal = 13, length = 3, name = "Código da Cidade 3")
	private String cityCode3;
	
	@Field(ordinal = 14, length = 4, name = "Transportadora 3")
	private String shippingCompany3;
	
	@Field(ordinal = 15, length = 2, name = "Classe de Serviço 3")
	private String classOfService3;
	
	@Field(ordinal = 16, length = 3, name = "Código da Cidade 4")
	private String cityCode4;
	
	@Field(ordinal = 17, length = 4, name = "Transportadora 4")
	private String shippingCompany4;
	
	@Field(ordinal = 18, length = 2, name = "Classe de Serviço 4")
	private String classOfService4;
	
	@Field(ordinal = 19, length = 3, name = "Código da Cidade 5")
	private String cityCode5;
	
	@Field(ordinal = 20, length = 3, name = "Código do Aeroporto de Destino")
	private String destinationAirportCode;
	
	@Field(ordinal = 21, length = 6,  format = "AAMMDD", name = "Data do Primeiro Voo")
	private String firstDateFlight;
	
	@Field(ordinal = 22, length = 30, name = "Nome do Agente Emissor do Documento")
	private String documentIssuingAgentName;
	
	@Field(ordinal = 23, length = 41, name = "Uso futuro")
	private String futureUse;
}
