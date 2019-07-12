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
		@Field(ordinal = 1, length = 3, rid = true, literal = "844", name = "Identificador de Tipo de Mensagem (MTI)"),
		@Field(ordinal = 2, length = 3, rid = true, literal = "841", name = "Código de Função (FC)"),
		@Field(ordinal = 3, length = 2, rid = true, literal = "00", name = "Componente da Mensagem (CM)")
})
public class HeaderData {
	@Field(ordinal = 4, length = 10, name = "Número Sequencial de Registro (NSR)")
	private String sequentialRegistrationNumber;

	@Field(ordinal = 5, length = 1, name = "Indicador de Reversão do Arquivo")
	private String fileReversalIndicator;

	@Field(ordinal = 6, length = 2, regex = "(01|02|03)", name = "Produto")
	private String product;

	@Field(ordinal = 7, length = 4, name = "Identificador da entidade de origem")
	private String sourceEntityIdentifier;

	@Field(ordinal = 8, length = 4, name = "Identificador da entidade de destino")
	private String destinationEntityIdentifier;

	@Field(ordinal = 9, length = 1, regex = "(P|T|C|S)", name = "Tipo de arquivo")
	private String fileType;

	@Field(ordinal = 10, length = 8, name = "Data de Processamento")
	private String processingDate;

	@Field(ordinal = 11, length = 6, name = "Número Sequencial de Arquivo (NSA)")
	private String sequentialFileNumber;

	@Field(ordinal = 12, length = 8, name = "Versão do arquivo")
	private String fileVersion;

	@Field(ordinal = 13, length = 12, name = "Identificador do Arquivo Original")
	private String originalFileIdentifier;

	@Field(ordinal = 14, length = 386, name = "Reservado")
	private String reserved;

}
