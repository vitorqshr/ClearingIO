package org.clearingio.elo.incoming;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Getter
@Setter
@Record(name = "Registro Principal de Aviso de Fraude - R00")
@Fields({
	@Field(at = 0,  length = 2, rid =true, literal = "40", name = "Código do Registro"),
	@Field(at = 2,  length = 2, rid =true, literal = "00", name = "Código do Serviço")
})
public class FraudWarning40Data {

	@Field(at = 4,  length = 16)
	private String nroCartao;

	@Field(at = 20,  length = 7)
	private String complementoNroCartao;

	@Field(at = 27,  length = 23)
	private String ard;
	
	@Field(at = 50,  length = 4)
	private String futureUse1;

	@Field(at = 54,  length = 4 )
	private String codigoCredenciado;
	
	@Field(at = 58,  length = 8)
	private String dataVenda;
	
	@Field(at = 66,  length = 25 )
	private String futureUse2;
	
	@Field(at = 91,  length = 11)
	private String cidadePv;
	
	@Field(at = 102,  length = 3)
	private String paisPv;
	
	@Field(at = 105,  length = 4)
	private String mcc;
	
	@Field(at = 109,  length = 12)
	private String valorFraude;
	
	@Field(at = 121,  length = 3)
	private String moedaFraude;
	
	@Field(at = 124,  length = 8)
	private String dataNotificacaoFraude;
	
	@Field(at = 132,  length = 1)
	private String indicadorOrigemTransacao;
	
	@Field(at = 133,  length = 1)
	private String codigoNotificacao;
	
	@Field(at = 134,  length = 2)
	private String tipoFraude;
	
	@Field(at = 136,  length = 4)
	private String dataVencimentoCartao;
	
	@Field(at = 140,  length = 10)
	private String futureUse3;

	@Field(at = 150,  length = 2)
	private String tipoPlataforma;
	
	@Field(at = 152,  length = 3)
	private String codigoBandeira;
	
	@Field(at = 155,  length = 1, literal = "0")
	private String futureUse4;
	
	@Field(at = 156,  length = 4)
	private String bancoEmissor;
	
	@Field(at = 160,  length = 8)
	private String futureUse5;
}
