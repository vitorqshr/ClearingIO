package org.clearingio.atc;

import org.beanio.annotation.Record;

@Record(name = "CM – 03 / Dados do Chargebacks")
public class ChargebackData {
//CAMPO DESDE ATÉ TAMANHO TIPO OBSERVAÇÃO
//1 1 3 3 N Identificador de Tipo de Mensagem (MTI)
//2 4 6 3 N Código de Função (FC)
//3 7 8 2 X Componente da Mensagem (CM)
//4 9 18 10 N Número Sequencial de Registro (NSR)
//5 19 28 10 N Número de Referência
//6 29 34 6 N Data da Solicitação
//7 35 38 4 N Código de Razão
//8 39 39 1 N Tipo de Documento
//9 40 51 12 N Valor do Chargeback
//10 52 101 50 X Mensagem
//11 102 450 349 N Reservado
}
