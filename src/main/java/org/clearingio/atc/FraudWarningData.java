package org.clearingio.atc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Record;

@Getter
@Setter
@ToString
@Record(name = "CM – 04 / Dados de Aviso de Fraude")
public class FraudWarningData {
//CAMPO DESDE ATÉ TAMANHO TIPO OBSERVAÇÃO
//1 1 3 3 N Message Type Indicator (MTI)
//2 4 6 3 N Function Code (FC)
//3 7 8 2 X Componente Mensagem (CM)
//4 9 18 10 N Número Sequencial de Registro
//5 19 34 16 N Número do Cartão
//6 35 41 7 X Complemento do Número do Cartão
//7 42 64 23 N Número de Referência da Transação
//8 65 72 8 N Código do Adquirente
//9 73 80 8 N Data da Venda
//10 81 105 25 X Nome do Estabelecimento Comercial
//11 106 116 11 X Cidade do Estabelecimento Comercial
//12 117 119 3 X País do Estabelecimento Comercial
//13 120 123 4 N Código do Ramo de Atividade do EC
//14 124 135 12 N2 Valor da Fraude
//15 136 138 3 X Código de Moeda da Transação Fraudulenta
//16 139 146 8 N Data de Notificação da Fraude
//17 147 147 1 X Indicador de Origem da Autorização
//18 148 148 1 N Código da Notificação
//19 149 149 1 X Tipo de Fraude
//20 150 153 4 N Data de Vencimento do Cartão
//21 154 163 10 X CEP do Estabelecimento Comercial
//22 164 165 2 X Tipo de Transação
//23 166 168 3 N Bandeira
//24 169 182 14 X Reservado
//25 183 197 15 N Id da Transação
//26 198 198 1 X Motivo da Transação
//27 199 200 2 N Sequência
//28 201 215 15 N Número do EC
//29 216 223 8 X Número Lógico do Equipamento
//30 224 231 8 X Reservado
//31 232 232 1 X Indicador de Transação com Troco
//32 233 238 6 X Código de Autorização da Transação
//33 239 239 1 N Meio de Identificação do Portador
//34 240 241 2 N Modo de Entrada da Transação no POS
//35 242 242 1 N Identificação de Tecnologia do Terminal
//36 243 243 1 X Tecnologia do Cartão
//37 244 249 6 X Reservado
//38 250 259 10 N2 Valor de Troco
//39 260 260 1 X Reservado
//40 261 261 1 N Indicador de Transação feita por Corresp./Telefone ou Comércio Eletrônico.
//41 262 450 189 X Reservado
}
