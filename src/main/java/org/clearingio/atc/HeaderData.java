package org.clearingio.atc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Getter
@Setter
@ToString
@Record(name = "CM – 00 / Dados do Cabeçalho")
@Fields({
		/**
		 * Identificador do Tipo de Mensagem (MTI)
		 * Preenchimento: Obrigatório
		 * Início: 1
		 * Tamanho: 3
		 * Tipo: Numérico
		 * Descrição: 844 = Notificação de transferência de arquivo
		 */
		@Field(ordinal = 1, length = 3, rid = true, literal = "844", name = "Identificador de Tipo de Mensagem (MTI)"),
		/**
		 * Código de Função (FC)
		 * Preenchimento: Obrigatório
		 * Início: 4
		 * Tamanho: 3
		 * Tipo: Numérico
		 * Descrição: 841 = Início de Transferência de Arquivo
		 */
		@Field(ordinal = 2, length = 3, rid = true, literal = "841", name = "Código de Função (FC)"),
		/**
		 * Componente da Mensagem (CM)
		 * Preenchimento: Obrigatório
		 * Início: 7
		 * Tamanho: 2
		 * Tipo: Alfanumérico
		 * Descrição: 00 = Dados do cabeçalho do arquivo
		 */
		@Field(ordinal = 3, length = 2, rid = true, literal = "00", name = "Componente da Mensagem (CM)")
})
public class HeaderData {
	/**
	 * Número Sequencial de Registro (NSR)
	 * Preenchimento: Obrigatório
	 * Início: 9
	 * Tamanho: 10
	 * Tipo: Numérico
	 * Descrição:
	 * Número sequencial de um CM dentro do arquivo ATC.
	 */
	@Field(ordinal = 4, length = 10, name = "Número Sequencial de Registro (NSR)")
	private String sequentialRegistrationNumber;

	/**
	 * Identificador de Reversão do
	 * Arquivo
	 * Preenchimento: Opcional
	 * Início: 19
	 * Tamanho: 1
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Permite que a entidade que emitiu o arquivo solicite a reversão de todas
	 * as transações daquele arquivo.
	 * R = Indica a solicitação de reversão do arquivo
	 * * Exige-se uma prévia autorização para esse procedimento.
	 */
	@Field(ordinal = 5, length = 1, name = "Indicador de Reversão do Arquivo")
	private String fileReversalIndicator;

	/**
	 * Produto
	 * Preenchimento: Obrigatório
	 * Início: 20
	 * Tamanho: 2
	 * Tipo: Numérico
	 * Descrição:
	 * Produto da conta do portador.
	 * 01 = Crédito
	 * 02 = Débito
	 * 03 = Voucher
	 */
	@Field(ordinal = 6, length = 2, regex = "(01|02|03)", name = "Produto")
	private String product;

	/**
	 * Identificador da Entidade de Origem
	 * Preenchimento: Obrigatório
	 * Início: 22
	 * Tamanho: 4
	 * Tipo: Numérico
	 * Descrição:
	 * Número da entidade que enviou o arquivo (atribuído pela Bandeira).
	 * Quando a entidade de destino é a bandeira (0001), essa entidade sempre
	 * será ou o Emissor ou o Adquirente.
	 */
	@Field(ordinal = 7, length = 4, name = "Identificador da entidade de origem")
	private String sourceEntityIdentifier;

	/**
	 * Identificador da Entidade de Destino
	 * Preenchimento: Obrigatório
	 * Início: 26
	 * Tamanho: 4
	 * Tipo: Numérico
	 * Descrição:
	 * Número da entidade que está recebendo o arquivo (atribuído pela
	 * Bandeira).
	 * Quando a entidade de origem for o Emissor ou o Adquirente, essa
	 * entidade sempre será a bandeira (0001)
	 */
	@Field(ordinal = 8, length = 4, name = "Identificador da entidade de destino")
	private String destinationEntityIdentifier;

	/**
	 * Tipo de Arquivo
	 * Preenchimento: Obrigatório
	 * Início: 30
	 * Tamanho: 1
	 * Tipo: Alfanumérico
	 * Descrição:
	 * P = para arquivos de Produção e
	 * T = para arquivos de Teste
	 * C = para arquivos de Produção-Conversão (uso da Bandeira)
	 * S = para arquivos de Teste-Conversão (uso da Bandeira)
	 */
	@Field(ordinal = 9, length = 1, regex = "(P|T|C|S)", name = "Tipo de arquivo")
	private String fileType;

	/**
	 * Data de Processamento
	 * Preenchimento: Obrigatório
	 * Início: 31
	 * Tamanho: 8
	 * Tipo: Numérico
	 * Descrição:
	 * A data de processamento do arquivo no formato AAAAMMDD onde:
	 * AAAA = Ano, MM = Mês e DD = Dia
	 */
	@Field(ordinal = 10, length = 8, name = "Data de Processamento")
	private String processingDate;

	/**
	 * NSA - Número Sequencial de Arquivo
	 * Preenchimento: Obrigatório
	 * nício: 39
	 * Tamanho: 6
	 * Tipo: Numérico
	 * Descrição:
	 * Número único do arquivo por tipo de arquivo e entidade que enviou o
	 * arquivo. Ou seja, haverá um NSA único para aquele tipo de arquivo
	 * (crédito, débito e voucher) e por entidade que enviou o arquivo.
	 */
	@Field(ordinal = 11, length = 6, name = "Número Sequencial de Arquivo (NSA)")
	private String sequentialFileNumber;

	/**
	 * Versão do Arquivo
	 * Preenchimento: Opcional
	 * Início: 45
	 * Tamanho: 8
	 * Tipo: Alfanumérico
	 * Descrição:
	 * A data de criação/alteração do formato do arquivo ATC. Possui o formato
	 * AAAAMMDD, onde:
	 * AAAA = Ano, MM = Mês e DD = Dia
	 */
	@Field(ordinal = 12, length = 8, name = "Versão do arquivo")
	private String fileVersion;

	/**
	 * Identificador do Arquivo Original
	 * Preenchimento: Condicional
	 * Início: 53
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * Identificador do arquivo que originou a transação. Somente é utilizado
	 * nas mensagens de retorno de transações (ATCR02), onde é necessária a
	 * identificação do arquivo que originou a transação. Caso a mensagem não
	 * tenha sido enviada através de um arquivo, esse dado não será
	 * preenchido.
	 */
	@Field(ordinal = 13, length = 12, name = "Identificador do Arquivo Original")
	private String originalFileIdentifier;

	/**
	 * Reservado
	 * Preenchimento: Opcional
	 * Início: 65
	 * Tamanho: 386
	 * Tipo: Alfanumérico
	 * Descrição: Campo reservado para uso futuro.
	 */
	@Field(ordinal = 14, length = 386, name = "Reservado")
	private String reserved;

}
