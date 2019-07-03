package org.clearingio.elo.incoming;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Field;
import org.beanio.annotation.Record;

@Getter
@Setter
@ToString
@Record(name = "Layout para transação TE44 - Registro Dados do Retorno da Remessa Processada (tipo “00”)")
@Fields({
		@Field(ordinal = 1, length = 2 , rid = true, literal = "44", name = "Código da Transação"),
		@Field(ordinal = 2, length = 2 , rid = true, literal = "00", name = "Código do Serviço"),

})
public class ReturnTransactional44DataReturn00 {

	@Field(ordinal = 3, length = 1 , literal = "0")
	private String futureUse1;
	
	@Field(ordinal = 4, length = 4 )
	private String bancoEmissor;
	
	@Field(ordinal = 5, length = 4 )
	private String futureUse2;
	
	@Field(ordinal = 6, length = 8)
	private String dataMovimento;
	
	@Field(ordinal = 7, length = 6 )
	private String nroRemessa;
	
	@Field(ordinal = 8, length = 8)
	private String dataConfirmacaoRemessa;
	
	@Field(ordinal = 9, length = 1 , regex = "(A|R)")
	private String situacaoRemessa;
	
	@Field(ordinal = 10, length = 2 )
	private String motivoRejeicao;
	
	@Field(ordinal = 11, length = 3 )
	private String codMoeda;
	
	@Field(ordinal = 12, length = 1 )
	private String indicaTipoRetorno;
	
	@Field(ordinal = 13, length = 15 )
	private String qtdTotalRegistros;
	
	@Field(ordinal = 14, length = 15 )
	private String qtdTransacoesMoedaReal;
	
	@Field(ordinal = 15, length = 15 )
	private String valorTransAceitasReal;
	
	@Field(ordinal = 16, length = 8 )
	private String qtdRejeitadasMoedaReal;
	
	@Field(ordinal = 17, length = 15 )
	private String valorTransRejeitadoMoedaReal;
	
	@Field(ordinal = 18, length = 3 )
	private String codigoBandeira;
	
	@Field(ordinal = 19, length = 8 )
	private String qtdTransAceitasDolar;
	
	@Field(ordinal = 20, length = 15 )
	private String valorTransAceitasDolar;
	
	@Field(ordinal = 21, length = 8 )
	private String qtdTransRejeitadasDolar;
	
	@Field(ordinal = 22, length = 15 )
	private String valorTransRejeitadaDolar;
	
	@Field(ordinal = 23, length = 9 )
	private String futureUse3;
}
