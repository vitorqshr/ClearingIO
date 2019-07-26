package org.clearingio.atc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;
import org.beanio.builder.Align;

/**
 * O Chargeback é enviado do Emissor para o Adquirente sempre quando houver contestação
 * de uma transação a pedido do portador do cartão. O processo de Chargeback é identificado
 * através do MTI 442, que contém o CM – 01, o CM – 02 (quando transação com chip) e o CM
 * – 03. Esse mesmo grupo de CMs é utilizado pela Segunda Apresentação (MTI 240, FCs 205
 * e 211), pois há a necessidade de conhecimento do processo que originou essa segunda
 * apresentação (Chargeback que não foi aceito pelo Adquirente).
 * O Chargeback é sempre o inverso da transação.
 */
@Getter
@Setter
@ToString
@Record(name = "CM – 03 / Dados do Chargebacks")
@Fields({
		/**
		 * Identificador do Tipo de Mensagem (MTI)
		 * Preenchimento: Obrigatório
		 * Início: 1
		 * Tamanho: 3
		 * Tipo: Numérico
		 * Descrição:
		 * 442 = Chargeback
		 */
		@Field(ordinal = 1, length = 3, literal = "442", rid = true, name = "Identificador de Tipo de Mensagem (MTI)"),
		/**
		 * Componente da Mensagem
		 * Preenchimento: Obrigatório
		 * Início: 7
		 * Tamanho: 2
		 * Tipo: Alfanumérico
		 * Descrição:
		 * 03 = Dados do Chargeback
		 */
		@Field(ordinal = 3, length = 2, literal = "03", rid = true, name = "Componente da Mensagem (CM)")
})
public class ChargebackData {

	/**
	 * Código de Função (FC)
	 * Preenchimento: Obrigatório
	 * Início: 4
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * 450 = Primeiro Chargeback Total.
	 * 451 = Primeiro Chargeback Parcial.
	 */
	@Field(ordinal = 2, length = 3, regex = "(450|451)", rid = true, align = Align.RIGHT, padding = '0', name = "Código de Função (FC)")
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
	@Field(ordinal = 4, length = 10, align = Align.RIGHT, padding = '0', name = "Número Sequencial de Registro (NSR)")
	private String sequentialRegistrationNumber;

	/**
	 * Número de Referência
	 * Preenchimento: Opcional
	 * Início: 19
	 * Tamanho: 10
	 * Tipo: Numérico
	 * Descrição:
	 * Número de referência gerado pelo membro solicitante do
	 * Chargeback.
	 */
	@Field(ordinal = 5, length = 10, align = Align.RIGHT, padding = '0', name = "Número de Referência")
	private String referenceNumber;

	/**
	 * Data da Solicitação
	 * Preenchimento: Obrigatório
	 * Início: 29
	 * Tamanho: 6
	 * Tipo: Numérico
	 * Descrição:
	 * Data da solicitação do Chargeback. É a data na qual a Bandeira
	 * recebe a solicitação do Chargeback.
	 */
	@Field(ordinal = 6, length = 6, align = Align.RIGHT, padding = '0', name = "Data da Solicitação")
	private String requestDate;

	/**
	 * Código de Razão
	 * Preenchimento: Obrigatório
	 * Início: 35
	 * Tamanho: 4
	 * Tipo: Numérico
	 * Descrição:
	 * Código de razão que especifica o motivo do Chargeback.
	 */
	@Field(ordinal = 7, length = 4, align = Align.RIGHT, padding = '0', name = "Código de Razão")
	private String reasonCode;

	/**
	 * Tipo de Documento
	 * Preenchimento: Obrigatório
	 * Início: 39
	 * Tamanho: 1
	 * Tipo: Numérico
	 * Descrição:
	 * Identifica o tipo do documento a ser enviado para uma entidade.
	 * O tipo de documento depende do código de razão. Pode ser que
	 * o código de razão não obrigue a entidade a enviar o documento.
	 * 0 = Sem documento
	 * 1 = Documento original impresso
	 * 2 = Cópia ou imagem (Xerox, microfilme, fax) do documento
	 * original.
	 * 4 = Documento substituto.
	 */
	@Field(ordinal = 8, length = 1, align = Align.RIGHT, padding = '0', name = "Tipo de Documento")
	private String documentType;

	/**
	 * Valor do Chargebacks
	 * Preenchimento: Obrigatório
	 * Início: 40
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * O valor solicitado para ser devolvido ao portador de cartão.
	 */
	@Field(ordinal = 9, length = 12, align = Align.RIGHT, padding = '0', name = "Valor do Chargeback")
	private String chargebackAmount;

	/**
	 * Mensagem
	 * Preenchimento: Opcional
	 * Início: 52
	 * Tamanho: 50
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Texto de mensagem de Chargeback. Cada código de razão terá
	 * um texto de mensagem específico.
	 */
	@Field(ordinal = 10, length = 50, name = "Mensagem")
	private String message;

	/**
	 * Reservado
	 * Início: 102
	 * Tamanho: 349
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Brancos.
	 */
	@Field(ordinal = 11, length = 349, name = "Reservado")
	private String reserved;
}
