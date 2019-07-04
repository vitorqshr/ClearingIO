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
@Record(name = "Registro BZ - Trailer")
@Fields({
	@Field(ordinal = 1, length = 2, rid =true, literal = "BZ", name = "Código da Transação"),
	@Field(ordinal = 2, length = 2, rid =true, literal = "10", name = "Código do Serviço")
})
public class TrailerBZ {

	@Field(ordinal = 3, length = 4, name = "Número da Remessa")
	private String shippingNumber;
	
	@Field(ordinal = 4, length = 8, name = "Quantidade de Transações de Crédito em Moeda Real")
	private String quantityOfRealCurrencyCreditTransactions;
	
	@Field(ordinal = 5, length = 15)
	private String valorTotalTransacoesCreditoMoedaReal;
	
	@Field(ordinal = 6, length = 8)
	private String quantityTransacaoDebitoMoedaReal;
	
	@Field(ordinal = 7, length = 15)
	private String valorTotalTransacoesDebitoMoedaReal;
	
	@Field(ordinal = 8, length = 8)
	private String quantityTransacaoCreditoMoedaDolar;
	
	@Field(ordinal = 9, length = 15)
	private String valorTotalTransacoesCreditoMoedaDolar;
	
	@Field(ordinal = 10, length = 8)
	private String quantityTransacaoDebitoMoedaDolar;
	
	@Field(ordinal = 11, length = 15)
	private String valorTotalTransacoesDebitoMoedaDolar;
	
	@Field(ordinal = 12, length = 8)
	private String quantityTotalRegistros;
	
	@Field(ordinal = 13, length = 8)
	private String quantityTransacoesMovimentacaoPareclado;
	
	@Field(ordinal = 14, length = 15)
	private String valorTotalTransacoesMovimentacaoParcelado;
	
	@Field(ordinal = 15, length = 36)
	private String futureUse;
	
	@Field(ordinal = 16, length = 1)
	private Integer indicadorRotaArquivo;
}
