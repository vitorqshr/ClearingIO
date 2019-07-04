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
@Record(name = "Registro BZ - Trailer")
@Fields({
	@Field(ordinal = 1, length = 2, rid =true, literal = "BZ", name = "Código do Registro"),
	@Field(ordinal = 2, length = 2, rid =true, literal = "10", name = "Código do Serviço")
})
public class TrailerBZ {

	@Field(ordinal = 3, length = 4, name = "Número da Remessa")
	private String shippingNumber;
	
	@Field(ordinal = 4, length = 8, name = "Quantidade de Transações de Crédito em Moeda Real")
	private String quantityOfRealCurrencyCreditTransactions;
	
	@Field(ordinal = 5, length = 15, name = "Valor Total das Transações de Créditos em Moeda Real")
	private String totalAomuntOfCreditTransactionsInRealCurrency;
	
	@Field(ordinal = 6, length = 8, name = "Quantidade de Transações de Débito em Moeda Real")
	private String quantityOfDebitTransactionsInRealCurrency;
	
	@Field(ordinal = 7, length = 15, name = "Valor Total das Transações de Débitos em Moeda Real")
	private String totalAmountOfRealCurrencyDebtTransactions;
	
	@Field(ordinal = 8, length = 8, name = "Quantidade de Transações de Crédito em Moeda Dólar")
	private String quantityOfCreditTransactionsInDollarCurrency;
	
	@Field(ordinal = 9, length = 15, name = "Valor Total das Transações de Créditos em Moeda Dólar")
	private String totalAmountOfDollarCurrencyCreditTransactions;
	
	@Field(ordinal = 10, length = 8, name = "Quantidade de Transações de Débito em Moeda Dólar")
	private String quantityOfDebitTransactionsInDollarCurrency;
	
	@Field(ordinal = 11, length = 15, name = "Valor Total das Transações de Débitos em Moeda Dólar")
	private String totalAmountOfDollarCurrencyCurrencyTransactions;
	
	@Field(ordinal = 12, length = 8, name = "Quantidade Total de Registros")
	private String totalQuantityOfRecords;
	
	@Field(ordinal = 13, length = 8, name = "Quantidade de Transações de Movimentação de Parcelado")
	private String quantityOfParcelTransactionsTransactions;
	
	@Field(ordinal = 14, length = 15, name = "Valor Total das Transações de Movimentação de Parcelado")
	private String totalAmountOfParcelTransactionsTransactions;
	
	@Field(ordinal = 15, length = 36)
	private String futureUse;
	
	@Field(ordinal = 16, length = 1, name = "Indicador de Rota do Arquivo")
	private Integer fileRouteIndicator;
}
