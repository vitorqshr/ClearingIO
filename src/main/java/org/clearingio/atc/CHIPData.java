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
		/**
		 * Componente da Mensagem
		 * Preenchimento: Obrigatório
		 * Início: 7
		 * Tamanho: 2
		 * Tipo: Alfanumérico
		 * Descrição:
		 * 02 = Dados do Chip
		 */
		@Field(ordinal = 3, length = 2, rid = true, literal = "02", name = "Componente da Mensagem (CM)")
})
public class CHIPData {
	/**
	 * Identificador do Tipo de Mensagem (MTI)
	 * Preenchimento: Obrigatório
	 * Início: 1
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * 240 = Apresentação
	 * 442 = Chargeback
	 */
	@Field(ordinal = 1, length = 3, rid = true, regex = "(240|442)", name = "Identificador de Tipo de Mensagem (MTI)")
	private String messageTypeIdentifier;

	/**
	 * Código de Função (FC)
	 * Preenchimento: Obrigatório
	 * Início: 4
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * 200 = Primeira Apresentação
	 * 205 = Segunda Apresentação Total
	 * 211 = Segunda Apresentação Parcial
	 * 450 = Primeiro Chargeback Total
	 * 451 = Primeiro Chargeback Parcial
	 */
	@Field(ordinal = 2, length = 3, rid = true, regex = "(200|205|211|450|451)", name = "Código de Função (FC)")
	private String functionCode;

	/**
	 * NSR – Número Sequencial de Registro
	 * Preenchimento: Obrigatório
	 * Início: 9
	 * Tamanho: 10
	 * Tipo: Numérico
	 * Descrição:
	 * Número sequencial de um CM dentro do arquivo ATC.
	 */
	@Field(ordinal = 3, length = 10, align = Align.RIGHT, padding = '0', name = "Número Sequencial de Registro (NSR)")
	private String sequentialRegistrationNumber;

	/**
	 * Número Sequencial do Cartão
	 * Início: 19
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Número atribuído a um cartão específico quando dois ou mais
	 * cartões estão associados a um único número de conta.
	 */
	@Field(ordinal = 4, length = 3, align = Align.RIGHT, padding = '0', name = "Número Sequencial do Cartão")
	private String cardSequentialNumber;

	/**
	 * Data da Transação no Terminal
	 * Início: 22
	 * Tamanho: 6
	 * Tipo: Numérico
	 * Descrição:
	 * Data local em que a operação foi autorizada. AAMMDD
	 */
	@Field(ordinal = 5, length = 6, align = Align.RIGHT, padding = '0', name = "Data da Transação no Terminal = AAMMDD")
	private String transactionDateInTerminal;

	/**
	 * Perfil da Capacidade do Terminal
	 * Início: 28
	 * Tamanho: 6
	 * Tipo: Hexadecimal
	 * Descrição:
	 * Indica a placa de entrada de dados, o Método de Verificação
	 * do Portador (CVM) e a capacidade de segurança suportada pelo
	 * terminal.
	 */
	@Field(ordinal = 6, length = 6, align = Align.RIGHT, padding = '0', name = "Perfil da Capacidade do Terminal")
	private String terminalCapacityProfile;

	/**
	 * Código do País do Terminal
	 * Início: 34
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Indica o código do país do terminal.
	 * Exemplo: 076 (Brasil)
	 */
	@Field(ordinal = 7, length = 3, align = Align.RIGHT, padding = '0', name = "Código do País do Terminal")
	private String terminalCountryCode;

	/**
	 * Número de Série do Terminal
	 * Início: 37
	 * Tamanho: 8
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Número de identificação único e permanente do chip. Usado para
	 * controlar dispositivos, independente da sua localização.
	 */
	@Field(ordinal = 8, length = 8, name = "Número de Série do Terminal")
	private String terminalSerialNumber;

	/**
	 * Número Aleatório
	 * Início: 45
	 * Tamanho: 8
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Número usado no criptograma para operações com chip.
	 * Provê variabilidade e a singularidade do criptograma.
	 */
	@Field(ordinal = 9, length = 8, name = "Número Aleatório")
	private String randomNumber;

	/**
	 * Contador de Transações da Aplicação
	 * Início: 53
	 * Tamanho: 4
	 * Tipo: Alfanumérico
	 * Contador de Transações da Aplicação
	 * Início: 53
	 * Tamanho: 4
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Número de transações realizadas com o pedido. Incrementado
	 * por um a cada transação iniciada.
	 */
	@Field(ordinal = 10, length = 4, name = "Contador de Transações da Aplicação")
	private String applicationTransactionCounter;

	/**
	 * Perfil de Intercambio da Aplicação
	 * Início: 57
	 * Tamanho: 4
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Fornece uma série de indicadores que refletem as funções
	 * específicas apoiadas pela conta do cartão de chip. Por exemplo,
	 * este campo indica se a verificação do portador do cartão é
	 * suportada.
	 */
	@Field(ordinal = 11, length = 4, name = "Perfil de Intercâmbio da Aplicação")
	private String applicationExchangeProfile;

	/**
	 * Criptograma
	 * Início: 61
	 * Tamanho: 16
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Criptograma de compensação usado para validar transações para
	 * tratamento em caso de litígio.
	 */
	@Field(ordinal = 12, length = 16, name = "Criptograma")
	private String cryptogram;

	/**
	 * Índice de Chave de Derivação
	 * Início: 77
	 * Tamanho: 2
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Índice para lista do emitente de chaves para uso em cartões
	 * on-line.
	 */
	@Field(ordinal = 13, length = 2, name = "Índice de Chave de Derivação")
	private String derivationKeyIndex;

	/**
	 * Número de Versão do Criptograma
	 * Início: 79
	 * Tamanho: 2
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Conjunto de elementos de dados e dos algoritmos usados para
	 * calcular um criptograma.
	 */
	@Field(ordinal = 14, length = 2, name = "Número de Versão do Criptograma")
	private String cryptographicVersionNumber;

	/**
	 * Resultado de Verificação do Terminal
	 * Início: 81
	 * Tamanho: 10
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Contém uma série de indicadores a partir da perspectiva do
	 * terminal.
	 * O terminal registra os resultados do processamento off-line e on
	 * line, definindo uma série de indicadores. Esses indicadores estão
	 * disponíveis para os membros das mensagens on-line e transações
	 * de compensação.
	 */
	@Field(ordinal = 15, length = 10, name = "Resultado de Verificação do Terminal")
	private String terminalCheckResults;

	/**
	 * Resultado de Verificação do Cartão
	 * Início: 91
	 * Tamanho: 8
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Contém uma série de indicadores a partir da perspectiva do cartão.
	 * O cartão registra os resultados do processamento off-line e on-line,
	 * definindo uma série de indicadores. Esses indicadores estão
	 * disponíveis para os membros das mensagens on-line e trans.
	 */
	@Field(ordinal = 16, length = 8, name = "Resultado de Verificação do Cartão")
	private String cardVerificationResult;

	/**
	 * Valor do Criptograma
	 * Início: 99
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * Valor da transação. Duas últimas casas referem-se aos decimais.
	 */
	@Field(ordinal = 17, length = 12, align = Align.RIGHT, padding = '0', name = "Valor do Criptograma")
	private String cryptogramValue;

	/**
	 * Reservado
	 * Início: 111
	 * Tamanho: 60
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Brancos
	 */
	@Field(ordinal = 18, length = 60, name = "Reservado")
	private String reserved1;

	/**
	 * Identificador do Script 1
	 * Início: 171
	 * Tamanho: 8
	 * Tipo: Alfanumérico
	 * Descrição:
	 */
	@Field(ordinal = 19, length = 8, name = "Identificador do Script 1")
	private String scriptIdentifier1;

	/**
	 * Resultados do Script 1
	 * Início: 179
	 * Tamanho: 2
	 * Tipo: Alfanumérico
	 * Descrição:
	 */
	@Field(ordinal = 20, length = 2, name = "Resultados do Script 1")
	private String scriptResults1;

	/**
	 * Reservado
	 * Início: 181
	 * Tamanho: 270
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Brancos
	 */
	@Field(ordinal = 21, length = 270, name = "Reservado")
	private String reserved2;


}
