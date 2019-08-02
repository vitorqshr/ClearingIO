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
@Record(value = "CM – 05 / Dados de Cancelamento e Desfazimento")
@Fields({
		/**
		 * Identificador do Tipo de Mensagem (MTI)
		 * Preenchimento: Obrigatório
		 * Início: 1
		 * Tamanho: 3
		 * Tipo: Numérico
		 * Descrição:
		 * 420 = Cancelamento/Desfazimento
		 */
		@Field(ordinal = 1, length = 3, literal = "420", name = "Message Type Indicator (MTI)"),
		/**
		 * Código de Função (FC)
		 * Preenchimento: Obrigatório
		 * Início: 4
		 * Tamanho: 3
		 * Tipo: Numérico
		 * Descrição:
		 * 420 = Cancelamento e Desfazimento
		 */
		@Field(ordinal = 2, length = 3, literal = "420", name = "Function Code (FC)"),
		/**
		 * Componente da Mensagem
		 * Preenchimento: Obrigatório
		 * Início: 7
		 * Tamanho: 2
		 * Descrição:
		 * 05 = Dados de Cancelamento e Desfazimento
		 */
		@Field(ordinal = 3, length = 2, literal = "05", name = "Componente Mensagem")
})
public class CancellationAndUndoingData {
	/**
	 * Tipo: Alfanumérico
	 * NSR – Número Sequencial de Registro
	 * Preenchimento: Obrigatório
	 * Início: 9
	 * Tamanho: 10
	 * Tipo: Numérico
	 * Descrição:
	 * Número sequencial de um CM dentro do arquivo
	 * ATC.
	 */
	@Field(ordinal = 4, length = 10, align = Align.RIGHT, padding = '0', name = "Número Sequencial de Registro")
	private String sequentialRegistrationNumber;

	/**
	 * Número do Cartão
	 * Preenchimento: Obrigatório
	 * Início: 19
	 * Tamanho: 19
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Número do cartão
	 */
	@Field(ordinal = 5, length = 19, name = "Número do Cartão")
	private String cardNumber;

	/**
	 * Código de Autorização
	 * Início: 38
	 * Tamanho: 6
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Código/número de autorização.
	 */
	@Field(ordinal = 6, length = 6, name = "Código de Autorização")
	private String authorizationCode;

	/**
	 * Valor da Transação
	 * Início: 44
	 * Tamanho: 17
	 * Tipo: Numérico
	 * Descrição:
	 * Valor da transação com duas casas decimais.
	 */
	@Field(ordinal = 7, length = 17, align = Align.RIGHT, padding = '0', name = "Valor da Transação")
	private String transactionAmount;

	/**
	 * Data da Venda
	 * Início: 61
	 * Tamanho: 8
	 * Tipo: Numérico
	 * Descrição:
	 * Data no formato AAAAMMDD.
	 */
	@Field(ordinal = 8, length = 8, align = Align.RIGHT, padding = '0', name = "Data da Venda")
	private String dateOfSale;

	/**
	 * Hora da Venda
	 * Início: 69
	 * Tamanho: 6
	 * Tipo: Numérico
	 * Descrição:
	 * Hora no formato HHMMSS.
	 */
	@Field(ordinal = 9, length = 6, align = Align.RIGHT, padding = '0', name = "Hora da Venda")
	private String saleTime;

	/**
	 * Número do Terminal
	 * Início: 75
	 * Tamanho: 10
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Número do terminal.
	 */
	@Field(ordinal = 10, length = 10, name = "Número do Terminal")
	private String terminalNumber;

	/**
	 * NSU da Transação
	 * Início: 85
	 * Tamanho: 10
	 * Tipo: Numérico
	 * Descrição:
	 * Sequência da transação.
	 */
	@Field(ordinal = 11, length = 10, align = Align.RIGHT, padding = '0', name = "NSU da Transação")
	private String transactionNSU;

	/**
	 * Código de Ocorrência
	 * Início: 95
	 * Tamanho: 2
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Código da ocorrência gerada.
	 */
	@Field(ordinal = 12, length = 2, name = "Código de Ocorrência")
	private String occurrenceCode;

	/**
	 * Indicador de Senha
	 * Início: 97
	 * Tamanho: 1
	 * Tipo: Alfanumérico
	 * Descrição:
	 * S = com senha
	 * N = sem senha
	 * O = off-line
	 */
	@Field(ordinal = 13, length = 1, regex = "(S|N|O)", name = "Indicador de Senha")
	private String passwordIndicator;

	/**
	 * Reservado
	 * Início: 98
	 * Tamanho: 20
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Uso Cabal.
	 */
	@Field(ordinal = 14, length = 20, name = "Reservado")
	private String reserved1;

	/**
	 * Indicador de Processamento
	 * Início: 118
	 * Tamanho: 1
	 * Tipo: Alfanumérico
	 * Descrição:
	 * “M”
	 */
	@Field(ordinal = 15, length = 1, name = "Indicador de Processamento")
	private String processingIndicator;

	/**
	 * Status Final da Transação
	 * Início: 119
	 * Tamanho: 2
	 * Tipo: Alfanumérico
	 * Descrição:
	 * “D0” = negada/desfeita “CC” = cancelada.
	 */
	@Field(ordinal = 16, length = 2, regex = "(D0|CC)", name = "Status Final da Transação")
	private String finalTransactionStatus;

	/**
	 * Status da Ocorrência
	 * Início: 121
	 * Tamanho: 4
	 * Tipo: Alfanumérico
	 * Descrição:
	 * “0B00” – transação de desfazimento
	 * “B0B0” – transação de venda e cancelamento
	 * “BB00” – transação de venda e desfazimento.
	 */
	@Field(ordinal = 17, length = 4, name = "Status da Ocorrência")
	private String occurrenceStatus;

	/**
	 * Código do Adquirente
	 * Início: 125
	 * Tamanho: 10
	 * Tipo: Numérico
	 * Descrição:
	 * Código da entidade Adquirente para a Bandeira Cabal.
	 */
	@Field(ordinal = 18, length = 10, align = Align.RIGHT, padding = '0', name = "Código do Adquirente")
	private String purchaserCode;

	/**
	 * Reservado
	 * Início: 135
	 * Tamanho: 316
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Brancos.
	 */
	@Field(ordinal = 19, length = 316, name = "Reservado")
	private String reserved2;
}
