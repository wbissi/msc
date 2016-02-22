package edu.utfpr.ppgca.msc.ws1.test;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.testng.annotations.DataProvider;

import edu.utfpr.ppgca.msc.external.CodeType;
import edu.utfpr.ppgca.msc.ws1.CreditCard;
import edu.utfpr.ppgca.msc.ws1.CreditCardTransactionBO;

public abstract class CreditCardTestProvider {

	private static final Logger LOGGER = Logger.getAnonymousLogger();
	
	@DataProvider(name = "WS1InvalidFields")
	public static Object[][] invalidFields(Method m) {
		LOGGER.info("Iniciando o TestNG Provider para o método [" + m.getName() + "] ");

		StringBuffer sb = new StringBuffer();
		sb.append("\n");
		sb.append("01 - Teste: o campo NumeroCartao está vazio \n");
		sb.append("02 - Teste: o campo NumeroCartao está com valor menor que o mínimo permitido \n");
		sb.append("03 - Teste: o campo NumeroCartao está com valor maior que o máximo permitido \n");
		
		sb.append("04 - Teste: o campo Validade está vazia \n");
		sb.append("05 - Teste: o campo Validade está com valor menor que o mínimo permitido \n");
		sb.append("06 - Teste: o campo Validade está com valor maior que o máximo permitido \n");
		sb.append("07 - Teste: o campo Validade está com formato de data inadequado (exemplo: 04/15 para Abril de 2015) \n");
		
		sb.append("08 - Teste: o campo CVV está vazio \n");
		sb.append("09 - Teste: o campo CVV está com valor menor que o mínimo permitido \n");
		sb.append("10 - Teste: o campo CVV está com valor maior que o máximo permitido \n");
		
		sb.append("11 - Teste: o campo NomeTitular está vazio \n");
		sb.append("12 - Teste: o campo NomeTitular está com valor menor que o mínimo permitido \n");
		sb.append("13 - Teste: o campo NomeTitular está com valor maior que o máximo permitido \n");
		
		sb.append("14 - Teste: o campo Valor está vazio \n");
		sb.append("15 - Teste: o campo Valor está negativo \n");
		sb.append("16 - Teste: o campo Valor está zerado \n");
		
		sb.append("17 - Teste: o campo NumParcelas está vazio \n");
		sb.append("18 - Teste: o campo NumParcelas está com valor menor que 1 \n");
		sb.append("19 - Teste: o campo NumParcelas está com valor maior que o máximo permitido\n");

		sb.append("20 - Teste: o campo JurosParcelado está vazio \n");
		sb.append("\n");

		LOGGER.info(sb.toString());

		CreditCardTransactionBO numCartaoVazio = new CreditCardTransactionBO();
		numCartaoVazio.setCreditCard(new CreditCard(null, "111", "04/20", "Luna Aparecida"));
		numCartaoVazio.setNumParcelas(3);
		numCartaoVazio.setJurosParcelado(true);
		numCartaoVazio.setValor(5000.00);

		CreditCardTransactionBO numCartaoMenor = new CreditCardTransactionBO();
		numCartaoMenor.setCreditCard(new CreditCard("707016859947802", "111", "04/20", "Luna Aparecida"));
		numCartaoMenor.setNumParcelas(3);
		numCartaoMenor.setJurosParcelado(true);
		numCartaoMenor.setValor(5000.00);

		CreditCardTransactionBO numCartaoMaior = new CreditCardTransactionBO();
		numCartaoMaior.setCreditCard(new CreditCard("70701685994780233", "111", "04/20", "Luna Aparecida"));
		numCartaoMaior.setNumParcelas(3);
		numCartaoMaior.setJurosParcelado(true);
		numCartaoMaior.setValor(5000.00);
		
		CreditCardTransactionBO validadeVazia = new CreditCardTransactionBO();
		validadeVazia.setCreditCard(new CreditCard("7070168599478023", "111", null, "Luna Aparecida"));
		validadeVazia.setNumParcelas(3);
		validadeVazia.setJurosParcelado(true);
		validadeVazia.setValor(5000.00);
		
		CreditCardTransactionBO validadeMenor = new CreditCardTransactionBO();
		validadeMenor.setCreditCard(new CreditCard("7070168599478023", "111", "4/20", "Luna Aparecida"));
		validadeMenor.setNumParcelas(3);
		validadeMenor.setJurosParcelado(true);
		validadeMenor.setValor(5000.00);

		CreditCardTransactionBO validadeMaior = new CreditCardTransactionBO();
		validadeMaior.setCreditCard(new CreditCard("7070168599478023", "111", "04/226", "Luna Aparecida"));
		validadeMaior.setNumParcelas(3);
		validadeMaior.setJurosParcelado(true);
		validadeMaior.setValor(5000.00);		
		
		CreditCardTransactionBO validadeFormatoInvalido = new CreditCardTransactionBO();
		validadeFormatoInvalido.setCreditCard(new CreditCard("7070168599478023", "111", "04-22", "Luna Aparecida"));
		validadeFormatoInvalido.setNumParcelas(3);
		validadeFormatoInvalido.setJurosParcelado(true);
		validadeFormatoInvalido.setValor(5000.00);
		
		CreditCardTransactionBO cvvVazio = new CreditCardTransactionBO();
		cvvVazio.setCreditCard(new CreditCard("7070168599478023", null, "04/20", "Luna Aparecida"));
		cvvVazio.setNumParcelas(3);
		cvvVazio.setJurosParcelado(true);
		cvvVazio.setValor(5000.00);

		CreditCardTransactionBO cvvMenor = new CreditCardTransactionBO();
		cvvMenor.setCreditCard(new CreditCard("7070168599478023", "11", "04/20", "Luna Aparecida"));
		cvvMenor.setNumParcelas(3);
		cvvMenor.setJurosParcelado(true);
		cvvMenor.setValor(5000.00);

		CreditCardTransactionBO cvvMaior = new CreditCardTransactionBO();
		cvvMaior.setCreditCard(new CreditCard("7070168599478023", "1112", "04/20", "Luna Aparecida"));
		cvvMaior.setNumParcelas(3);
		cvvMaior.setJurosParcelado(true);
		cvvMaior.setValor(5000.00);

		CreditCardTransactionBO nomeTitularVazio = new CreditCardTransactionBO();
		nomeTitularVazio.setCreditCard(new CreditCard("7070168599478023", "111", "04/21", null));
		nomeTitularVazio.setNumParcelas(3);
		nomeTitularVazio.setJurosParcelado(true);
		nomeTitularVazio.setValor(5000.00);

		CreditCardTransactionBO nomeTitularMenor = new CreditCardTransactionBO();
		nomeTitularMenor.setCreditCard(new CreditCard("7070168599478023", "111", "04/21", "Luna"));
		nomeTitularMenor.setNumParcelas(3);
		nomeTitularMenor.setJurosParcelado(true);
		nomeTitularMenor.setValor(5000.00);
		
		CreditCardTransactionBO nomeTitularMaior = new CreditCardTransactionBO();
		nomeTitularMaior.setCreditCard(new CreditCard("7070168599478023", "111", "04/21", "Luna Aparecida Gonçalvez Vieira da Silva Luna Aparecida Gonçalvez Vieira da Silva Luna Aparecida Gonçalvez Vieira da Silva Luna Aparecida Gonçalvez Vieira da Silva dos Anjos"));
		nomeTitularMaior.setNumParcelas(3);
		nomeTitularMaior.setJurosParcelado(true);
		nomeTitularMaior.setValor(5000.00);

		CreditCardTransactionBO valorVazio = new CreditCardTransactionBO();
		valorVazio.setCreditCard(new CreditCard("7070168599478023", "111", "04/21", "Luna Aparecida da Silva"));
		valorVazio.setNumParcelas(3);
		valorVazio.setJurosParcelado(true);
		valorVazio.setValor(null);

		CreditCardTransactionBO valorNegativo = new CreditCardTransactionBO();
		valorNegativo.setCreditCard(new CreditCard("7070168599478023", "111", "04/21", "Luna Aparecida da Silva"));
		valorNegativo.setNumParcelas(3);
		valorNegativo.setJurosParcelado(true);
		valorNegativo.setValor(-5000.00);
		
		CreditCardTransactionBO valorZerado = new CreditCardTransactionBO();
		valorZerado.setCreditCard(new CreditCard("7070168599478023", "111", "04/21", "Luna Aparecida da Silva"));
		valorZerado.setNumParcelas(3);
		valorZerado.setJurosParcelado(true);
		valorZerado.setValor(0.00);		
		
		CreditCardTransactionBO numParcelasVazio = new CreditCardTransactionBO();
		numParcelasVazio.setCreditCard(new CreditCard("7070168599478023", "111", "04/21", "Luna Aparecida da Silva"));
		numParcelasVazio.setNumParcelas(null);
		numParcelasVazio.setJurosParcelado(true);
		numParcelasVazio.setValor(5000.00);

		CreditCardTransactionBO numParcelasNegativo = new CreditCardTransactionBO();
		numParcelasNegativo.setCreditCard(new CreditCard("7070168599478023", "111", "04/21", "Luna Aparecida da Silva"));
		numParcelasNegativo.setNumParcelas(-1);
		numParcelasNegativo.setJurosParcelado(true);
		numParcelasNegativo.setValor(5000.00);

		CreditCardTransactionBO numParcelasMaior = new CreditCardTransactionBO();
		numParcelasMaior.setCreditCard(new CreditCard("7070168599478023", "111", "04/21", "Luna Aparecida da Silva"));
		numParcelasMaior.setNumParcelas(34444);
		numParcelasMaior.setJurosParcelado(true);
		numParcelasMaior.setValor(5000.00);

		CreditCardTransactionBO jurosParceladoVazio = new CreditCardTransactionBO();
		jurosParceladoVazio.setCreditCard(new CreditCard("7070168599478023", "111", "04/21", "Luna Aparecida da Silva"));
		jurosParceladoVazio.setNumParcelas(34444);
		jurosParceladoVazio.setJurosParcelado(null);
		jurosParceladoVazio.setValor(5000.00);

		Object[][] dadosParaValidar =
			new Object[][] { 
				{ CodeType.INVALID_FIELDS, numCartaoVazio },
				{ CodeType.INVALID_FIELDS, numCartaoMenor }, 
				{ CodeType.INVALID_FIELDS, numCartaoMaior },
				
				{ CodeType.INVALID_FIELDS, validadeVazia },
				{ CodeType.INVALID_FIELDS, validadeMenor },
				{ CodeType.INVALID_FIELDS, validadeMaior },
				{ CodeType.INVALID_FIELDS, validadeFormatoInvalido },
				
				{ CodeType.INVALID_FIELDS, cvvVazio }, 
				{ CodeType.INVALID_FIELDS, cvvMenor },
				{ CodeType.INVALID_FIELDS, cvvMaior },
				
				{ CodeType.INVALID_FIELDS, nomeTitularVazio }, 
				{ CodeType.INVALID_FIELDS, nomeTitularMenor },
				{ CodeType.INVALID_FIELDS, nomeTitularMaior },

				{ CodeType.INVALID_FIELDS, valorVazio }, 
				{ CodeType.INVALID_FIELDS, valorNegativo }, 
				{ CodeType.INVALID_FIELDS, valorZerado }, 
				
				{ CodeType.INVALID_FIELDS, numParcelasVazio },
				{ CodeType.INVALID_FIELDS, numParcelasNegativo },
				{ CodeType.INVALID_FIELDS, numParcelasMaior },
				
				{ CodeType.INVALID_FIELDS, jurosParceladoVazio }
			};
		return dadosParaValidar;
	}


	@DataProvider(name = "WS1BusinessValidation")
	public static Object[][] businessValidation(Method m) {
		LOGGER.info("Iniciando o TestNG Provider para o método [" + m.getName() + "] ");

		StringBuffer sb = new StringBuffer();
		sb.append("\n");
		sb.append("21 - Teste: o Cliente selecionado não está na lista negra \n");
		sb.append("22 - Teste: a Transação não poderia ter sido confirmada pois o cliente está na lista negra \n");
		sb.append("23 - Teste: o Cliente não foi adicionado a lista negra \n");
		sb.append("24 - Teste: a Transação deveria ter sido confirmada, porém ocorreu um erro \n");
		sb.append("\n");

		LOGGER.info(sb.toString());
		
		CreditCardTransactionBO clienteSuspeito = new CreditCardTransactionBO();
		clienteSuspeito.setCreditCard(new CreditCard("5100035367101767", "111", "04/21", "João do Calote e Silva"));
		clienteSuspeito.setNumParcelas(3);
		clienteSuspeito.setJurosParcelado(true);
		clienteSuspeito.setValor(2500.00);

		CreditCardTransactionBO transacaoNaoAutorizada = new CreditCardTransactionBO();
		transacaoNaoAutorizada.setCreditCard(new CreditCard("5100178609671535", "111", "04/21", "João do Calote e Silva"));
		transacaoNaoAutorizada.setNumParcelas(3);
		transacaoNaoAutorizada.setJurosParcelado(true);
		transacaoNaoAutorizada.setValor(4000.00);

		CreditCardTransactionBO clienteParaListaNegra = new CreditCardTransactionBO();
		clienteParaListaNegra.setCreditCard(new CreditCard("5100178609808080", "111", "04/21", "Samuel Black List Nogueira"));
		clienteParaListaNegra.setNumParcelas(3);
		clienteParaListaNegra.setJurosParcelado(true);
		clienteParaListaNegra.setValor(4000.00);
		
		CreditCardTransactionBO clienteCorreto = new CreditCardTransactionBO();
		clienteCorreto.setCreditCard(new CreditCard("5100178609671534", "111", "04/21", "João do Correto e Silva"));
		clienteCorreto.setNumParcelas(9);
		clienteCorreto.setJurosParcelado(true);
		clienteCorreto.setValor(4500.00);
		
		Object[][] dadosParaValidar =
				new Object[][] { 
					{ CodeType.SUSPECTED_FRAUD, clienteSuspeito }, 
					{ CodeType.UNAUTHORIZED_TRANSACTION_BANK, transacaoNaoAutorizada }, 
					{ CodeType.SUSPECTED_FRAUD, clienteParaListaNegra }, 
					{ CodeType.SUCCESS, clienteCorreto }
				};
		
		return dadosParaValidar;
	}
	
}
