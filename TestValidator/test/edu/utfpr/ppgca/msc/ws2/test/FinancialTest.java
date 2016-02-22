package edu.utfpr.ppgca.msc.ws2.test;

import java.util.logging.Logger;

import javax.ejb.EJB;

import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import edu.utfpr.ppgca.msc.external.CodeType;
import edu.utfpr.ppgca.msc.ws2.FinancialTransaction;
import edu.utfpr.ppgca.msc.ws2.FinancialTransactionBO;
import edu.utfpr.ppgca.msc.ws2.FinancialTransactionResponse;


public class FinancialTest {

	private static final Logger LOGGER = Logger.getAnonymousLogger();

	@EJB
	private FinancialTransaction bean;

	@BeforeClass
	public void init() {
		MockitoAnnotations.initMocks(this);
		LOGGER.info("Init Mocks");
		bean = new FinancialTransaction();
	}

	@Test(dataProvider = "WS2InvalidFields", dataProviderClass = FinancialTestProvider.class)
	public void testFinancialTransaction(CodeType type, Object transaction) {
		FinancialTransactionBO ft = (FinancialTransactionBO) transaction;
		FinancialTransactionResponse response = bean.sendSimulationToBank(ft);
		Assert.assertEquals(response.getCodeType(), type);
	}

}
