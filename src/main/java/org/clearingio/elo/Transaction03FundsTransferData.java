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
@Record(name = "Layout das transações - Registro Dados de Transferência de Fundos (tipo “03”)")
@Fields({
	@Field(ordinal = 2, length = 2, rid = true, literal = "03", name = "Subcódigo da Transação")
})
public class Transaction03FundsTransferData {
	
	@Field(ordinal = 1, length = 2, rid = true, literal = "(01|05|06|15|16|25|26|35|36)", name = "Código da Transação")
	private String transactionCode;

	@Field(ordinal = 3, length = 12, name = "Tipo de Pagamento")
	private String typeOfPayment;
	
	@Field(ordinal = 4, length = 41, name = "Número da Conta ou Número Único de Referência")
	private String accountNumberOrUniqueReferenceNumber;
	
	@Field(ordinal = 5, length = 40, name = "Nome do Remetente")
	private String senderName;
	
	@Field(ordinal = 6, length = 50, name = "Endereço do Remetente")
	private String senderAddress;
	
	@Field(ordinal = 7, length = 25, name = "Cidade do Remetente")
	private String senderCity;
	
	@Field(ordinal = 8, length = 3, name = "País do Remetente")
	private String senderCountry;

	@Field(ordinal = 9, length = 2, name = "Origem dos Fundos")
	private String originOfFunds;
}
