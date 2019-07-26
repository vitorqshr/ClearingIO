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
@Record(name = "CM – 99 / Dados do Rodapé")
@Fields({
		/**
		 * Identificador do Tipo de Mensagem (MTI)
		 * Preenchimento: Obrigatório
		 * Início: 1
		 * Tamanho: 3
		 * Tipo: Numérico
		 * Descrição:
		 * 844 = Notificação de transferência de arquivo
		 */
		@Field(ordinal = 1, length = 3, rid = true, literal = "844", name = "Identificador do Tipo de Mensagem (MTI)"),
		/**
		 * Código de Função (FC)
		 * Preenchimento: Obrigatório
		 * Início: 4
		 * Tamanho: 3
		 * Tipo: Numérico
		 * Descrição:
		 * 842 = Fim de transferência de arquivo
		 */
		@Field(ordinal = 2, length = 3, rid = true, literal = "842", name = "Código de Função (FC)"),
		/**
		 * Componente da Mensagem
		 * Preenchimento: Obrigatório
		 * Início: 7
		 * Tamanho: 2
		 * Tipo: Alfanumérico
		 * Descrição:
		 * 99 = Dados do rodapé do arquivo
		 */
		@Field(ordinal = 3, length = 2, rid = true, literal = "99", name = "Componente da Mensagem (CM)")
})
public class FooterData {
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
	 * Valor Total das Apresentações
	 * Preenchimento: Obrigatório
	 * Início: 19
	 * Tamanho: 17
	 * Tipo: Numérico
	 * Descrição:
	 * Valor total das apresentações do arquivo na moeda de
	 * liquidação. Duas últimas casas referem-se aos decimais.
	 */
	@Field(ordinal = 5, length = 17, align = Align.RIGHT, padding = '0', name = "Valor total das apresentações do arquivo na moeda de liquidação")
	private String totalAmountOfFilePresentationsInSettlementCurrency;

	/**
	 * Valor Total do Intercâmbio
	 * Preenchimento: Obrigatório
	 * Início: 36
	 * Tamanho: 17
	 * Tipo: Numérico
	 * Descrição:
	 * Valor total do intercâmbio do arquivo na moeda de liquidação.
	 * Duas últimas casas referem-se aos decimais.
	 */
	@Field(ordinal = 6, length = 17, align = Align.RIGHT, padding = '0', name = "Valor total do intercâmbio do arquivo na moeda de liquidação")
	private String totalAmountOfFileExchangeInSettlementCurrency;

	/**
	 * Valor Total de Tarifas
	 * Preenchimento: Obrigatório
	 * Início: 53
	 * Tamanho: 17
	 * Tipo: Numérico
	 * Descrição:
	 * Valor total de tarifas na moeda de liquidação. Duas últimas
	 * casas referem-se aos decimais.
	 */
	@Field(ordinal = 7, length = 17, align = Align.RIGHT, padding = '0', name = "Valor total de tarifas na moeda de liquidação")
	private String totalAmountOfTariffsInSettlementCurrency;

	/**
	 * Valor Líquido do Arquivo
	 * Preenchimento: Obrigatório
	 * Início: 70
	 * Tamanho: 17
	 * Tipo: Numérico
	 * Descrição:
	 * Valor líquido do arquivo na moeda de liquidação. Duas últimas
	 * casas referem-se aos decimais.
	 */
	@Field(ordinal = 8, length = 17, align = Align.RIGHT, padding = '0', name = "Valor líquido do arquivo na moeda de liquidação")
	private String liquidAmountOfFileInSettlementCurrency;

	/**
	 * Quantidade de Registros
	 * Preenchimento: Obrigatório
	 * Início: 87
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * Quantidade de registros (exceto header e trailer).
	 */
	@Field(ordinal = 9, length = 12, align = Align.RIGHT, padding = '0', name = "Quantidade de registros (exceto header e trailer)")
	private String quantityOfRecords;

	/**
	 * Reservado
	 * Preenchimento: Opcional
	 * Início: 99
	 * Tamanho: 352
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Brancos.
	 */
	@Field(ordinal = 10, length = 352, name = "Reservado")
	private String reserved;
}
