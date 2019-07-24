package org.clearingio.atc;

import org.beanio.annotation.Record;

@Record(name = "CM – TV / Dados do Trecho de Viagem")
public class JourneyData {
//CAMPO DESDE ATÉ TAMANHO TIPO OBSERVAÇÃO
//1 1 3 3 N Identificador de Tipo de Mensagem (MTI)
//2 4 6 3 N Código de Função (FC)
//3 7 8 2 X Componente da Mensagem (CM)
//4 9 18 10 N Número Sequencial de Registro (NSR)
//5 19 24 6 N Data da Viagem
//6 25 26 2 X Abreviatura da Cia Transportadora
//7 27 28 2 X Tipo de Classe do Transporte
//8 29 33 5 X Abreviatura do Aeroporto de Origem
//9 34 38 5 X Abreviatura do Aeroporto de Destino
//10 39 39 1 X Código da Escala
//11 40 54 15 X Bilhete Combinado
//12 55 69 15 X Bilhete de Troca
//13 70 70 1 X Número do Cupom
//14 71 85 15 X Código da Tarifa Básica
//15 86 90 5 X Número do Voo
//16 91 102 12 N Tarifa – Cia Aérea
//17 103 114 12 N Taxa – Cia Aérea
//18 115 120 6 N Data da Partida
//19 121 126 6 N Horário de Partida
//20 127 132 6 N Data da Chegada
//21 133 138 6 N Horário de Chegada
//22 139 450 312 N Reservado
}
