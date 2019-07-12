package org.clearingio.atc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;
import org.beanio.builder.Align;

@Getter
@Setter
@ToString
@Record(name = "CM – 02 / Dados do CHIP")
@Fields({
	@Field(ordinal = 3, length = 2, rid = true, literal = "02", name = "Componente da Mensagem (CM)")
})
public class CHIPData {
	@Field(ordinal = 1, length = 3, rid = true, regex = "(240|442)", name = "Identificador de Tipo de Mensagem (MTI)")
	private String messageTypeIdentifier;

	@Field(ordinal = 2, length = 3, rid = true, regex = "(200|205|211|450|451)", name = "Código de Função (FC)")
	private String functionCode;

	@Field(ordinal = 3, length = 10, align = Align.RIGHT, padding = '0', name = "Número Sequencial de Registro (NSR)")
	private String sequentialRegistrationNumber;

	@Field(ordinal = 4, length = 3, align = Align.RIGHT, padding = '0', name = "Número Sequencial do Cartão")
	private String cardSequentialNumber;

	@Field(ordinal = 5, length = 6, align = Align.RIGHT, padding = '0', name = "Data da Transação no Terminal = AAMMDD")
	private String transactionDateInTerminal;

	@Field(ordinal = 6, length = 6, align = Align.RIGHT, padding = '0', name = "Perfil da Capacidade do Terminal")
	private String terminalCapacityProfile;

	@Field(ordinal = 7, length = 3, align = Align.RIGHT, padding = '0', name = "Código do País do Terminal")
	private String terminalCountryCode;

	@Field(ordinal = 8, length = 8, name = "Número de Série do Terminal")
	private String terminalSerialNumber;

	@Field(ordinal = 9, length = 8, name = "Número Aleatório")
	private String randomNumber;

	@Field(ordinal = 10, length = 4, name = "Contador de Transações da Aplicação")
	private String applicationTransactionCounter;

	@Field(ordinal = 11, length = 4, name = "Perfil de Intercâmbio da Aplicação")
	private String applicationExchangeProfile;

	@Field(ordinal = 12, length = 16, name = "Criptograma")
	private String cryptogram;

	@Field(ordinal = 13, length = 2, name = "Índice de Chave de Derivação")
	private String derivationKeyIndex;

	@Field(ordinal = 14, length = 2, name = "Número de Versão do Criptograma")
	private String cryptographicVersionNumber;

	@Field(ordinal = 15, length = 10, name = "Resultado de Verificação do Terminal")
	private String terminalCheckResults;

	@Field(ordinal = 16, length = 8, name = "Resultado de Verificação do Cartão")
	private String cardVerificationResult;

	@Field(ordinal = 17, length = 12, align = Align.RIGHT, padding = '0', name = "Valor do Criptograma")
	private String cryptogramValue;

	@Field(ordinal = 18, length = 60, name = "Reservado")
	private String reserved1;

	@Field(ordinal = 19, length = 8, name = "Identificador do Script 1")
	private String scriptIdentifier1;

	@Field(ordinal = 20, length = 2, name = "Resultados do Script 1")
	private String scriptResults1;

	@Field(ordinal = 21, length = 270, name = "Reservado")
	private String reserved2;


}
