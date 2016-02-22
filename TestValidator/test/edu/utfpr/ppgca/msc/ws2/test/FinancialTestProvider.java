package edu.utfpr.ppgca.msc.ws2.test;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.testng.annotations.DataProvider;

import edu.utfpr.ppgca.msc.external.CodeType;
import edu.utfpr.ppgca.msc.ws2.FinancialTransactionBO;

public abstract class FinancialTestProvider {

	private static final Logger LOGGER = Logger.getAnonymousLogger();

	@DataProvider(name = "WS2InvalidFields")
	public static Object[][] invalidFields(Method m) {
		LOGGER.info("Iniciando o TestNG Provider para o m�todo [" + m.getName() + "] ");

		StringBuffer sb = new StringBuffer();
		sb.append("\n");

		sb.append("01 - Teste: o campo Documento est� vazio \n");
		sb.append("02 - Teste: o campo Documento est� com valor menor que o m�nimo permitido \n");
		sb.append("03 - Teste: o campo Documento est� com valor maior que o m�ximo permitido \n");
		
		sb.append("04 - Teste: o campo NumParcelas est� vazio \n");
		sb.append("05 - Teste: o campo NumParcelas est� com valor menor que 1 \n");
		sb.append("06 - Teste: o campo NumParcelas est� com valor maior que o m�ximo permitido\n");
		
		sb.append("07 - Teste: o campo TipoJuros est� vazio \n");
		sb.append("08 - Teste: o campo TipoJuros est� diferente de SAC ou PRICE \n");
		
		sb.append("09 - Teste: o campo Nome est� vazio \n");
		sb.append("10 - Teste: o campo Nome est� com valor menor que o m�nimo permitido \n");
		sb.append("11 - Teste: o campo Nome est� com valor maior que o m�ximo permitido \n");
		
		sb.append("12 - Teste: o campo Valor est� vazio \n");
		sb.append("13 - Teste: o campo Valor est� negativo \n");
		sb.append("14 - Teste: o campo Valor est� zerado \n");
		
		sb.append("15 - Teste: o campo RendaFamiliar est� vazio \n");
		sb.append("16 - Teste: o campo RendaFamiliar est� negativo \n");
		
		sb.append("17 - Teste: o campo Correntista est� vazio \n");
		sb.append("\n");

		LOGGER.info(sb.toString());

		FinancialTransactionBO documentoVazio =
			new FinancialTransactionBO(null, "Cec�lia Aparecida Vieira", 3000.00, 72, "PRICE", 5000.00, true);

		FinancialTransactionBO documentoMenor =
			new FinancialTransactionBO("0530192361", "Cec�lia Aparecida Vieira", 3000.00, 72, "PRICE", 5000.00, true);

		FinancialTransactionBO documentoMaior =
			new FinancialTransactionBO("053019236199", "Cec�lia Aparecida Vieira", 3000.00, 72, "PRICE", 5000.00, true);

		FinancialTransactionBO numParcelasVazio =
			new FinancialTransactionBO("0530192361", "Cec�lia Aparecida Vieira", 3000.00, 0, "PRICE", 5000.00, true);

		FinancialTransactionBO numParcelasNegativo =
			new FinancialTransactionBO("0530192361", "Cec�lia Aparecida Vieira", 3000.00, -15, "PRICE", 5000.00, true);

		FinancialTransactionBO numParcelasMaior =
			new FinancialTransactionBO("0530192361", "Cec�lia Aparecida Vieira", 3000.00, 48956, "PRICE", 5000.00, true);

		FinancialTransactionBO tipoJurosVazio =
			new FinancialTransactionBO("0530192361", "Cec�lia Aparecida Vieira", 3000.00, 72, null, 5000.00, true);
		
		FinancialTransactionBO tipoJurosDiferente =
			new FinancialTransactionBO("0530192361", "Cec�lia Aparecida Vieira", 3000.00, 72, "ABC", 5000.00, true);

		FinancialTransactionBO nomeVazio =
			new FinancialTransactionBO("0530192361", null, 3000.00, 72, "SAC", 5000.00, true);

		FinancialTransactionBO nomeMaior =
			new FinancialTransactionBO("0530192361", "Cec�lia Aparecida Gon�alvez Vieira da Silva Luna Aparecida Gon�alvez Vieira da Silva Luna Aparecida Gon�alvez Vieira da Silva Luna Aparecida Gon�alvez Vieira da Silva dos Anjos", 3000.00, 72, "SAC", 5000.00, true);

		FinancialTransactionBO nomeMenor =
			new FinancialTransactionBO("0530192361", "Luna", 3000.00, 72, "SAC", 5000.00, true);

		FinancialTransactionBO valorNulo =
			new FinancialTransactionBO("0530192361", "Cec�lia Aparecida Vieira", null, 72, "SAC", 5000.00, true);
		
		FinancialTransactionBO valorNegativo =
			new FinancialTransactionBO("0530192361", "Cec�lia Aparecida Vieira", -3200.00, 72, "SAC", 5000.00, true);

		FinancialTransactionBO valorZerado =
			new FinancialTransactionBO("0530192361", "Cec�lia Aparecida Vieira", 0.00, 72, "SAC", 5000.00, true);
		
		FinancialTransactionBO rendaFamiliarVazia = 
			new FinancialTransactionBO("0530192361", "Cec�lia Aparecida Vieira", 3000.00, 72, "PRICE", 0.0, true);
			
		FinancialTransactionBO rendaFamiliarNegativa =
			new FinancialTransactionBO("0530192361", "Cec�lia Aparecida Vieira", 3000.00, 72, "PRICE", -500.00, true);

		FinancialTransactionBO correntistaVazio =
			new FinancialTransactionBO("0530192361", "Cec�lia Aparecida Vieira", 3000.00, 72, "PRICE", 4500.00, null);

		Object[][] objetos =
			new Object[][] { 
				{ CodeType.INVALID_FIELDS, documentoVazio },
				{ CodeType.INVALID_FIELDS, documentoMenor },
				{ CodeType.INVALID_FIELDS, documentoMaior },

				{ CodeType.INVALID_FIELDS, numParcelasVazio },
				{ CodeType.INVALID_FIELDS, numParcelasNegativo },
				{ CodeType.INVALID_FIELDS, numParcelasMaior },

				{ CodeType.INVALID_FIELDS, tipoJurosVazio },
				{ CodeType.INVALID_FIELDS, tipoJurosDiferente },
				
				{ CodeType.INVALID_FIELDS, nomeVazio },
				{ CodeType.INVALID_FIELDS, nomeMaior },
				{ CodeType.INVALID_FIELDS, nomeMenor },
				
				{ CodeType.INVALID_FIELDS, valorNulo },
				{ CodeType.INVALID_FIELDS, valorNegativo },
				{ CodeType.INVALID_FIELDS, valorZerado },
				
				{ CodeType.INVALID_FIELDS, rendaFamiliarVazia },
				{ CodeType.INVALID_FIELDS, rendaFamiliarNegativa },
				
				{ CodeType.INVALID_FIELDS, correntistaVazio }
			};
		return objetos;
	}

	@DataProvider(name = "WS1BusinessValidation")
	public static Object[][] businessValidation(Method m) {
		LOGGER.info("Iniciando o TestNG Provider para o m�todo [" + m.getName() + "] ");

		StringBuffer sb = new StringBuffer();
		sb.append("\n");
		
		sb.append("18 - Teste: o Cliente selecionado est� na lista negra \n");
		sb.append("19 - Teste: o Cliente selecionado est� negativado \n");
		sb.append("20 - Teste: o Codigo de retorno n�o foi mapeado \n");
		sb.append("21 - Teste: a Transa��o n�o poderia ter sido confirmada pois o cliente est� na lista negra \n");
		sb.append("22 - Teste: o Cliente n�o possui saldo suficiente para fazer o financiamento \n");

		sb.append("23 - Teste: o Cliente selecionado est� na lista negra \n");
		
		sb.append("24 - Teste: a Transa��o deveria ter sido confirmada, por�m ocorreu um erro \n");
		sb.append("\n");

		
		FinancialTransactionBO clienteListaNegra =
				new FinancialTransactionBO("49507277706", "Pedro Negativado da Silva", 3000.00, 72, "PRICE", 4500.00, true);

		FinancialTransactionBO clienteNegativado =
				new FinancialTransactionBO("74151130209", "Pedro Negativado da Silva", 3000.00, 72, "PRICE", 4500.00, true);

		FinancialTransactionBO codigoNaoMapeado =
				new FinancialTransactionBO("11886489931", "Pedro Negativado da Silva", 3000.00, 72, "PRICE", 4500.00, true);

		FinancialTransactionBO transacaoNaoAutorizada =
				new FinancialTransactionBO("24768397522", "Cec�lia Aparecida Vieira", 3000.00, 72, "PRICE", 4500.00, true);

		FinancialTransactionBO clienteSemSaldo =
				new FinancialTransactionBO("71742201857", "Cec�lia Aparecida Vieira", 7000.00, 72, "PRICE", 1500.00, true);

		FinancialTransactionBO clienteParaListaNegra =
				new FinancialTransactionBO("05685418477", "Cec�lia Aparecida Vieira", 7000.00, 72, "PRICE", 1500.00, true);

		FinancialTransactionBO clienteCorreto =
				new FinancialTransactionBO("68128159429", "Cec�lia Correto da Silva", 3000.00, 72, "PRICE", 4500.00, true);

		
		LOGGER.info(sb.toString());
		Object[][] dadosParaValidar =
				new Object[][] { 
					{ CodeType.NEGATIVE_CUSTOMER, clienteListaNegra }, 
					{ CodeType.NEGATIVE_CUSTOMER, clienteNegativado }, 
					{ CodeType.NOT_ENUMERATED, codigoNaoMapeado }, 
					{ CodeType.UNAUTHORIZED_TRANSACTION_BANK, transacaoNaoAutorizada }, 
					{ CodeType.INSUFFICIENT_BALANCE, clienteSemSaldo }, 
					{ CodeType.SUSPECTED_FRAUD, clienteParaListaNegra }, 
					{ CodeType.SUCCESS, clienteCorreto }
				};
		return dadosParaValidar;
	}		
	
}
