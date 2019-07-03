package org.clearingio.elo;

import java.util.Date;
import java.math.BigInteger;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Getter
@Setter
@Record(name = "Layout das transações - Registro Dados do Chip do Cartão (tipo “07”)")
@Fields({
		@Field(ordinal = 2, length = 1, literal = "0", name = "Código Qualificador da Transação"),
		@Field(ordinal = 3, length = 1, rid = true, literal = "7", name = "Número de Sequência do Componente da Transação")
})
public class Transaction07CardChipData {
	
	@Field(ordinal = 1, length = 2, rid =true, regex = "(01|05|06|15|16|25|26|35|36|46)")
	private String transactionCode;

	@Field(ordinal = 4, length = 2)
	private String tipoTransacao;
	
	@Field(ordinal = 5, length = 3)
	private String numeroSequencialCartao;
	
	@Field(ordinal = 6, length = 6, format = "yyMMdd")
	private Date dataTransacaoTerminal;
	
	@Field(ordinal = 7, length = 6)
	private String capacidadeTerminal;
	
	@Field(ordinal = 8, length = 3)
	private String codigoPaisTerminal;
	
	@Field(ordinal = 9, length = 8)
	private String numeroSerieTerminal;
	
	@Field(ordinal = 10, length = 8)
	private String numeroRandomCriptografia;
	
	@Field(ordinal = 11, length = 4) 
	private BigInteger contadorTransacaoAplicacao;
	
	@Field(ordinal = 12, length = 4)
	private String applicationInterchangeProfile;
	
	@Field(ordinal = 13, length = 16)
	private String criptografia;
	
	@Field(ordinal = 14, length = 2)
	private BigInteger indiceDerivacaoChave;
	
	@Field(ordinal = 15, length = 2)
	private String numeroVersaoCriptograma;
	
	@Field(ordinal = 16, length = 10)
	private String verificacaoResultadoTerminal;
	
	@Field(ordinal = 17, length = 8)
	private String verificacaoResultadoCartao;
	
	@Field(ordinal = 18, length = 12)
	private BigInteger valorTransacaoCriptograma;
	
	@Field(ordinal = 19, length = 10)
	private String fromFactoryIndicator;
	
	@Field(ordinal = 20, length = 60)
	private String futureUse;
}
