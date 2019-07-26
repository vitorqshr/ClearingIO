package org.clearingio.atc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Record;

@Getter
@Setter
@ToString
@Record(value = "CM – 05 / Dados de Cancelamento e Desfazimento")
public class CancellationAndUndoingData {
//CAMPO DESDE ATÉ TAMANHO TIPO OBSERVAÇÃO
//1 1 3 3 N Message Type Indicator (MTI)
//2 4 6 3 N Function Code (FC)
//3 7 8 2 X Componente Mensagem
//4 9 18 10 N Número Sequencial de Registro
//5 19 37 19 X Número do Cartão
//6 38 38 6 X Código de Autorização
//7 44 60 17 N Valor da Transação
//8 61 68 8 N Data da Venda
//9 69 74 6 N Hora da Venda
//10 75 84 10 X Número do Terminal
//11 85 94 10 N NSU da Transação
//12 95 96 2 X Código de Ocorrência
//13 97 87 1 X Indicador de Senha
//14 98 117 20 X Reservado
//15 118 118 1 X Indicador de Processamento
//16 119 120 2 X Status Final da Transação
//17 121 124 4 X Status da Ocorrência
//18 125 134 10 N Código do Adquirente
//19 135 450 316 X Reservado
}
