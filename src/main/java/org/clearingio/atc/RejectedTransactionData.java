package org.clearingio.atc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;
import org.beanio.builder.Align;

@Getter
@Setter
@ToString
@Record(name = "CM – 20 / Dados da Transação Rejeitada")
@Fields({
		/**
		 * Identificador do Tipo de Mensagem (MTI)
		 * Preenchimento: Obrigatório
		 * Início: 1
		 * Tamanho: 3
		 * Tipo: Numérico
		 * Descrição:
		 * 644 = Mensagem Administrativa
		 */
		@Field(ordinal = 1, length = 3, literal = "644", name = "Identificador de Tipo de Mensagem (MTI)"),
		/**
		 * Código de Função (FC)
		 * Preenchimento: Obrigatório
		 * Início: 4
		 * Tamanho: 3
		 * Tipo: Numérico
		 * Descrição:
		 * 652 = Rejeição de Transação
		 */
		@Field(ordinal = 2, length = 3, literal = "652", name = "Código de Função (FC)"),
		/**
		 * Componente da Mensagem
		 * Preenchimento: Obrigatório
		 * Início: 7
		 * Tamanho: 2
		 * Tipo: Alfanumérico
		 * Descrição:
		 * 20 = Dados da Transação Rejeitada
		 */
		@Field(ordinal = 3, length = 2, literal = "20", name = "Componente da Mensagem (CM)")
})
public class RejectedTransactionData {
	/**
	 * NSR – Número Sequencial de Registro
	 * Preenchimento: Obrigatório
	 * Início: 9
	 * Tamanho: 10
	 * Tipo: Numérico
	 * Descrição:
	 * Número sequencial de um CM dentro do arquivo ATC.
	 */
	@Field(ordinal = 4, length = 10, align = Align.RIGHT, padding = '0', name = "Número Sequencial de Registro (NSR)")
	private String sequentialRegistrationNumber;

	/**
	 * Identificador do Arquivo Original
	 * Preenchimento: Obrigatório
	 * Início: 19
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * Código de identificação do arquivo ao qual a transação que
	 * foi rejeitada pertencia.
	 * Este campo contém o número sequencial do arquivo
	 * ATCE01 originado pelo membro e encaminhado para o
	 * Sistema de Compensação da Cabal.
	 */
	@Field(ordinal = 5, length = 12, align = Align.RIGHT, padding = '0', name = "Identificador do Arquivo Original")
	private String originalFileIdentifier;

	/**
	 * Sequencial do Registro
	 * Preenchimento: Obrigatório
	 * Início: 31
	 * Tamanho: 10
	 * Tipo: Numérico
	 * Descrição:
	 * Identifica o número sequencial do registro original (que foi
	 * rejeitado).
	 */
	@Field(ordinal = 6, length = 10, align = Align.RIGHT, padding = '0', name = "Sequencial do Registro Original")
	private String sequentialOriginalRegistration;

	/**
	 * Campos Rejeitados e Códigos de Rejeição
	 * Preenchimento: Obrigatório (apenas o primeiro
	 * código da rejeição e o primeiro campo rejeitado)
	 * Início: 41
	 * Tamanho: 80
	 * Tipo: Numérico
	 * Descrição:
	 * São os números dos campos rejeitados com seus
	 * respectivos códigos de rejeição. Em um registro ATC
	 * podem ocorrer várias rejeições por diversos motivos. (Ver
	 * Apêndice A – Códigos de Rejeição).
	 * * Divididos de 4 em 4 na ordem Número do Campo
	 * Rejeitado >> Código de Rejeição.
	 */
	@Field(ordinal = 7, length = 4, align = Align.RIGHT, padding = '0', name = "Campo Rejeitado")
	private String rejectedField1;

	/**
	 * Identificador do Tipo de Mensagem Original
	 * Preenchimento: Obrigatório
	 * Início: 121
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Utilizado para identificar o tipo de registro que originou
	 * aquela rejeição.
	 */
	@Field(ordinal = 8, length = 4, align = Align.RIGHT, padding = '0', name = "Código da Rejeição")
	private String rejectionCode1;

	/**
	 * Campos Rejeitados e Códigos de Rejeição
	 * Preenchimento: Obrigatório (apenas o primeiro
	 * código da rejeição e o primeiro campo rejeitado)
	 * Início: 41
	 * Tamanho: 80
	 * Tipo: Numérico
	 * Descrição:
	 * São os números dos campos rejeitados com seus
	 * respectivos códigos de rejeição. Em um registro ATC
	 * podem ocorrer várias rejeições por diversos motivos. (Ver
	 * Apêndice A – Códigos de Rejeição).
	 * * Divididos de 4 em 4 na ordem Número do Campo
	 * Rejeitado >> Código de Rejeição.
	 */
	@Field(ordinal = 9, length = 4, align = Align.RIGHT, padding = '0', name = "Campo Rejeitado")
	private String rejectedField2;

	/**
	 * Identificador do Tipo de Mensagem Original
	 * Preenchimento: Obrigatório
	 * Início: 121
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Utilizado para identificar o tipo de registro que originou
	 * aquela rejeição.
	 */
	@Field(ordinal = 10, length = 4, align = Align.RIGHT, padding = '0', name = "Código da Rejeição")
	private String rejectionCode2;

	/**
	 * Campos Rejeitados e Códigos de Rejeição
	 * Preenchimento: Obrigatório (apenas o primeiro
	 * código da rejeição e o primeiro campo rejeitado)
	 * Início: 41
	 * Tamanho: 80
	 * Tipo: Numérico
	 * Descrição:
	 * São os números dos campos rejeitados com seus
	 * respectivos códigos de rejeição. Em um registro ATC
	 * podem ocorrer várias rejeições por diversos motivos. (Ver
	 * Apêndice A – Códigos de Rejeição).
	 * * Divididos de 4 em 4 na ordem Número do Campo
	 * Rejeitado >> Código de Rejeição.
	 */
	@Field(ordinal = 11, length = 4, align = Align.RIGHT, padding = '0', name = "Campo Rejeitado")
	private String rejectedField3;

	/**
	 * Identificador do Tipo de Mensagem Original
	 * Preenchimento: Obrigatório
	 * Início: 121
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Utilizado para identificar o tipo de registro que originou
	 * aquela rejeição.
	 */
	@Field(ordinal = 12, length = 4, align = Align.RIGHT, padding = '0', name = "Código da Rejeição")
	private String rejectionCode3;

	/**
	 * Campos Rejeitados e Códigos de Rejeição
	 * Preenchimento: Obrigatório (apenas o primeiro
	 * código da rejeição e o primeiro campo rejeitado)
	 * Início: 41
	 * Tamanho: 80
	 * Tipo: Numérico
	 * Descrição:
	 * São os números dos campos rejeitados com seus
	 * respectivos códigos de rejeição. Em um registro ATC
	 * podem ocorrer várias rejeições por diversos motivos. (Ver
	 * Apêndice A – Códigos de Rejeição).
	 * * Divididos de 4 em 4 na ordem Número do Campo
	 * Rejeitado >> Código de Rejeição.
	 */
	@Field(ordinal = 13, length = 4, align = Align.RIGHT, padding = '0', name = "Campo Rejeitado")
	private String rejectedField4;

	/**
	 * Identificador do Tipo de Mensagem Original
	 * Preenchimento: Obrigatório
	 * Início: 121
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Utilizado para identificar o tipo de registro que originou
	 * aquela rejeição.
	 */
	@Field(ordinal = 14, length = 4, align = Align.RIGHT, padding = '0', name = "Código da Rejeição")
	private String rejectionCode4;

	/**
	 * Campos Rejeitados e Códigos de Rejeição
	 * Preenchimento: Obrigatório (apenas o primeiro
	 * código da rejeição e o primeiro campo rejeitado)
	 * Início: 41
	 * Tamanho: 80
	 * Tipo: Numérico
	 * Descrição:
	 * São os números dos campos rejeitados com seus
	 * respectivos códigos de rejeição. Em um registro ATC
	 * podem ocorrer várias rejeições por diversos motivos. (Ver
	 * Apêndice A – Códigos de Rejeição).
	 * * Divididos de 4 em 4 na ordem Número do Campo
	 * Rejeitado >> Código de Rejeição.
	 */
	@Field(ordinal = 15, length = 4, align = Align.RIGHT, padding = '0', name = "Campo Rejeitado")
	private String rejectedField5;

	/**
	 * Identificador do Tipo de Mensagem Original
	 * Preenchimento: Obrigatório
	 * Início: 121
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Utilizado para identificar o tipo de registro que originou
	 * aquela rejeição.
	 */
	@Field(ordinal = 16, length = 4, align = Align.RIGHT, padding = '0', name = "Código da Rejeição")
	private String rejectionCode5;

	/**
	 * Campos Rejeitados e Códigos de Rejeição
	 * Preenchimento: Obrigatório (apenas o primeiro
	 * código da rejeição e o primeiro campo rejeitado)
	 * Início: 41
	 * Tamanho: 80
	 * Tipo: Numérico
	 * Descrição:
	 * São os números dos campos rejeitados com seus
	 * respectivos códigos de rejeição. Em um registro ATC
	 * podem ocorrer várias rejeições por diversos motivos. (Ver
	 * Apêndice A – Códigos de Rejeição).
	 * * Divididos de 4 em 4 na ordem Número do Campo
	 * Rejeitado >> Código de Rejeição.
	 */
	@Field(ordinal = 17, length = 4, align = Align.RIGHT, padding = '0', name = "Campo Rejeitado")
	private String rejectedField6;

	/**
	 * Identificador do Tipo de Mensagem Original
	 * Preenchimento: Obrigatório
	 * Início: 121
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Utilizado para identificar o tipo de registro que originou
	 * aquela rejeição.
	 */
	@Field(ordinal = 18, length = 4, align = Align.RIGHT, padding = '0', name = "Código da Rejeição")
	private String rejectionCode6;

	/**
	 * Campos Rejeitados e Códigos de Rejeição
	 * Preenchimento: Obrigatório (apenas o primeiro
	 * código da rejeição e o primeiro campo rejeitado)
	 * Início: 41
	 * Tamanho: 80
	 * Tipo: Numérico
	 * Descrição:
	 * São os números dos campos rejeitados com seus
	 * respectivos códigos de rejeição. Em um registro ATC
	 * podem ocorrer várias rejeições por diversos motivos. (Ver
	 * Apêndice A – Códigos de Rejeição).
	 * * Divididos de 4 em 4 na ordem Número do Campo
	 * Rejeitado >> Código de Rejeição.
	 */
	@Field(ordinal = 19, length = 4, align = Align.RIGHT, padding = '0', name = "Campo Rejeitado")
	private String rejectedField7;

	/**
	 * Identificador do Tipo de Mensagem Original
	 * Preenchimento: Obrigatório
	 * Início: 121
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Utilizado para identificar o tipo de registro que originou
	 * aquela rejeição.
	 */
	@Field(ordinal = 20, length = 4, align = Align.RIGHT, padding = '0', name = "Código da Rejeição")
	private String rejectionCode7;

	/**
	 * Campos Rejeitados e Códigos de Rejeição
	 * Preenchimento: Obrigatório (apenas o primeiro
	 * código da rejeição e o primeiro campo rejeitado)
	 * Início: 41
	 * Tamanho: 80
	 * Tipo: Numérico
	 * Descrição:
	 * São os números dos campos rejeitados com seus
	 * respectivos códigos de rejeição. Em um registro ATC
	 * podem ocorrer várias rejeições por diversos motivos. (Ver
	 * Apêndice A – Códigos de Rejeição).
	 * * Divididos de 4 em 4 na ordem Número do Campo
	 * Rejeitado >> Código de Rejeição.
	 */
	@Field(ordinal = 21, length = 4, align = Align.RIGHT, padding = '0', name = "Campo Rejeitado")
	private String rejectedField8;

	/**
	 * Identificador do Tipo de Mensagem Original
	 * Preenchimento: Obrigatório
	 * Início: 121
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Utilizado para identificar o tipo de registro que originou
	 * aquela rejeição.
	 */
	@Field(ordinal = 22, length = 4, align = Align.RIGHT, padding = '0', name = "Código da Rejeição")
	private String rejectionCode8;

	/**
	 * Campos Rejeitados e Códigos de Rejeição
	 * Preenchimento: Obrigatório (apenas o primeiro
	 * código da rejeição e o primeiro campo rejeitado)
	 * Início: 41
	 * Tamanho: 80
	 * Tipo: Numérico
	 * Descrição:
	 * São os números dos campos rejeitados com seus
	 * respectivos códigos de rejeição. Em um registro ATC
	 * podem ocorrer várias rejeições por diversos motivos. (Ver
	 * Apêndice A – Códigos de Rejeição).
	 * * Divididos de 4 em 4 na ordem Número do Campo
	 * Rejeitado >> Código de Rejeição.
	 */
	@Field(ordinal = 23, length = 4, align = Align.RIGHT, padding = '0', name = "Campo Rejeitado")
	private String rejectedField9;

	/**
	 * Identificador do Tipo de Mensagem Original
	 * Preenchimento: Obrigatório
	 * Início: 121
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Utilizado para identificar o tipo de registro que originou
	 * aquela rejeição.
	 */
	@Field(ordinal = 24, length = 4, align = Align.RIGHT, padding = '0', name = "Código da Rejeição")
	private String rejectionCode9;

	/**
	 * Campos Rejeitados e Códigos de Rejeição
	 * Preenchimento: Obrigatório (apenas o primeiro
	 * código da rejeição e o primeiro campo rejeitado)
	 * Início: 41
	 * Tamanho: 80
	 * Tipo: Numérico
	 * Descrição:
	 * São os números dos campos rejeitados com seus
	 * respectivos códigos de rejeição. Em um registro ATC
	 * podem ocorrer várias rejeições por diversos motivos. (Ver
	 * Apêndice A – Códigos de Rejeição).
	 * * Divididos de 4 em 4 na ordem Número do Campo
	 * Rejeitado >> Código de Rejeição.
	 */
	@Field(ordinal = 25, length = 4, align = Align.RIGHT, padding = '0', name = "Campo Rejeitado")
	private String rejectedField10;

	/**
	 * Identificador do Tipo de Mensagem Original
	 * Preenchimento: Obrigatório
	 * Início: 121
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Utilizado para identificar o tipo de registro que originou
	 * aquela rejeição.
	 */
	@Field(ordinal = 26, length = 4, align = Align.RIGHT, padding = '0', name = "Código da Rejeição")
	private String rejectionCode10;

	/**
	 * Identificador do Tipo de Mensagem Original
	 * Preenchimento: Obrigatório
	 * Início: 121
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Utilizado para identificar o tipo de registro que originou
	 * aquela rejeição.
	 */
	@Field(ordinal = 27, length = 3, align = Align.RIGHT, padding = '0', name = "Identificador do Tipo de Mensagem Original")
	private String originalMessageTypeIdentifier;

	/**
	 * Identificador do Código de Função Original
	 * Preenchimento: Obrigatório
	 * Início: 124
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Utilizado para identificar o código de função daquela
	 * transação.
	 */
	@Field(ordinal = 28, length = 3, align = Align.RIGHT, padding = '0', name = "Identificador do Código de Função Original")
	private String originalFunctionCodeIdentifier;

	/**
	 * Reservado
	 * Preenchimento: Opcional
	 * Início: 127
	 * Tamanho: 324
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Brancos.
	 */
	@Field(ordinal = 29, length = 324, padding = ' ', name = "Reservado")
	private String reserved;

}
