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
@Record(name = "Layout das transações - Registro Dados de Serviço de Pagamento (tipo “05”)")
@Fields({
	@Field(ordinal = 2, length = 1, literal = "0", name = "Código Qualificador da Transação"),
	@Field(ordinal = 3, length = 1, rid = true, literal = "5", name = "Número de Sequência do Componente da Transação")
})
public class Transaction05PaymentServiceData {
	
	@Field(ordinal = 1, length = 2, rid = true, regex = "(01|05|06|15|16|25|26|35|36|46)", name = "Código da Transação")
	private String transactionCode;

	@Field(ordinal = 4, length = 15, name = "Identificador da Transação")
	private String transactionIdentifier;
	
	@Field(ordinal = 5, length = 12, name = "Valor Autorizado")
	private String authorizedAmount;
	
	@Field(ordinal = 6, length = 3, name = "Código da Moeda do Valor Autorizado")
	private String authorizedAmountCurrencyCode;
	
	@Field(ordinal = 7, length = 2, name = "Código de Resposta da Autorização")
	private String authorizationResponseCode;
	
	@Field(ordinal = 8, length = 4, name = "Uso Futuro")
	private String futureUse1;
	
	@Field(ordinal = 9, length = 1, name = "Uso Futuro")
	private String futureUse2;
	
	@Field(ordinal = 10, length = 1, name = "Uso Futuro")
	private String futureUse3;
	
	@Field(ordinal = 11, length = 2, name = "Indicador de Direito de Devolução")
	private String devolutionRightIndicator;
	
	@Field(ordinal = 12, length = 2, name = "Indicador de Comércio Eletrônico")
	private Integer eCommerceIndicator;
	
	@Field(ordinal = 13, length = 2, name = "Uso Futuro")
	private Integer futureUse4;
	
	@Field(ordinal = 14, length = 1, name = "Indicador Autorização Específica")
	private String specificAuthorizationIndicator;
	
	@Field(ordinal = 15, length = 12, name = "Valor Total Autorizado")
	private String authorizedTotalAmount;

	@Field(ordinal = 16, length = 42, name = "Valor de Verificação de Autenticação do Portador")
	private String amountCAVV;

	@Field(ordinal = 17, length = 1, name = "Código de Resultado da Verificação do CAVV")
	private String codeCAVV;

	@Field(ordinal = 18, length = 64, name = "Uso Futuro")
	private String futureUse5;
}
