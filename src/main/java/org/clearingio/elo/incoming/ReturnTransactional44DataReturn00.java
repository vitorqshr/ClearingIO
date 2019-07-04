package org.clearingio.elo.incoming;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

@Getter
@Setter
@ToString
@Record(name = "Layout para transação TE44 - Registro Dados do Retorno da Remessa Processada (tipo “00”)")
@Fields({
		@Field(ordinal = 1, length = 2 , rid = true, literal = "44", name = "Código da Transação"),
		@Field(ordinal = 2, length = 2 , rid = true, literal = "00", name = "Subcódigo da Transação")
})
public class ReturnTransactional44DataReturn00 {

	@Field(ordinal = 3, length = 1 , literal = "0", name = "Uso Futuro")
	private String futureUse1;
	
	@Field(ordinal = 4, length = 4, name = "Banco Emissor")
	private String bankIssuer;
	
	@Field(ordinal = 5, length = 4, name = "Uso Futuro")
	private String futureUse2;
	
	@Field(ordinal = 6, length = 8, name = "Data do Movimento")
	private String dateOfMovement;
	
	@Field(ordinal = 7, length = 6, name = "Número da remessa")
	private String shippingNumber;
	
	@Field(ordinal = 8, length = 8, name = "Data de Confirmação da Remessa")
	private String shipmentConfirmationDate;
	
	@Field(ordinal = 9, length = 1 , regex = "(A|R)", name = "Situação da Remessa")
	private String deliveryStatus;
	
	@Field(ordinal = 10, length = 2, name = "Motivo da Rejeição")
	private String reasonOfRejection;
	
	@Field(ordinal = 11, length = 3, name = "Código da Moeda da Transação")
	private String transactionCurrencyCode;
	
	@Field(ordinal = 12, length = 1, name = "Indicador de Tipo de Retorno")
	private String returnTypeIndicator;
	
	@Field(ordinal = 13, length = 15, name = "Quantidade Total de Registros no Arquivo")
	private String totalQuantityOfRecordsInTheArchive;
	
	@Field(ordinal = 14, length = 15, name = "Quantidade de Transações Aceitas em Moeda Real")
	private String quantityOfTransactionsAcceptedInRealCurrency;
	
	@Field(ordinal = 15, length = 15, name = "Valor das Transações Aceitas em Moeda Real")
	private String amountOfTransactionsAcceptedInRealCurrency;
	
	@Field(ordinal = 16, length = 8, name = "Quantidade de Transações Rejeitadas em Moeda Real")
	private String quantityOfRejectedTransactionsInRealCurrency;
	
	@Field(ordinal = 17, length = 15, name = "Valor das Transações Rejeitadas em Moeda Real")
	private String aomuntOfRejectedTransactionsInRealCurrency;
	
	@Field(ordinal = 18, length = 3, name = "Código da Bandeira")
	private String flagCode;
	
	@Field(ordinal = 19, length = 8, name = "Quantidade de Transações Aceitas em Moeda Dólar")
	private String quantityOfTransactionsAcceptedInDollarCurrency;
	
	@Field(ordinal = 20, length = 15, name = "Valor das Transações Aceitas em Moeda Dólar")
	private String amountOfTransactionsAcceptedInDollarCurrency;
	
	@Field(ordinal = 21, length = 8, name = "Quantidade de Transações Rejeitadas em Moeda Dólar")
	private String quantityOfRejectedTransactionsInDollarCurrency;
	
	@Field(ordinal = 22, length = 15, name = "Valor das Transações Rejeitadas em Moeda Dólar")
	private String amountOfRejectedTransactionsInDollarCurrency;
	
	@Field(ordinal = 23, length = 9, name = "Uso Futuro")
	private String futureUse3;
}
