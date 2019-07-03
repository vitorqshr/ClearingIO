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
@Record(name = "Layout das transações - Registro Dados Adicionais (“01”)")
@Fields({
	@Field(at = 2, length = 2, rid = true, literal = "01", name = "Subcódigo da Transação")
})
public class Transaction01AdditionalInformation {
	
	@Field(at = 0, length = 2, rid = true, regex = "(01|05|06|15|16|25|26|35|36|46)", name = "Código da Transação")
	private String transactionCode;

	@Field(at = 4, length = 5, name = "Uso Futuro")
	private String futureUse1;
	
	@Field(at = 9, length = 7, name = "Uso Futuro")
	private String futureUse2;
	
	@Field(at = 16, length = 6, name = "Número de Referência da Disputa")
	private String disputeReferenceNumber;
	
	@Field(at = 22, length = 1, name = "Indicador do Envio de Documentação")
	private String documentationSubmissionIndicator;
	
	@Field(at = 23, length = 50, name = "Texto Livre do Emissor e do Credenciador")
	private String freeTextOfTheIssuerAndTheCreditor;
	
	@Field(at = 73, length = 3, name = "Código do produto")
	private String productCode;
	
	@Field(at = 76, length = 4, name = "Uso Futuro")
	private String futureUse3;
	
	@Field(at = 80, length = 15, name = "Ponto de Venda")
	private String pointOfSale;
	
	@Field(at = 95, length = 8, name = "Número Lógico do Equipamento")
	private String logicalNumberOfEquipment;
	
	@Field(at = 103, length = 12, name = "Valor Taxa de Embarque")
	private String shippingFeeValue;
	
	@Field(at = 115, length = 1, name = "Indicador de Transação feita por corresp./Telefone ou comércio eletrônico")
	private String transactionIndicatorMadeByCorrespondenceTelephoneOrElectronicCommerce;
	
	@Field(at = 116, length = 12, name = "Valor da Transação")
	private String transactionValue;
	
	@Field(at = 128, length = 1, name = "Indicador de Movimentação")
	private String indicatorMovement;
	
	@Field(at = 129, length = 3, name = "Quantidade de Parcelas da Transação")
	private String quantityInstallmentsOfTransaction;
	
	@Field(at = 132, length = 3, name = "Número da Parcela")
	private String installmentNumber;
	
	@Field(at = 135, length = 5, name = "Tarifa Pagamento de Insumo")
	private String taxPaymentProduction;
	
	@Field(at = 140, length = 1, name = "Tipo de Pessoa")
	private String personType;
	
	@Field(at = 141, length = 14, name = "CNPJ ou CPF")
	private String document;
	
	@Field(at = 155, length = 11, name = "Valor de Troco ou Agro Débito")
	private String changeOrAgroDebitAmount;
	
	@Field(at = 166, length = 1, name = "Código Condicional de Transação com Chip")
	private String chipTransactionConditionalCode;
	
	@Field(at = 167, length = 1, name = "Uso Futuro")
	private String futureUse4;
}
