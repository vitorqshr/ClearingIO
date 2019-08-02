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
@Record(name = "CM – 01 / Dados da Transação")
@Fields({
		/**
		 * Componente da Mensagem
		 * Preenchimento: Obrigatório
		 * Início: 7
		 * Tamanho: 2
		 * Tipo: Alfanumérico
		 * Descrição: 01 = Dados da Transação
		 */
		@Field(ordinal = 3, length = 2, rid = true, literal = "01", name = "Componente da Mensagem (CM)")
})
public class TransactionData {
	/**
	 * Identificador do Tipo de Mensagem (MTI)
	 * Preenchimento: Obrigatório
	 * Início: 1
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * 240 = Apresentação
	 * 442 = Chargeback
	 */
	@Field(ordinal = 1, length = 3, rid = true, regex = "(240|442)", name = "Identificador de Tipo de Mensagem (MTI)")
	private String messageTypeIdentifier;

	/**
	 * Código de Função (FC)
	 * Preenchimento: Obrigatório
	 * Início: 4
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * 200 = Primeira Apresentação
	 * 205 = Segunda Apresentação Total
	 * 211 = Segunda Apresentação Parcial
	 * 450 = Primeiro Chargeback Total
	 * 451 = Primeiro Chargeback Parcial
	 */
	@Field(ordinal = 2, length = 3, rid = true, regex = "(200|205|211|450|451)", name = "Código de Função (FC)")
	private String functionCode;

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
	 * Identificador do Ciclo de Vida da
	 * Transação
	 * Preenchimento: Obrigatório
	 * Início: 19
	 * Tamanho: 20
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Identificador da transação na rede da Bandeira. É o ID do ciclo de
	 * vida da transação, usado para rastreabilidade desta. Em uma
	 * transação parcelada em três vezes, por exemplo, cada parcela terá o
	 * mesmo identificador.
	 * O Id do Ciclo de Vida é gerado no momento da autorização. Caso
	 * uma transação seja enviada sem que esta tenha sido anteriormente
	 * autorizada, o número será gerado no momento em que a transação
	 * foi recebida no ATC.
	 * Formato CCCYYYYSSSSSSSSSSSSS (Ex.: CB12010000000000012), onde:
	 * • CCC = Valor Fixo “CB1” (para transações autorizadas
	 * anteriormente) ou “CB2” (para transações que não foram
	 * autorizadas anteriormente);
	 * • YYYY = Ano;
	 * • SSSSSSSSSSSSS = Número sequencial;
	 */
	@Field(ordinal = 5, length = 20, name = "Identificador do Ciclo de Vida da Transação.")
	private String identifieroftheTransactionLifecycle;

	/**
	 * Data da transação
	 * Preenchimento: Obrigatório
	 * Início: 39
	 * Tamanho: 6
	 * Tipo: Numérico
	 * Descrição:
	 * A data da transação no local onde ocorreu a transação (no aceitante
	 * do cartão), no formato AAMMDD onde:
	 * • AA = Ano,
	 * • MM = Mês e
	 * • DD = Dia.
	 */
	@Field(ordinal = 6, length = 6, align = Align.RIGHT, padding = '0', name = "Data da Transação")
	private String transactionDate;

	/**
	 * Hora da transação
	 * Preenchimento: Opcional
	 * Início: 45
	 * Tamanho: 6
	 * Tipo: Numérico
	 * Descrição:
	 * A hora da transação no local onde ocorreu a transação (no aceitante
	 * do cartão), no formato HHMMSS onde:
	 * HH = Hora, MM = Minuto e SS = Segundo.
	 */
	@Field(ordinal = 7, length = 6, align = Align.RIGHT, padding = '0', name = "Hora da Transação")
	private String transactionTime;

	/**
	 * Código de Autorização
	 * Preenchimento: Obrigatório
	 * Início: 51
	 * Tamanho: 6
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Código que a instituição autorizadora atribuiu no momento que
	 * ocorreu a transação indicando a aprovação daquela transação.
	 * Também: número de autorização, ou simplesmente ‘autorização’.
	 */
	@Field(ordinal = 8, length = 6, name = "Código de Autorização")
	private String authorizationCode;

	/**
	 * Código de Razão
	 * Preenchimento: Opcional
	 * Início: 57
	 * Tamanho: 4
	 * Tipo: Numérico
	 * Descrição:
	 * Transação autorizada pelo Emissor = 1401
	 * Transação autorizada pela bandeira (Stand-In) = 1400
	 */
	@Field(ordinal = 9, length = 4, align = Align.RIGHT, padding = '0', name = "Código de Razão")
	private String reasonCode;

	/**
	 * Identificador do Adquirente
	 * Preenchimento: Obrigatório
	 * Início: 61
	 * Tamanho: 4
	 * Tipo: Numérico
	 * Descrição:
	 * Número gerado pela Cabal para identificar o Adquirente da transação.
	 */
	@Field(ordinal = 10, length = 4, align = Align.RIGHT, padding = '0', name = "Identificador do Adquirente")
	private String identifierOfTheAcquirer;

	/**
	 * Identificador do Emissor
	 * Preenchimento: Condicional
	 * Início: 65
	 * Tamanho: 4
	 * Tipo: Numérico
	 * Descrição:
	 * Número gerado pela Cabal para identificar o Emissor responsável
	 * pelo cartão utilizado na transação. Opcional para o Adquirente.
	 */
	@Field(ordinal = 11, length = 4, align = Align.RIGHT, padding = '0', name = "Identificador do Emissor")
	private String EmitterIdentifier;

	/**
	 * Número de Referência do Adquirente
	 * (ARD ou ARN)
	 * Preenchimento: Obrigatório
	 * Início: 69
	 * Tamanho: 23
	 * Tipo: Numérico
	 * Descrição:
	 * Número de identificação único da transação enviado pelo
	 * Adquirente.
	 */
	@Field(ordinal = 12, length = 23, align = Align.RIGHT, padding = '0', name = "Número de Referência do Adquirente (ARD)")
	private String acquirerReferenceNumber;

	/**
	 * Número de Referência Original do Adquirente
	 * Preenchimento: Opcional
	 * Início: 92
	 * Tamanho: 23
	 * Tipo: Numérico
	 * Descrição:
	 * Número de identificação da transação à qual essa transação se
	 * refere. Utilizado em caso de Chargeback.
	 */
	@Field(ordinal = 13, length = 23, align = Align.RIGHT, padding = '0', name = "Número de Referência Original do Adquirente (ARD ORIGINAL)")
	private String originalReferenceNumberOfThePurchaser;

	/**
	 * Tipo de Transação
	 * Preenchimento: Obrigatório
	 * Início: 115
	 * Tamanho: 2
	 * Tipo: Numérico
	 * Descrição:
	 * Define o tipo de transação que ocorreu com o registro:
	 *  Débito para o portador (compras):
	 * 00 = Compra à vista
	 * 01 = Saque
	 * 02 = Compra Parcelada Emissor
	 * 03 = Compra Parcelada Loja
	 * 04 = Compra IATA
	 * 05 = Compra Parcelada Emissor (BNDES)
	 * 06 = Consulta
	 *  Crédito para o portador (estornos):
	 * 10 = Estorno de Saque
	 * 20 = Estorno de Compra à vista
	 * 21 = Estorno de Compra Parcelada Loja
	 * 22 = Estorno de Compra Parcelada Emissor
	 * 25 = Estorno de Compra Parcelada Emissor (BNDES)
	 */
	@Field(ordinal = 14, length = 2, align = Align.RIGHT, padding = '0', name = "Tipo de Transação")
	private String transactionType;

	/**
	 * Número do Cartão
	 * Preenchimento: Obrigatório
	 * Início: 117
	 * Tamanho: 19
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Número do cartão.
	 */
	@Field(ordinal = 15, length = 19, align = Align.RIGHT, padding = '0', name = "Número do Cartão")
	private String cardNumber;

	/**
	 * POS Entry Mode (Modo de Entrada)
	 * Preenchimento: Obrigatório
	 * Início: 136
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Modo de entrada dos dados do cartão.
	 * Posições 1 e 2 – Modo de Entrada
	 * 00 = Não especificado
	 * 01 = Entrada manual
	 * 02 = Leitura de Tarja Magnética
	 * 03 = Leitura de Código de Barras
	 * 04 = Leitura Óptica de Caracteres
	 * 05 = Via Chip
	 * 79 = Entrada manual por falha na leitura do chip e da trilha (fall back)
	 * 80 = Entrada via trilha por falha na leitura do chip
	 * 81 = Entrada via comércio eletrônico
	 * 90 = Entrada com trilha magnética
	 * Posição 3 – Capacidade para Entrada do PIN
	 * 0 = Desconhecido
	 * 1 = Terminal com capacidade para captura de PIN
	 * 2 = Terminal sem capacidade para captura de PIN
	 * 8 = Terminal com capacidade para captura de PIN, mas PIN pad
	 * inoperante
	 * 9 = PIN verificado no próprio terminal
	 */
	@Field(ordinal = 16, length = 3, align = Align.RIGHT, padding = '0', name = "Modo de Entrada (POS ENTRY MODE)")
	private String inputMode;

	/**
	 * Capacidade do Terminal para Entrada de
	 * Dados do Cartão
	 * Preenchimento: Opcional
	 * Início: 139
	 * Tamanho: 1
	 * Tipo: Alfanumérico
	 * Descrição:
	 * 0 = Desconhecido; dados não disponíveis
	 * 1 = Manual; ausência de terminal
	 * 2 = Capacidade de leitura da tarja magnética
	 * 4 = Capacidade de leitura de caracteres ópticos (OCR)
	 * 5 = Capacidade para cartão de circuito integrado (ICC)
	 * 6 = Capacidade de entrada por digitação somente
	 * A = Lançamento automático do PAN sem contato de tarja magnética
	 * B = Capacidade de leitura da tarja magnética e capacidade de
	 * entrada por digitação
	 * C = Capacidade de leitura da tarja magnética, ICC e capacidade de
	 * entrada por digitação
	 * D = Capacidade de leitura da tarja magnética e ICC
	 * E = Capacidade de entrada por digitação e ICC
	 * M = Lançamento automático do PAN sem contato
	 * V = Outras capacidades
	 */
	@Field(ordinal = 17, length = 1, name = "Capacidade do Terminal para Entrada de Dados do Cartão")
	private String cardDataEntryTerminalCapacity;

	/**
	 * Capacidade do Terminal para Autenticar
	 * Preenchimento: Opcional
	 * Início: 140
	 * Tamanho: 1
	 * Tipo: Numérico
	 * Descrição:
	 * 0 = Sem capacidade de autenticação eletrônica
	 * 1 = Capacidade para digitação de Senha
	 * 2 = Capacidade para analisar assinatura eletrônica
	 * 5 = Capacidade de autenticação eletrônica está inoperante
	 * 6 = Outros
	 * 9 = Desconhecida; dados não disponíveis.
	 */
	@Field(ordinal = 18, length = 1, name = "Capacidade do Terminal para Autenticar")
	private String authenticationTerminalCapacity;

	/**
	 * Capacidade do Terminal para Apreensão
	 * do Cartão
	 * Preenchimento: Opcional
	 * Início: 141
	 * Tamanho: 1
	 * Tipo: Numérico
	 * Descrição:
	 * 0 = Sem capacidade de apreensão
	 * 1 = Capacidade de apreensão do cartão
	 * 9 = Desconhecida; dados não disponíveis.
	 */
	@Field(ordinal = 19, length = 1, name = "Capacidade do Terminal para Apreensão do Cartão")
	private String terminalCapacityforCardSeizure;

	/**
	 * Ambiente Operacional do Terminal
	 * Preenchimento: Opcional
	 * Início: 142
	 * Tamanho: 1
	 * Tipo: Numérico
	 * Descrição:
	 * 0 = Não foi utilizado terminal
	 * 1 = Nas instalações do aceitante de cartão; terminal com
	 * atendimento
	 * 2 = Nas instalações do aceitante de cartão; terminal sem
	 * atendimento
	 * 3 = Fora das instalações do aceitante de cartão; com atendimento
	 * 4 = Fora das instalações do aceitante de cartão; sem atendimento
	 * 5 = Nas instalações do portador de cartão; sem atendimento
	 * 6 = Fora das instalações do portador de cartão; sem atendimento
	 * 7 = Uso Privado (Uso futuro)
	 * 9 = Desconhecida; dados não disponíveis.
	 */
	@Field(ordinal = 20, length = 1, name = "Ambiente Operacional do Terminal")
	private String terminalOperationalEnvironment;

	/**
	 * Dados sobre a Presença do Portador de
	 * Cartão
	 * Preenchimento: Opcional
	 * Início: 143
	 * Tamanho: 1
	 * Tipo: Numérico
	 * Descrição:
	 * 0 = Portador de cartão presente
	 * 1 = Sem presença do portador de cartão (razão não especificada)
	 * 2 = Sem presença do portador de cartão (transação por correio/fax)
	 * 3 = Sem presença do portador de cartão (pedido por telefone ou
	 * unidade de resposta automatizada [ARU])
	 * 4 = Sem presença do portador de cartão (transação
	 * estabelecida/recorrente)
	 * 5 = Sem presença do portador de cartão (pedido eletrônico [PC,
	 * Internet, celular ou PDA])
	 * 9 = Desconhecida; dados não disponíveis.
	 */
	@Field(ordinal = 21, length = 1, name = "Dados da Presença do Portador de Cartão")
	private String cardholderPresenceData;

	/**
	 * Dados sobre a Presença do Cartão
	 * Preenchimento: Opcional
	 * Início: 144
	 * Tamanho: 1
	 * Tipo: Numérico
	 * Descrição:
	 * 0 = Sem a presença do cartão
	 * 1 = Cartão presente
	 * 9 = Não especificado; dados não disponíveis.
	 */
	@Field(ordinal = 22, length = 1, name = "Dados sobre a Presença do Cartão")
	private String cardPresenceData;

	/**
	 * Modo de Entrada de Dados do Cartão
	 * Preenchimento: Opcional
	 * Início: 145
	 * Tamanho: 1
	 * Tipo: Alfanumérico
	 * Descrição:
	 * 0 = Não especificado; dados não disponíveis
	 * 1 = Entrada manual; ausência de terminal
	 * 2 = Entrada de leitura da tarja magnética
	 * 6 = Entrada digitada
	 * A = Lançamento automático do PAN sem contato de tarja magnética
	 * B = Entrada de leitura da tarja magnética; dados da trilha captados e
	 * passados sem alterações
	 * C = Online Chip
	 * F = Offline Chip
	 * M = Lançamento automático do PAN sem contato
	 * N = Entrada sem contato
	 * S = Comércio eletrônico.
	 */
	@Field(ordinal = 23, length = 1, name = "Modo de Entrada de Dados do Cartão")
	private String cardDataEntryMode;

	/**
	 * Método de Autenticação do Portador de
	 * Cartão
	 * Preenchimento: Opcional
	 * Início: 146
	 * Tamanho: 1
	 * Tipo: Alfanumérico
	 * Descrição:
	 * 0 = Não autenticado
	 * 1 = Senha
	 * 2 = Análise de assinatura eletrônica
	 * 5 = Verificação manual da assinatura
	 * 6 = Outra verificação manual (tal como um número de carteira de
	 * motorista)
	 * 9 = Desconhecida; dados não disponíveis
	 * S = Outras verificações sistemáticas.
	 */
	@Field(ordinal = 24, length = 1, name = "Método de Autenticação do Portador de Cartão")
	private String cardholderAuthenticationMethod;

	/**
	 * Entidade de Autenticação do Portador de
	 * Cartão
	 * Preenchimento: Opcional
	 * Início: 147
	 * Tamanho: 1
	 * Tipo: Numérico
	 * Descrição:
	 * 0 = Não autenticado
	 * 1 = ICC-SENHA Off-line
	 * 2 = Dispositivo de aceitação de cartão
	 * 3 = Agente de autorização-SENHA Online
	 * 4 = Estabelecimento comercial/aceitante de cartão-assinatura
	 * 5 = Outros
	 * 9 = Desconhecida; dados não disponíveis.
	 */
	@Field(ordinal = 25, length = 1, name = "Entidade de Autenticação do Portador de Cartão")
	private String cardholderAuthenticationEntity;

	/**
	 * Capacidade de Saída de Dados do Cartão
	 * Preenchimento: Opcional
	 * Início: 148
	 * Tamanho: 1
	 * Tipo: Alfanumérico
	 * Descrição:
	 * 0 = Desconhecida; dados não disponíveis
	 * 1 = Nenhuma
	 * 2 = Gravação de tarja magnética
	 * 3 = ICC
	 * S = Outros
	 */
	@Field(ordinal = 26, length = 1, name = "Capacidade de Saída de Dados do Cartão")
	private String cardDataOutputCapacity;

	/**
	 * Capacidade de Saída de Dados do
	 * Terminal
	 * Preenchimento: Opcional
	 * Início: 149
	 * Tamanho: 1
	 * Tipo: Numérico
	 * Descrição:
	 * 0 = Desconhecida; dados não disponíveis
	 * 1 = Nenhuma
	 * 2 = Somente capacidade de impressão
	 * 3 = Somente capacidade de exibição
	 * 4 = Capacidade de impressão e exibição
	 */
	@Field(ordinal = 27, length = 1, name = "Capacidade de Saída de Dados do Terminal")
	private String terminalDataOutputCapability;

	/**
	 * Capacidade de Captação de Senha
	 * Preenchimento: Opcional
	 * Início: 150
	 * Tamanho: 1
	 * Tipo: Alfanumérico
	 * Descrição:
	 * 0 = Sem capacidade de captação da Senha
	 * 1 = Desconhecida; dados não disponíveis
	 * 2 = Reservada
	 * 3 = Reservada
	 * 4 = Capacidade de captação de Senha de no máximo 4 caracteres
	 * 5 = Capacidade de captação de SENHA de no máximo 5 caracteres
	 * 6 = Capacidade de captação de SENHA de no máximo 6 caracteres
	 * 7 = Capacidade de captação de SENHA de no máximo 7 caracteres
	 * 8 = Capacidade de captação de SENHA de no máximo 8 caracteres
	 * 9 = Capacidade de captação de SENHA de no máximo 9 caracteres
	 * A = Capacidade de captação de SENHA de no máximo 10 caracteres
	 * B = Capacidade de captação de SENHA de no máximo 11 caracteres
	 * C = Capacidade de captação de SENHA de no máximo 12 caracteres
	 */
	@Field(ordinal = 28, length = 1, name = "Capacidade de Captação de Senha")
	private String passwordCapability;

	/**
	 * Identificação do Terminal
	 * Preenchimento: Opcional
	 * Início: 151
	 * Tamanho: 8
	 * Tipo: Alfanumérico
	 * Descrição:
	 * É um código exclusivo que identifica um terminal no local do
	 * aceitante de cartão.
	 */
	@Field(ordinal = 29, length = 8, name = "Identificação do Terminal")
	private String terminalIdentification;

	/**
	 * Tipo de Terminal
	 * Preenchimento: Obrigatório
	 * Início: 159
	 * Tamanho: 3
	 * Tipo: Alfanumérico
	 * Descrição:
	 * É o tipo de terminal no qual a transação ocorreu.
	 * POI = Capturas POS e PDV
	 * CT6 = Transações por internet
	 * MAN = Transações sem terminal (offline e MOTO)
	 */
	@Field(ordinal = 30, length = 3, name = "Tipo de Terminal")
	private String terminalType;

	/**
	 * Moeda do Local do Aceitante de Cartão
	 * Preenchimento: Obrigatório
	 * Início: 162
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Código ISO da Moeda do local onde ocorreu a transação.
	 */
	@Field(ordinal = 31, length = 3, align = Align.RIGHT, padding = '0', name = "Moeda do Local do Aceitante de Cartão")
	private String cardAcceptorLocalCurrency;

	/**
	 * Moeda de Liquidação
	 * Preenchimento: Obrigatório
	 * Início: 165
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Código ISO da moeda sobre a qual a liquidação ocorrerá.
	 */
	@Field(ordinal = 32, length = 3, align = Align.RIGHT, padding = '0', name = "Moeda de Liquidação")
	private String settlementCurrency;

	/**
	 * Moeda de Faturamento
	 * Preenchimento: Obrigatório
	 * Início: 168
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Código ISO da moeda utilizada para o faturamento ao portador.
	 */
	@Field(ordinal = 33, length = 3, align = Align.RIGHT, padding = '0', name = "Moeda de Faturamento")
	private String billingCurrency;

	/**
	 * Moeda de Referência
	 * Preenchimento: Condicional
	 * Início: 171
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * O código ISO da moeda de referência, atualmente moeda em Dólar
	 * Americano (840). Obrigatório para transações internacionais (fora do
	 * Brasil).
	 * Para transações nacionais preencher com “000”
	 */
	@Field(ordinal = 34, length = 3, align = Align.RIGHT, padding = '0', name = "Moeda de Referência")
	private String referenceCurrency;

	/**
	 * Valor da Transação na Moeda do Lojista
	 * Preenchimento: Obrigatório
	 * Início: 174
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * O valor da transação na moeda do lojista onde ocorreu a transação.
	 * Para parcelados loja, refere-se à parcela. Duas últimas casas referem
	 * se aos decimais.
	 */
	@Field(ordinal = 35, length = 12, align = Align.RIGHT, padding = '0', name = "Valor da Transação na Moeda do Lojista N2")
	private String amountoftheDealersCurrencyTransaction;

	/**
	 * Valor da Transação na Moeda de
	 * Liquidação
	 * Preenchimento: Obrigatório
	 * Início: 186
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * O valor da transação na moeda de liquidação. Para parcelados loja,
	 * refere-se à parcela. Duas últimas casas referem-se aos decimais.
	 */
	@Field(ordinal = 36, length = 12, align = Align.RIGHT, padding = '0', name = "Valor da Transação na Moeda de Liquidação N2")
	private String transactionAmountInTheSettlementCurrency;

	/**
	 * Valor da Transação na Moeda de
	 * Faturamento
	 * Preenchimento: Obrigatório
	 * Início: 198
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * O valor da transação na moeda de faturamento ao portador. Para
	 * parcelados loja, refere-se à parcela. Duas últimas casas referem-se
	 * aos decimais.
	 */
	@Field(ordinal = 37, length = 12, align = Align.RIGHT, padding = '0', name = "Valor da Transação na Moeda de Faturamento N2")
	private String transactionAmountInBillingCurrency;

	/**
	 * Valor da Transação na Moeda de
	 * Referência
	 * Preenchimento: Condicional
	 * Início: 210
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * O valor da transação na moeda de referência. Só será obrigatória
	 * caso a moeda do local do aceitante de cartão for diferente da moeda
	 * de faturamento ao portador. Duas últimas casas referem-se aos
	 * decimais. Atualmente valor em Dólar Americano. Para nacionais
	 * preencher com “000000000000”
	 */
	@Field(ordinal = 38, length = 12, align = Align.RIGHT, padding = '0', name = "Valor da Transação na Moeda de Referência N2")
	private String amountOfTheTransactionInTheReferenceCurrency;

	/**
	 * Valor do Intercâmbio na Moeda do Lojista
	 * / Valor da Tarifa de Saque
	 * Preenchimento: Condicional
	 * Início: 222
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * Valor, na moeda de compra, do intercâmbio pago ao Emissor ou,
	 * para transações de saque, valor da tarifa. Duas últimas casas
	 * referem-se aos decimais.
	 */
	@Field(ordinal = 39, length = 12, align = Align.RIGHT, padding = '0', name = "Valor do Intercâmbio na Moeda do Lojista / Valor Tarifa Saque N2")
	private String exchangeRateInMerchantsCurrencyAmount;

	/**
	 * Valor do Intercâmbio na Moeda de Liquidação / Valor da Tarifa de Saque
	 * Preenchimento: Condicional
	 * Início: 234
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * Valor, na moeda de liquidação, do intercâmbio pago ao Emissor ou,
	 * para transações de saque, valor da tarifa. Duas últimas casas
	 * referem-se aos decimais.
	 */
	@Field(ordinal = 40, length = 12, align = Align.RIGHT, padding = '0', name = "Valor do Intercâmbio na Moeda de Liquidação / Valor Tarifa Saque N2")
	private String exchangeRateInTheSettlementCurrencyRate;

	/**
	 * Valor do Intercâmbio na Moeda de
	 * Referência / Valor da Tarifa de Saque
	 * Preenchimento: Condicional
	 * Início: 246
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * Valor, na moeda de referência, do intercâmbio pago ao Emissor ou,
	 * para transações de saque, valor da tarifa. Duas últimas casas
	 * referem-se aos decimais.
	 */
	@Field(ordinal = 41, length = 12, align = Align.RIGHT, padding = '0', name = "Valor do Intercâmbio na Moeda de Referência / Valor Tarifa Saque N2")
	private String exchangeRateInTheReferenceCurrencyRate;

	/**
	 * MDR (Merchant Discount Rate)
	 * Preenchimento: Opcional
	 * Início: 258
	 * Tamanho: 5
	 * Tipo: Numérico
	 * Descrição:
	 * Porcentagem da tarifa descontado do lojista (formato nn.nnn – três
	 * casas decimais) usada para compor o intercâmbio pago ao Emissor.
	 * Essa porcentagem é acordada entre o Adquirente e a Bandeira.
	 * Exemplo: Supondo uma transação em que o lojista paga 5% da
	 * compra como tarifa, o acordo estabelecido entre o Adquirente e a
	 * Bandeira é que o Adquirente paga a metade dessa tarifa para o
	 * Emissor. Então neste campo deve ser informado o valor 02500.
	 */
	@Field(ordinal = 42, length = 5, align = Align.RIGHT, padding = '0', name = "Taxa de Intercâmbio N3")
	private String exchangeRate;

	/**
	 * Valor Fixo que Compõe o Intercâmbio
	 * Preenchimento: Opcional
	 * Início: 263
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * Valor fixo usado para compor o intercâmbio pago ao Emissor. Esse
	 * valor é acordado entre o Adquirente e a Bandeira.
	 * Exemplo: Supondo que em uma transação ficou acordado que as
	 * compras no ramo de atividade do lojista deveriam pagar uma taxa
	 * fixa de 0,40. Neste campo viria informado 000000000040
	 */
	@Field(ordinal = 43, length = 12, align = Align.RIGHT, padding = '0', name = "Valor Fixo que Compõe o Intercâmbio N2")
	private String fixedAmountComprisingExchange;

	/**
	 * Quantidade de Parcelas
	 * Preenchimento: Obrigatório
	 * Início: 275
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Quantidade de parcelas da transação, caso ela tenha sido parcelada,
	 * caso contrário, deverá ser preenchido com 1 (compra à vista).
	 */
	@Field(ordinal = 44, length = 3, align = Align.RIGHT, padding = '0', name = "Quantidade de Parcelas")
	private String quantityTheInstallments;

	/**
	 * Parcela Atual
	 * Preenchimento: Obrigatório
	 * Início: 278
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Parcela que deverá ser cobrada do portador do cartão.
	 */
	@Field(ordinal = 45, length = 3, align = Align.RIGHT, padding = '0', name = "Parcela Atual")
	private String actualInstallment;

	/**
	 * Valor Total da Compra Parcelada
	 * Preenchimento: Condicional
	 * Início: 281
	 * Tamanho: 12
	 * Tipo: Numérico
	 * Descrição:
	 * Soma do valor de todas as parcelas. Presente para parcelados loja
	 * e/ou parcelados Emissor. Duas últimas casas referem-se aos
	 * decimais.
	 */
	@Field(ordinal = 46, length = 12, align = Align.RIGHT, padding = '0', name = "Valor Total da Compra Parcelada N2")
	private String totalPurchaseAmountInInstallments;

	/**
	 * Data de Compensação
	 * Preenchimento: Condicional
	 * Início: 293
	 * Tamanho: 8
	 * Tipo: Numérico
	 * Descrição:
	 * Data na qual a compensação foi efetuada pela Bandeira (atribuído
	 * pela Bandeira).
	 * Para o Adquirente, preencher com “00000000”.
	 */
	@Field(ordinal = 47, length = 8, align = Align.RIGHT, padding = '0', name = "Data de Compensação")
	private String compensationDate;

	/**
	 * Data de Liquidação
	 * Preenchimento: Condicional
	 * Início: 301
	 * Tamanho: 8
	 * Tipo: Numérico
	 * Descrição:
	 * Data na qual a liquidação acontecerá (atribuído pela Bandeira).
	 * Para o Adquirente, preencher com “00000000”.
	 */
	@Field(ordinal = 48, length = 8, name = "Data de Liquidação")
	private String settlementDate;

	/**
	 * Código do Serviço de Liquidação
	 * Preenchimento: Opcional
	 * Início: 309
	 * Tamanho: 3
	 * Tipo: Numérico
	 * Descrição:
	 * Código do serviço de liquidação no Sistema Cabal. Atribuído pela
	 * Bandeira Cabal a cada Adquirente.
	 * Para o Adquirente, preencher com “000”.
	 */
	@Field(ordinal = 49, length = 3, name = "Código do Serviço de Liquidação")
	private String settlementServiceCode;

	/**
	 * Ramo do Estabelecimento
	 * Preenchimento: Obrigatório
	 * Início: 312
	 * Tamanho: 4
	 * Tipo: Numérico
	 * Descrição:
	 * Código ISO do ramo do aceitante do cartão (MCC – Merchant
	 * Category Code).
	 */
	@Field(ordinal = 50, length = 4, name = "Ramo do Estabelecimento")
	private String branchoftheEstablishment;

	/**
	 * Código do Estabelecimento
	 * Preenchimento: Obrigatório
	 * Início: 316
	 * Tamanho: 15
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Número de identificação atribuído pelo Adquirente do aceitante do
	 * cartão.
	 */
	@Field(ordinal = 51, length = 15, name = "Código do Estabelecimento")
	private String codeofEstablishment;

	/**
	 * Nome do Estabelecimento
	 * Preenchimento: Obrigatório
	 * Início: 331
	 * Tamanho: 30
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Nome fantasia da loja aceitante do cartão.
	 */
	@Field(ordinal = 52, length = 30, name = "Nome do Estabelecimento")
	private String nameoftheestablishment;


	@Field(ordinal = 53, length = 20, name = "Cidade do Estabelecimento")
	private String cityofEstablishment;

	/**
	 * UF ou País do Estabelecimento
	 * Preenchimento: Condicional
	 * Início: 381
	 * Tamanho: 3
	 * Tipo: Alfanumérico
	 * Descrição:
	 * UF do aceitante do cartão (Brasil) ou Código ISO da sigla do país do
	 * aceitante do cartão.
	 * Obrigatório para Adquirentes.
	 * Opcional para Emissores
	 */
	@Field(ordinal = 54, length = 3, name = "UF ou País do Estabelecimento")
	private String ufOrCountryOfEstablishment;

	/**
	 * Código Postal do Estabelecimento
	 * Preenchimento: Condicional
	 * Início: 384
	 * Tamanho: 10
	 * Tipo: Numérico
	 * Descrição:
	 * Código Postal do aceitante de cartão.
	 * Obrigatório para Adquirentes.
	 * Opcional para Emissores.
	 */
	@Field(ordinal = 55, length = 10, align = Align.RIGHT, padding = '0', name = "Código Postal do Estabelecimento")
	private String establishmentPostalCode;

	/**
	 * Endereço do Estabelecimento
	 * Preenchimento: Condicional
	 * Início: 394
	 * Tamanho: 30
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Endereço do Aceitante do Cartão.
	 * Obrigatório para Adquirentes.
	 * Opcional para Emissores.
	 */
	@Field(ordinal = 56, length = 30, name = "Endereço do Estabelecimento")
	private String addressoftheEstablishment;

	/**
	 * Identificador
	 * Interno.
	 * Preenchimento: Opcional
	 * Início: 424
	 * Tamanho: 13
	 * Tipo: Numérico
	 * Descrição:
	 * Identificador interno de uma transação para a Bandeira Cabal gerado
	 * pela Bandeira.
	 * Adquirentes e Emissores devem preencher com “0000000000000”.
	 */
	@Field(ordinal = 57, length = 13, name = "Identificador Único de uma Transação – uso Cabal")
	private String uniqueIdentifierofaTransactionCabalUsage;

	/**
	 * CNPJ do Estabelecimento
	 * Preenchimento: Condicional
	 * Início: 437
	 * Tamanho: 14
	 * Tipo: Alfanumérico
	 * Descrição:
	 * Número do cadastro nacional de CNPJ do estabelecimento comercial.
	 * Obrigatório para Adquirentes.
	 * Opcional para Emissores.
	 */
	@Field(ordinal = 58, length = 14, align = Align.RIGHT, padding = '0', name = "CNPJ do Estabelecimento")
	private String cnpjOfTheEstablishment;

}
