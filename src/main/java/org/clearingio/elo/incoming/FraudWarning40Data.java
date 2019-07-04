package org.clearingio.elo.incoming;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Getter
@Setter
@ToString
@Record(name = "Layout para transação TE40 - Registro Dados de Aviso de Fraude (tipo “00”)")
@Fields({
	@Field(at = 0,  length = 2, rid =true, literal = "40", name = "Código da Transação"),
	@Field(at = 2,  length = 2, rid =true, literal = "00", name = "Subcódigo da Transação")
})
public class FraudWarning40Data {

	@Field(at = 4,  length = 16, name = "Número do Cartão")
	private String cardNumber;

	@Field(at = 20,  length = 7, name = "Complemento do Número do Cartão")
	private String cardNumberComplement;

	@Field(at = 27,  length = 23, name = "Número de Referência da Transação")
	private String transactionReferenceNumber;
	
	@Field(at = 50,  length = 4, name = "Uso Futuro")
	private String futureUse1;

	@Field(at = 54,  length = 4, name = "Código do Credenciador")
	private String credentialingCode;
	
	@Field(at = 58,  length = 8, name = "Data da Venda/Saque")
	private String dateOfSaleWithdrawal;
	
	@Field(at = 66,  length = 25, name = "Uso Futuro")
	private String futureUse2;
	
	@Field(at = 91,  length = 11, name = "Cidade do PV (Ponto de Venda)")
	private String cityPointOfSale;
	
	@Field(at = 102,  length = 3, name = "Código do País do PV (Ponto de Venda)")
	private String countryCodePointOfSale;
	
	@Field(at = 105,  length = 4, name = "MCC do PV (Ponto de Venda)")
	private String mccPointOfSale;
	
	@Field(at = 109,  length = 12, name = "Valor da Fraude")
	private String fraudAmount;

	@Field(at = 121,  length = 3, name = "Código da Moeda da Transação Fraudulenta")
	private String fraudulentTransactionCurrencyCode;
	
	@Field(at = 124,  length = 8, name = "Data de Notificação da Fraude")
	private String fraudNotificationDate;
	
	@Field(at = 132,  length = 1, name = "Indicador de Origem da Autorização")
	private String authorizationSourceIndicator;
	
	@Field(at = 133,  length = 1, name = "Código da Notificação")
	private String notificationCode;
	
	@Field(at = 134,  length = 2, name = "Tipo de Fraude")
	private String typeOfFraud;
	
	@Field(at = 136,  length = 4, name = "Data de Vencimento do Cartão")
	private String cardExpirationDate;
	
	@Field(at = 140,  length = 10, name = "Uso Futuro")
	private String futureUse3;

	@Field(at = 150,  length = 2, regex = "(DB|CR)", name = "Tipo de Plataforma")
	private String typeOfPlatform;
	
	@Field(at = 152,  length = 3, literal = "007", name = "Código da Bandeira")
	private String flagCode;
	
	@Field(at = 155,  length = 1, name = "Uso Futuro")
	private String futureUse4;
	
	@Field(at = 156,  length = 4, name = "Banco Emissor")
	private String bankOfIssuer;
	
	@Field(at = 160,  length = 8, name = "Uso Futuro")
	private String futureUse5;
}
