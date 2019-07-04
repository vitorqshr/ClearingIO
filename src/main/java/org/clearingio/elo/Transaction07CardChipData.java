package org.clearingio.elo;

import java.util.Date;
import java.math.BigInteger;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Getter
@Setter
@ToString
@Record(name = "Layout das transações - Registro Dados do Chip do Cartão (tipo “07”)")
@Fields({
	@Field(ordinal = 2, length = 1, literal = "0", name = "Código Qualificador da Transação"),
	@Field(ordinal = 3, length = 1, rid = true, literal = "7", name = "Número de Sequência do Componente da Transação")
})
public class Transaction07CardChipData {
	
	@Field(ordinal = 1, length = 2, rid =true, regex = "(01|05|06|15|16|25|26|35|36|46)", name = "Código da Transação")
	private String transactionCode;

	@Field(ordinal = 4, length = 2, name = "Tipo de Transação")
	private String transactionType;
	
	@Field(ordinal = 5, length = 3, name = "Número Sequencial do Cartão")
	private String cardSequenceNumber;
	
	@Field(ordinal = 6, length = 6, format = "yyMMdd", name = "Data de Transação do Termina")
	private Date terminalTrasactionDate;
	
	@Field(ordinal = 7, length = 6, name = "Capacidade do Terminal")
	private String terminalCapabilityProfile;
	
	@Field(ordinal = 8, length = 3, name = "Código do País do Terminal")
	private String terminalCountryCode;
	
	@Field(ordinal = 9, length = 8, name = "Número de Série do Terminal")
	private String terminalSerialNumber;
	
	@Field(ordinal = 10, length = 8, name = "Número Randômico para Criptograma")
	private String unpredictableNumber;
	
	@Field(ordinal = 11, length = 4, name = "Contador da Transação da Aplicação")
	private BigInteger applicationTransactionNumber;
	
	@Field(ordinal = 12, length = 4, name = "Application Interchange Profile")
	private String applicationInterchangeProfile;
	
	@Field(ordinal = 13, length = 16, name = "Criptograma")
	private String cryptogram;
	
	@Field(ordinal = 14, length = 2, name = "Índice de Derivação da Chave")
	private BigInteger derivationKeyIndex;
	
	@Field(ordinal = 15, length = 2, name = "Número da Versão do Criptograma")
	private String cryptogramVersionNumber;
	
	@Field(ordinal = 16, length = 10, name = "Verificação do Resultado do Terminal")
	private String terminalVerificationResults;
	
	@Field(ordinal = 17, length = 8, name = "Verificação do Resultado do Cartão")
	private String cardVerificationResults;
	
	@Field(ordinal = 18, length = 12, name = "Valor de Transação para Criptograma")
	private BigInteger cryptogramAmount;
	
	@Field(ordinal = 19, length = 10, name = "Form Factor Indicator")
	private String fromFactoryIndicator;
	
	@Field(ordinal = 20, length = 60, name = "Uso futuro")
	private String futureUse;
}
