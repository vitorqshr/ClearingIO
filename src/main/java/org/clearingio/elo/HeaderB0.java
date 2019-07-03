package org.clearingio.elo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Getter
@Setter
@ToString
@Record(name = "Layout do HEADER - Registro Header (tipo “B0”)")
@Fields({
		@Field(at = 0, length = 2, rid = true, literal = "B0", name = "Código do Registro"),/*RegistryCode*/
		@Field(at = 2, length = 2, rid = true, literal = "10", name = "Código do Serviço")/*ServiceCode*/
})
public class HeaderB0 {

	@Field(at = 4, length = 8, name = "Data da Remessa")
	private String shipmentDate;

	@Field(at = 12, length = 4, name = "Número da Remessa")
	private String shippingNumber;

	@Field(at = 16, length = 1, name = "Número da Janela")
	private String windowNumber;

	@Field(at = 17, length = 3, name = "Uso futuro")
	private String futureUse1;

	@Field(at = 20, length = 8, name = "Data de Envio")
	private String sendDate;

	@Field(at = 28, length = 6, name = "Hora de Envio do Arquivo")
	private String sendTimeArchive;

	@Field(at = 34, length = 8, name = "Data de Retorno do Arquivo")
	private String returnDateOfArchive;

	@Field(at = 42, length = 6, name = "Hora de Retorno do Arquivo")
	private String returnTimeArchive;

	@Field(at = 48, length = 4, name = "Banco Emissor")
	private String issuerBank;

	@Field(at = 52, length = 4, name = "Código da Processadora")
	private String codeOfProcessor;

	@Field(at = 56, length = 100, name = "Uso Futuro")
	private String futureUse2;

	@Field(at = 156, length = 1, name = "Uso Futuro")
	private String futureUse3;

	@Field(at = 157, length = 3, name = "Versão do arquivo")
	private String fileVersion;

	@Field(at = 160, length = 4, literal = "5390", name = "Código do Credenciador")
	private String codeOfTheAccreditant;

	@Field(at = 164, length = 3, literal = "007", name = "Código da Bandeira")
	private String flagCode;

	@Field(at = 167, length = 1, name = "Indicador de Rota do Arquivo")
	private String routeIndicatorArchive;
}
