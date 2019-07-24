package org.clearingio.atc;

import org.beanio.annotation.Record;

@Record(name = "CM – 20 / Dados da Transação Rejeitada")
public class RejectedTransactionData {
//CAMPO DESDE ATÉ TAMANHO TIPO OBSERVAÇÃO
//1 1 3 3 N Identificador de Tipo de Mensagem (MTI)
//2 4 6 3 N Código de Função (FC)
//3 7 8 2 X Componente da Mensagem (CM)
//4 9 18 10 N Número Sequencial de Registro (NSR)
//5 19 30 12 N Identificador do Arquivo Original
//6 31 40 10 N Sequencial do Registro Original
//7 41 44 4 N Campo Rejeitado
//8 45 48 4 N Código da Rejeição
//9 49 52 4 N Campo Rejeitado
//10 53 56 4 N Código da Rejeição
//11 57 60 4 N Campo Rejeitado
//12 61 64 4 N Código da Rejeição
//13 65 68 4 N Campo Rejeitado
//14 69 72 4 N Código da Rejeição
//15 73 76 4 N Campo Rejeitado
//16 77 80 4 N Código da Rejeição
//17 81 84 4 N Campo Rejeitado
//18 85 88 4 N Código da Rejeição
//19 89 92 4 N Campo Rejeitado
//20 93 96 4 N Código da Rejeição
//21 97 100 4 N Campo Rejeitado
//22 101 104 4 N Código da Rejeição
//23 105 108 4 N Campo Rejeitado
//24 109 112 4 N Código da Rejeição
//25 113 116 4 N Campo Rejeitado
//26 117 120 4 N Código da Rejeição
//27 121 123 3 N Identificador do Tipo de Mensagem Original
//28 124 126 3 N Identificador do Código de Função Original
//29 127 450 324 N Reservado
}
