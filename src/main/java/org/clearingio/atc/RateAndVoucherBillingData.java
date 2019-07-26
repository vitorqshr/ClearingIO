package org.clearingio.atc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Record;

@Getter
@Setter
@ToString
@Record(name = "CM – 09 / Dados da Cobrança de Tarifas e Voucher")
public class RateAndVoucherBillingData {
//CAMPO DESDE ATÉ TAMANHO TIPO OBSERVAÇÃO
//1 1 3 3 N Identificador de Tipo de Mensagem (MTI)
//2 4 6 3 N Código de Função (FC)
//3 7 8 2 X Componente da Mensagem (CM)
//4 9 18 10 N Número Sequencial de Registro (NSR)
//5 19 38 20 N Número de Referência
//6 39 42 4 N Código de Razão
//7 43 54 12 N Valor da Tarifa
//8 55 62 8 N Data de Liquidação
//9 63 162 100 X Mensagem
//10 163 169 7 N Quantidade de Transações Tarifadas
//11 170 177 8 N Código da Entidade de Origem
//12 178 185 8 N Código da Entidade de Destino
//13 186 450 265 X Reservado
}
