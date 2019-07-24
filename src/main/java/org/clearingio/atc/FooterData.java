package org.clearingio.atc;

import org.beanio.annotation.Record;

@Record(name = "CM – 99 / Dados do Rodapé")
public class FooterData {
//CAMPO DESDE ATÉ TAMANHO TIPO OBSERVAÇÃO
//1 1 3 3 N Identificador de Tipo de Mensagem (MTI)
//2 4 6 3 N Código de Função (FC)
//3 7 8 2 X Componente da Mensagem (CM)
//4 9 18 10 N Número Sequencial de Registro (NSR)
//5 19 35 17 N Valor total das apresentações do arquivo na moeda de liquidação
//6 36 52 17 N Valor total do intercâmbio do arquivo na moeda de liquidação
//7 53 69 17 N Valor total de tarifas na moeda de liquidação
//8 70 86 17 N Valor líquido do arquivo na moeda de liquidação
//9 87 98 12 N Quantidade de registros (exceto header e trailer)
//10 99 450 352 X Reservado
}
