package org.clearingio.atc;

import org.beanio.annotation.Record;

@Record(name = "CM – PA / Dados da Passagem Aérea")
public class AirfareData {
//CAMPO DESDE ATÉ TAMANHO TIPO OBSERVAÇÃO
//1 1 3 3 N Identificador de Tipo de Mensagem (MTI)
//2 4 6 3 N Código de Função (FC)
//3 7 8 2 X Componente da Mensagem (CM)
//4 9 18 10 N Número Sequencial de Registro (NSR)
//5 19 48 30 X Nome do Passageiro
//6 49 63 15 X Número do Bilhete
//7 64 67 4 X Abreviatura da Cia que Emitiu o Bilhete
//8 68 92 25 X Código do Cliente
//9 93 98 6 N Data de Emissão do Bilhete
//10 99 106 8 X Código da Agência de Viagem
//11 107 131 25 X Nome da Agência de Viagem
//12 132 143 12 N Preço Total da Tarifa – Cia Aérea
//13 144 155 12 N Total de Taxas – Cia Aérea
//14 156 167 12 N Valor do Bilhete de Troca
//15 168 179 12 N Valor da Tarifa do Bilhete de Troca
//16 180 199 20 X Autorização – Cia Aérea
//17 200 216 17 X Código do Cliente IATA (International Air Transport Association)
//18 217 233 17 N Valor da Taxa de Embarque
//19 234 250 17 N Valor da Entrada
//20 251 450 200 N Reservado
}
