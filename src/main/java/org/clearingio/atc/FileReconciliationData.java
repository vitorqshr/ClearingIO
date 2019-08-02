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
@Record(name = "CM – 10 / Dados da Reconciliação por Arquivo")
@Fields({
		/**
		 * Identificador do Tipo de Mensagem (MTI)
		 * Preenchimento: Obrigatório
		 * Início: 1
		 * Tamanho: 3
		 * Tipo: Numérico
		 * Descrição:
		 * 544 = Registro de Reconciliação
		 */
		@Field(ordinal = 1, length = 3, literal = "544", name = "Identificador de Tipo de Mensagem (MTI)"),
		/**
		 * Código de Função (FC)
		 * Preenchimento: Obrigatório
		 * Início: 4
		 * Tamanho: 3
		 * Tipo: Numérico
		 * Descrição:
		 * 501 = Reconciliação por Arquivo
		 */
		@Field(ordinal = 2, length = 3, literal = "501", name = "Código de Função (FC)"),
		/**
		 * Componente da Mensagem
		 * Preenchimento: Obrigatório
		 * Início: 7
		 * Tamanho: 2
		 * Tipo: Alfanumérico
		 * Descrição:
		 * 10 = Dados de Reconciliação por Arquivo
		 */
		@Field(ordinal = 3, literal = "10", name = "Componente da Mensagem (CM)")
})
public class FileReconciliationData {
	/**
	 * NSR – Número Sequencial de Registro
	 * Preenchimento: Obrigatório
	 * Início: 9
	 * Tamanho: 10
	 * Tipo: Numérico
	 * Descrição:
	 * Número sequencial de um CM dentro do arquivo ATC.
	 */
	@Field(ordinal = 4, length = 10, align = Align.RIGHT, padding = '0', name = "Número Sequencial de Registro (NSR)")
	private String sequentialRegistrationNumber;

	/**
	 * Identificador do Arquivo Original
	 * Preenchimento: Obrigatório
	 * Início: 19
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * Código de identificação do arquivo, o qual a reconciliação
	 * pertencia.
	 * Este campo contém o número sequencial do arquivo ATCE01
	 * originado pelo membro e encaminhado para o Sistema de
	 * Compensação da Cabal.
	 */
	@Field(ordinal = 5, length = 12, align = Align.RIGHT, padding = '0', name = "Identificador do Arquivo Original")
	private String originalFileIdentifier;

	/**
	 * Bandeira
	 * Preenchimento: Obrigatório
	 * Início: 31
	 * Tamanho: 6
	 * Tipo: Numérico
	 * A data de processamento do arquivo original pela Bandeira.
	 */
	@Field(ordinal = 6, length = 6, align = Align.RIGHT, padding = '0', name = "Data de Aceitação do Arquivo Original pela Bandeira")
	private String originalFileAcceptanceDateByFlag;

	/**
	 * Quantidade de Transações
	 * Preenchimento: Obrigatório
	 * Início: 37
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * Quantidade de transações que foram recebidas no arquivo
	 * original.
	 */
	@Field(ordinal = 7, length = 12, align = Align.RIGHT, padding = '0', name = "Quantidade de Transações")
	private String numberOfTransactions;

	/**
	 * Moeda das Transações
	 * Preenchimento: Obrigatório
	 * Início: 49
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Moeda no local do aceitante do cartão.
	 */
	@Field(ordinal = 8, length = 3, align = Align.RIGHT, padding = '0', name = "Moeda das Transações")
	private String transactionCurrency;

	/**
	 * Valor Total das Transações
	 * Preenchimento: Obrigatório
	 * Início: 52
	 * Tamanho: 17
	 * Tipo: Numérico
	 * Descrição:
	 * Valor total das transações financeiras, na moeda de
	 * transação, que foram recebidas no arquivo.
	 */
	@Field(ordinal = 9, length = 17, align = Align.RIGHT, padding = '0', name = "Valor Total das Transações")
	private String totalTransactionAmount;

	/**
	 * Valor Total de Intercâmbio
	 * Preenchimento: Obrigatório
	 * Início: 69
	 * Tamanho: 17
	 * Tipo: Numérico
	 * Descrição:
	 * Valor total do intercâmbio, na moeda de transação, que
	 * foram recebidos no arquivo.
	 */
	@Field(ordinal = 10, length = 17, align = Align.RIGHT, padding = '0', name = "Valor Total de Intercâmbio")
	private String totalExchangeAmount;

	/**
	 * Valor Total Líquido
	 * Preenchimento: Obrigatório
	 * Início: 86
	 * Tamanho: 17
	 * Tipo: Numérico
	 * Descrição:
	 * Valor Total das Transações subtraído do Valor Total de
	 * Intercâmbio.
	 */
	@Field(ordinal = 11, length = 17, align = Align.RIGHT, padding = '0', name = "Valor Total Líquido na Moeda da Transação")
	private String totalNetAmountInTransactionCurrency;

	/**
	 * Moeda de Liquidação
	 * Preenchimento: Obrigatório
	 * Início: 103
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Código da moeda sobre a qual a liquidação ocorrerá.
	 */
	@Field(ordinal = 12, length = 3, align = Align.RIGHT, padding = '0', name = "Moeda de Liquidação")
	private String settlementCurrency;

	/**
	 * Valor Total de Transações na Moeda de
	 * Liquidação
	 * Preenchimento: Obrigatório
	 * Início: 106
	 * Tamanho: 17
	 * Tipo: Numérico
	 * Descrição:
	 * Valor total das transações financeiras, na moeda de
	 * liquidação, que foram recebidas no arquivo.
	 */
	@Field(ordinal = 13, length = 17, align = Align.RIGHT, padding = '0', name = "Valor Total de Transações na Moeda de Liquidação")
	private String totalSettlementCurrencyTransactions;

	/**
	 * Valor Total de Intercâmbio na Moeda de
	 * Liquidação
	 * Preenchimento: Obrigatório
	 * Início: 123
	 * Tamanho: 17
	 * Tipo: Numérico
	 * Descrição:
	 * Valor total do intercâmbio, na moeda de liquidação, que
	 * foram recebidos no arquivo.
	 */
	@Field(ordinal = 14, length = 17, align = Align.RIGHT, padding = '0', name = "Valor Total de Intercâmbio na Moeda de Liquidação")
	private String totalSettlemenCurrencyExchangeAmount;

	/**
	 * Valor Total Líquido na Moeda de Liquidação
	 * Preenchimento: Obrigatório
	 * Início: 140
	 * Tamanho: 17
	 * Tipo: Numérico
	 * Descrição:
	 * Valor Total das Transações na Moeda de Liquidação
	 * subtraído do Valor Total de Intercâmbio na Moeda de
	 * Liquidação.
	 */
	@Field(ordinal = 15, length = 17, align = Align.RIGHT, padding = '0', name = "Valor Total Líquido na Moeda de Liquidação")
	private String totalNetAmountinSettlementCurrency;

	/**
	 * Tipo Transação
	 * Preenchimento: Obrigatório
	 * Início: 157
	 * Tamanho: 2
	 * Tipo: Numérico
	 * Descrição:
	 * Para cada arquivo enviado pelo Adquirente haverá um
	 * arquivo de retorno (reconciliação) daquele arquivo. O
	 * retorno será separado por tipo de transação.
	 */
	@Field(ordinal = 16, length = 2, align = Align.RIGHT, padding = '0', name = "Tipo Transação")
	private String transactionType;

	/**
	 * Identificador do Tipo de Mensagem Original
	 * Preenchimento: Obrigatório
	 * Início: 159
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Utilizado para identificar o tipo de mensagem que originou o
	 * registro.
	 */
	@Field(ordinal = 17, length = 3, align = Align.RIGHT, padding = '0', name = "Identificador do Tipo de Mensagem Original")
	private String originalMessageTypeIdentifier;

	/**
	 * Identificador do Código de Função Original
	 * Preenchimento: Obrigatório
	 * Início: 162
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Utilizado para identificar o código de função que originou o
	 * registro.
	 */
	@Field(ordinal = 18, length = 3, align = Align.RIGHT, padding = '0', name = "Identificador do Código de Função Original")
	private String originalFunctionCodeIdentifier;

	/**
	 * Reservado
	 * Preenchimento: Opcional
	 * Início: 165
	 * Tamanho: 286
	 * Tipo: Alfanumérico
	 */
	@Field(ordinal = 19, length = 286, name = "Reservado")
	private String reserved;
}
