package org.clearingio.atc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Record;

@Getter
@Setter
@ToString
@Record(name = "CM – 10 / Dados da Reconciliação por Arquivo")
public class FileReconciliationData {
//CAMPO DESDE ATÉ TAMANHO TIPO OBSERVAÇÃO
//1 1 3 3 N Identificador de Tipo de Mensagem (MTI)
//2 4 6 3 N Código de Função (FC)
//3 7 8 2 X Componente da Mensagem (CM)
//4 9 18 10 N Número Sequencial de Registro (NSR)
//5 19 30 12 N Identificador do Arquivo Original
//6 31 36 6 N Data de Aceitação do Arquivo Original pela Bandeira
//7 37 48 12 N Quantidade de Transações
//8 49 51 3 N Moeda das Transações
//9 52 68 17 N Valor Total das Transações
//10 69 85 17 N Valor Total de Intercâmbio
//11 86 102 17 N Valor Total Líquido na Moeda da Transação
//12 103 105 3 N Moeda de Liquidação
//13 106 122 17 N Valor Total de Transações na Moeda de Liquidação
//14 123 139 17 N Valor Total de Intercâmbio na Moeda de Liquidação
//15 140 156 17 N Valor Total Líquido na Moeda de Liquidação
//16 157 158 2 N Tipo Transação
//17 159 161 3 N Identificador do Tipo de Mensagem Original
//18 162 164 3 N Identificador do Código de Função Original
//19 165 450 286 X Reservado
}
