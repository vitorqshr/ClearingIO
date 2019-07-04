package org.clearingio.elo.incoming;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Getter
@Setter
@Record(name = "Layout para transação TE40 - Registro Dados de Adicionais de Fraude (tipo “02”)")
@Fields({
	@Field(at = 0,  length = 2 , rid = true, literal = "40", name = "Código da Transação"),
	@Field(at = 2,  length = 2 , rid = true, literal = "02", name = "Subcódigo da Transação")
})
public class FraudWarning40AdditionalData {

	@Field(at = 4,  length = 15, name = "Identificador da Transação")
	private String transactionIdentifier;
	
	@Field(at = 19,  length = 1 , literal = " ", name = "Uso Futuro")
	private String futureUse1;
	
	@Field(at = 20,  length = 2 , literal = "00", name = "Uso Futuro")
	private String futureUse2;
	
	@Field(at = 22,  length = 15, name = "PV (Ponto de Venda)")
	private String pointOfSale;
	
	@Field(at = 37,  length = 8, name = "Número Lógico do Equipamento")
	private String logicalNumberOfEquipment;
	
	@Field(at = 45,  length = 8 , literal = "        ", name = "Uso Futuro")
	private String futureUse3;
	
	@Field(at = 53,  length = 1, name = "Indicador de Transação com Troco")
	private String exchangeTransactionIndicator;
	
	@Field(at = 54,  length = 6, name = "Código de Autorização da Transação")
	private String transactionAuthorizationCode;
	
	@Field(at = 60,  length = 1, name = "Meio de Identificação do Portador")
	private String carrierIdentificationMedium;
	
	@Field(at = 61,  length = 2, name = "Modo de Entrada da Transação no POS")
	private String transactionEntryModeInThePOS;
	
	@Field(at = 63,  length = 1, name = "Identificação de Tecnologia do Terminal")
	private String terminalTechnologyIdentification;
	
	@Field(at = 64,  length = 1, name = "Tecnologia do Cartão")
	private String cardTechnology;
	
	@Field(at = 65,  length = 6, name = "Uso Futuro")
	private String futureUse4;
	
	@Field(at = 71,  length = 9, name = "Valor de Troco")
	private String exchangeAmount;
	
	@Field(at = 80,  length = 1 , literal = " ", name = "Uso Futuro")
	private String futureUse5;
	
	@Field(at = 81,  length = 1, name = "Indicador de Transação feita por corresp./Telefone ou comércio eletrônico")
	private String transactionIndicatorCorrespondenceTelephoneOrECommerce;
	
	@Field(at = 82,  length = 10, name = "CEP do Portador")
	private String cardholderZIPCode;
	
	@Field(at = 92,  length = 11, name = "Cidade do Portador")
	private String cardholderCity;
	
	@Field(at = 103,  length = 2, name = "UF do Portador")
	private String cardholderState;
	
	@Field(at = 105,  length = 8, name = "Data da Confirmação da Fraude")
	private String dateOfFraudConfirmation;
	
	@Field(at = 113,  length = 1, name = "Indicador de Liquidação")
	private String settlementIndicator;
	
	@Field(at = 114,  length = 30, name = "Nome do Portador")
	private String carholderName;
	
	@Field(at = 144,  length = 19, name = "Token PAN")
	private String tokenPAN;
	
	@Field(at = 163,  length = 5 , literal = "     ", name = "Uso Futuro")
	private String futureUse6;
}
