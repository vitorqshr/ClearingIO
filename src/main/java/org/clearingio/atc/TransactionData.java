package org.clearingio.atc;

public class TransactionData {
	//CAMPO DESDE ATÉ TAMANHO TIPO OBSERVAÇÃO
	//1 1 3 3 N Identificador de Tipo de Mensagem (MTI)
	private String MessageTypeIdentifier;
	//2 4 6 3 N Código de Função (FC)
	private String FunctionCode;
	//3 7 8 2 X Componente da Mensagem (CM)
	private String MessageComponent;
	//4 9 18 10 N Número Sequencial de Registro (NSR)
	private String SequentialRegistrationNumber;
	//5 19 38 20 X Identificador do Ciclo de Vida da Transação.
	private String IdentifieroftheTransactionLifecycle;
	//6 39 44 6 N Data da Transação
	private String TransactionDate;
	//7 45 50 6 N Hora da Transação
	private String TransactionTime;
	//8 51 56 6 X Código de Autorização
	private String AuthorizationCode;
	//9 57 60 4 N Código de Razão
	private String ReasonCode;
	//10 61 64 4 N Identificador do Adquirente
	private String IdentifierOfTheAcquirer;
	//11 65 68 4 N Identificador do Emissor
	private String EmitterIdentifier;
	//12 69 91 23 N Número de Referência do Adquirente (ARD)
	private String acquirerReferenceNumber;
	//13 92 114 23 N Número de Referência Original do Adquirente (ARD ORIGINAL)
	private String OriginalReferenceNumberofthePurchaser;
	//14 115 116 2 N Tipo de Transação
	private String TransactionType;
	//15 117 135 19 N Número do Cartão
	private String CardNumber;
	//16 136 138 3 N Modo de Entrada (POS ENTRY MODE)
	private String InputMode;
	//17 139 139 1 X Capacidade do Terminal para Entrada de Dados do Cartão
	private String CardDataEntryTerminalCapacity;
	//18 140 140 1 N Capacidade do Terminal para Autenticar
	private String AuthenticationTerminalCapacity;
	//19 141 141 1 N Capacidade do Terminal para Apreensão do Cartão
	private String TerminalCapacityforCardSeizure;
	//20 142 142 1 N Ambiente Operacional do Terminal
	private String TerminalOperationalEnvironment;
	//21 143 143 1 N Dados da Presença do Portador de Cartão
	private String CardholderPresenceData;
	//22 144 144 1 N Dados sobre a Presença do Cartão
	private String CardPresenceData;
	//23 145 145 1 X Modo de Entrada de Dados do Cartão
	private String CardDataEntryMode;
	//24 146 146 1 X Método de Autenticação do Portador de Cartão
	private String CardholderAuthenticationMethod;
	//25 147 147 1 N Entidade de Autenticação do Portador de Cartão
	private String CardholderAuthenticationEntity;
	//26 148 148 1 X Capacidade de Saída de Dados do Cartão
	private String CardDataOutputCapacity;
	//27 149 149 1 N Capacidade de Saída de Dados do Terminal
	private String TerminalDataOutputCapability;
	//28 150 150 1 X Capacidade de Captação de Senha
	private String PasswordCapability;
	//29 151 158 8 X Identificação do Terminal
	private String TerminalIdentification;
	//30 159 161 3 X Tipo de Terminal
	private String TerminalType;
	//31 162 164 3 N Moeda do Local do Aceitante de Cartão
	private String CardAcceptorLocalCurrency;
	//32 165 167 3 N Moeda de Liquidação
	private String SettlementCurrency;
	//33 168 170 3 N Moeda de Faturamento
	private String BillingCurrency;
	//34 171 173 3 N Moeda de Referência
	private String ReferenceCurrency;
	//35 174 185 12 N2 Valor da Transação na Moeda do Lojista
	private String AmountoftheDealersCurrencyTransaction;
	//36 186 197 12 N2 Valor da Transação na Moeda de Liquidação
	private String TransactionAmountintheSettlementCurrency;
	//37 198 209 12 N2 Valor da Transação na Moeda de Faturamento
	private String TransactionAmountinBillingCurrency;
	//38 210 221 12 N2 Valor da Transação na Moeda de Referência
	private String AmountoftheTransactionintheReferenceCurrency;
	//39 222 233 12 N2 Valor do Intercâmbio na Moeda do Lojista / Valor Tarifa Saque
	private String ExchangeRateinMerchantsCurrencyAmount;
	//40 234 245 12 N2 Valor do Intercâmbio na Moeda de Liquidação / Valor Tarifa Saque
	private String ExchangeRateintheSettlementCurrencyRate;
	//41 246 257 12 N2 Valor do Intercâmbio na Moeda de Referência / Valor Tarifa Saque
	private String ExchangeRateintheReferenceCurrencyRate;
	//42 258 262 5 N3 Taxa de Intercâmbio
	private String ExchangeRate;
	//43 263 274 12 N2 Valor Fixo que Compõe o Intercâmbio
	private String FixedAmountComprisingExchange;
	//44 275 277 3 N Quantidade de Parcelas
	private String Numberofinstallments;
	//45 278 280 3 N Parcela Atual
	private String CurrentPlot;
	//46 281 292 12 N2 Valor Total da Compra Parcelada
	private String TotalPurchaseAmountininstallments;
	//47 293 300 8 N Data de Compensação
	private String CompensationDate;
	//48 301 308 8 N Data de Liquidação
	private String SettlementDate;
	//49 309 311 3 N Código do Serviço de Liquidação
	private String SettlementServiceCode;
	//50 312 315 4 N Ramo do Estabelecimento
	private String BranchoftheEstablishment;
	//51 316 330 15 X Código do Estabelecimento
	private String CodeofEstablishment;
	//52 331 360 30 X Nome do Estabelecimento
	private String Nameoftheestablishment;
	//53 361 380 20 X Cidade do Estabelecimento
	private String CityofEstablishment;
	//54 381 383 3 X UF ou País do Estabelecimento
	private String UForCountryofEstablishment;
	//55 384 393 10 N Código Postal do Estabelecimento
	private String EstablishmentPostalCode;
	//56 394 423 30 X Endereço do Estabelecimento
	private String AddressoftheEstablishment;
	//57 424 436 13 N Identificador Único de uma Transação – uso Cabal
	private String UniqueIdentifierofaTransactionCabalUsage;
	//58 437 450 14 N CNPJ do Estabelecimento
	private String CNPJoftheEstablishment;

}
