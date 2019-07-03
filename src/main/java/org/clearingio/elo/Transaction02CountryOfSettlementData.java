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
@Record(name = "Layout das transações - Registro Dados do País de Liquidação (tipo “02”)")
@Fields({
	@Field(ordinal = 2, length = 2, rid = true, literal = "02", name = "Subcódigo da Transação")
})
public class Transaction02CountryOfSettlementData {
	
	@Field(ordinal = 1, length = 2, rid = true, regex = "(01|05|06|15|16|25|26|35|36|46)", name = "Código da Transação")
	private String transactionCode;

	@Field(ordinal = 3, length = 12, name = "Uso futuro")
	private String futureUse1;
	
	@Field(ordinal = 4, length = 3, name = "Código do País da Liquidação")
	private String countryCodeOfSettlement;
	
	@Field(ordinal = 5, length = 3, name = "Uso futuro")
	private String futureUse2;
	
	@Field(ordinal = 6, length = 3, name = "Quantidade de Dias para Liquidação Financeira da Transação")
	private String quantityOfDaysForTransactionSettlement;
	
	@Field(ordinal = 7, length = 10, name = "Valor do Intercâmbio")
	private String interchangeAmount;
	
	@Field(ordinal = 8, length = 8, name = "Data do Movimento da Transação Original")
	private String transactionDateOriginal;
	
	@Field(ordinal = 9, length = 5, name = "Tipo de Operação")
	private String operationType;
	
	@Field(ordinal = 10, length = 19, name = "Token PAN")
	private String tokenPAN;
	
	@Field(ordinal = 11, length = 11, name = "Token Requestor ID")
	private String tokenRequestorID;
	
	@Field(ordinal = 12, length = 2, name = "Token Assurance Level")
	private String tokenAssuranceLevel;

	@Field(ordinal = 13, length = 8, name = "CEP do Estabelecimento Comercial")
	private String zipCodeOfTheCommercialEstablishment;

	@Field(ordinal = 14, length = 8, name = "Data de liquidação da transação")
	private String transactionSettlementDate;

	@Field(ordinal = 15, length = 15, name = "Código do PV no Marketplace")
	private String MarketplacePointSaleCode;

	@Field(ordinal = 16, length = 57, name = "Uso futuro")
	private String futureUse3;
}
