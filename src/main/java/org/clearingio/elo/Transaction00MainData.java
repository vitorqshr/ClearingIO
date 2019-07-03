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
@Record(name = "Layout das transações - Registro Dados Principais (“00”)")
@Fields({
	@Field(ordinal = 2, length = 2, rid = true, literal = "00", name = "Subcódigo da Transação")
})
public class Transaction00MainData {

	@Field(ordinal = 1, length = 2, rid = true, regex = "(01|05|06|15|16|25|26|35|36|46)", name = "Código da Transação")
	private String transactionCode;

	@Field(ordinal = 3, length = 19, name = "Número do Cartão")
	private String cardNumber;
	
	@Field(length = 1, name = "Tipo de Liquidação")
	private String settlementType;
	
	@Field(length = 1, name = "Uso futuro")
	private String futureUse1;
	
	@Field(length = 1, name = "Indicador de Origem da Autorização ou Cancelamento")
	private String sourceIndicatorOfTheAuthorizationOrCancellation;
	
	@Field(length = 23, name = "Número de Referência da Transação")
	private String transactionReferenceNumber;
	
	@Field(length = 2, name = "Uso Futuro")
	private String futureUse2;
	
	@Field(length = 2, name = "Código de Processo")
	private String processCode;
	
	@Field(length = 4, literal = "5390", name = "Código do Credenciador")
	private String accreditingCode;
	
	@Field(length = 8, name = "Data da Venda/Saque")
	private String dateOfSaleWithdrawal;
	
	@Field(length = 6, name = "Hora da Venda/Saque")
	private String timeOfSaleWithdrawal;
	
	@Field(length = 5, name = "Uso futuro")
	private String futureUse3;
	
	@Field(length = 12, name = "Valor da Venda/Saque ou Valor do Disputa")
	private String amountOfSaleCashOrDispute;
	
	@Field(length = 3, name = "Código da Moeda da Transação")
	private String transactionCurrencyCode;
	
	@Field(length = 25, name = "Nome do PV (Ponto de Venda)")
	private String namePointOfSale;

	@Field(length = 13, name = "Cidade do PV (Ponto de Venda)")
	private String cityPointOfSale;
	
	@Field(length = 3, name = "Código do País do PV (Ponto de Venda)")
	private String countryCodePointOfSale;
	
	@Field(length = 4, name = "MCC do PV (Ponto de Venda)")
	private String mccPointOfSale;
	
	@Field(length = 1, name = "Uso Futuro")
	private String futureUse4;
	
	@Field(length = 4, name = "Banco Emissor")
	private String issuerBank;
	
	@Field(length = 2, name = "Uso Futuro")
	private String futureUse5;
	
	@Field(length = 3, name = "Código da Bandeira")
	private String flagCode;
	
	@Field(length = 1, name = "Identificação do Tipo de Transação")
	private String transactionTypeIdentification;
	
	@Field(length = 2, name = "Código de Motivo do Disputa")
	private String codeOfReasonForDispute;
	
	@Field(length = 6, name = "Código de Autorização da Transação")
	private String transactionAuthorizationCode;
	
	@Field(length = 1, name = "Indicador de Tecnologia do Terminal")
	private String indicatorOfTechnologyTerminal;
	
	@Field(length = 1, name = "Meio de Identificação do Portador")
	private String middleIdentificationHolder;
	
	@Field(length = 1, name = "Uso Futuro")
	private String futureUse6;
	
	@Field(length = 2, name = "Modo de Entrada da Transação no POS")
	private String transactionEntryModeInThePOS;
	
	@Field(length = 8, name = "Data do Movimento/Data de apresentação do Disputa")
	private String dateOfTheMotionDisputeFilingDate;
}
