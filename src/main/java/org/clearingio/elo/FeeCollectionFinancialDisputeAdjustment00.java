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
@Record(name = "Registro tipo '00' - Registro de Ajuste Financeiro de Disputa - Envio de Débito e Crédito")
@Fields({
	@Field(ordinal = 2,  length = 2 , rid = true, literal = "00", name = "Subcódigo da Transação")
})
public class FeeCollectionFinancialDisputeAdjustment00 {
	
	@Field(ordinal = 1,  length = 2 , rid = true, regex = "(10|20)", name = "Código da Transação")
	private String transactionCode;

	@Field(ordinal = 3,  length = 4, name = "Código de Destino")
	private Long destinationCode;
	
	@Field(ordinal = 4,  length = 4, name = "Código da Origem")
	private Long sourceCode;
	
	@Field(ordinal = 5,  length = 4, name = "Código de Motivo da Transação")
	private String transactionReasonCode;
	
	@Field(ordinal = 6,  length = 3, name = "Código do País")
	private String countryCode;
	
	@Field(ordinal = 7,  length = 8,  format = "yyyyMMdd", name = "Data de Envio")
	private String sendDate;
	
	@Field(ordinal = 8,  length = 19, name = "Número do Cartão")
	private String cardNumber;
	
	@Field(ordinal = 9,  length = 12, name = "Valor de Destino")
	private String destinationAmount;
	
	@Field(ordinal = 10,  length = 3, name = "Código da Moeda de Destino")
	private Long destinationCurrencyCode;
	
	@Field(ordinal = 11,  length = 12, name = "Valor de Origem")
	private String sourceAmount;
	
	@Field(ordinal = 12,  length = 3, name = "Código da Moeda de Origem")
	private String sourceCurrencyCode;
	
	@Field(ordinal = 13,  length = 70, name = "Mensagem de Texto")
	private String textMessage;
	
	@Field(ordinal = 14,  length = 1 , regex = "(8|0)", name = "Indicador de Liquidação")
	private Long settlementIndicator;
	
	@Field(ordinal = 15,  length = 15, name = "Identificador da Transação Original")
	private Long originalTransactionIdentifier;
	
	@Field(ordinal = 16,  length = 4, name = "Data de Processamento")
	private String processingDate;
	
	@Field(ordinal = 17,  length = 2, name = "Uso futuro")
	private String futureUse;
}
