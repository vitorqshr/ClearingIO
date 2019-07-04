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
@Record(name = "Registro tipo '02' - Registro de DADOS ADICIONAIS DE TRANSFERÊNCIA DE FUNDOS - Envio de Débito e Crédito")
@Fields({
	@Field(ordinal = 2,  length = 2 , rid = true, literal = "02", name = "Subcódigo da Transação")
})
public class FeeCollectionFinancialDisputeAdjustment02AdditionalData {
	
	@Field(ordinal = 1,  length = 2 , rid = true, regex = "(10|20)", name = "Código da Transação")
	private String transactionCode;

	@Field(ordinal = 3,  length = 12, name = "Uso futuro")
	private String futureUse1;
	
	@Field(ordinal = 4,  length = 3, name = "Código do País")
	private String countryCode;
	
	@Field(ordinal = 5,  length = 3, name = "Uso futuro")
	private String futureUse2;
	
	@Field(ordinal = 6,  length = 3, name = "Quantidade de Dias para Liquidação Financeira da Transação")
	private Long quantityDaysTransactionSettlement;
	
	@Field(ordinal = 7,  length = 8/*,  format = "yyyyMMdd"*/, name = "Data de Processamento")
	private String processingDate;
	
	@Field(ordinal = 8,  length = 3, name = "Código do Erro")
	private String errorCode;
	
	@Field(ordinal = 9,  length = 19, name = "Token PAN")
	private String tokenPan;

	@Field(ordinal = 10,  length = 8/*, format = "yyyyMMdd"*/, name = "Data de Liquidação da transação")
	private String transactionSettlementDate;
	
	@Field(ordinal = 11,  length = 105, name = "Uso futuro")
	private String futureUse3;
}
