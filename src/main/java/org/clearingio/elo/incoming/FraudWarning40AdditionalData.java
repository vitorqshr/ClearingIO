package org.clearingio.elo.incoming;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Getter
@Setter
@Record(name = "Registro Aviso Fraude - Elo")
@Fields({
	@Field(at = 0,  length = 2 , rid =true, literal = "40"),
	@Field(at = 2,  length = 2 , rid =true, literal = "02")
})
public class FraudWarning40AdditionalData {

	@Field(at = 4,  length = 15 )
	private String idTransacao;
	
	@Field(at = 19,  length = 1 , literal = " ")
	private String futureUse1;
	
	@Field(at = 20,  length = 2 , literal = "00")
	private String futureUse2;
	
	@Field(at = 22,  length = 15 )
	private String pv;
	
	@Field(at = 37,  length = 8 )
	private String nroLogicoTerminal;
	
	@Field(at = 45,  length = 8 , literal = "        ")
	private String futureUse3;
	
	@Field(at = 53,  length = 1 )
	private String indicaTransacaoSemTroco;
	
	@Field(at = 54,  length = 6 )
	private String codAutorizacao;
	
	@Field(at = 60,  length = 1 )
	private String meioIdentificaPortador;
	
	@Field(at = 61,  length = 2 )
	private String modoEntradaPos;
	
	@Field(at = 63,  length = 1 )
	private String identificaTecnologiaTerminal;
	
	@Field(at = 64,  length = 1 )
	private String tecnologiaCartao;
	
	@Field(at = 65,  length = 6 )
	private String futureUse4;
	
	@Field(at = 71,  length = 9 )
	private String valorTroco;
	
	@Field(at = 80,  length = 1 , literal = " ")
	private String futureUse5;
	
	@Field(at = 81,  length = 1 )
	private String indicaTransacaoTelefone;
	
	@Field(at = 82,  length = 10 )
	private String cepPortador;
	
	@Field(at = 92,  length = 11 )
	private String cidadePortador;
	
	@Field(at = 103,  length = 2 )
	private String ufPortador;
	
	@Field(at = 105,  length = 8 )
	private String dataConfirmacaoFraude;
	
	@Field(at = 113,  length = 1 )
	private String indicadorLiquidacao;
	
	@Field(at = 114,  length = 30 )
	private String nomePortador;
	
	@Field(at = 144,  length = 19 )
	private String tokenPan;
	
	@Field(at = 163,  length = 5 , literal = "     ")
	private String futureUse6;
}
