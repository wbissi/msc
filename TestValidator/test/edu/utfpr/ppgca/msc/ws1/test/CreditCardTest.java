package edu.utfpr.ppgca.msc.ws1.test;

import java.util.logging.Logger;

import javax.ejb.EJB;

import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import edu.utfpr.ppgca.msc.external.CodeType;
import edu.utfpr.ppgca.msc.ws1.CreditCardResponse;
import edu.utfpr.ppgca.msc.ws1.CreditCardTransaction;
import edu.utfpr.ppgca.msc.ws1.CreditCardTransactionBO;

public class CreditCardTest {

	@EJB
	@InjectMocks
	private CreditCardTransaction bean = new CreditCardTransaction();

	private static final Logger LOGGER = Logger.getAnonymousLogger();

	@BeforeClass
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test(dataProvider = "WS1InvalidFields", dataProviderClass = CreditCardTestProvider.class)
	public void testInvalidFields(CodeType type, Object transaction) {
		CreditCardResponse response = bean.createTransaction((CreditCardTransactionBO) transaction);
		LOGGER.info("RESPONSE " + response.getCodeType());
		Assert.assertEquals(response.getCodeType(), type);
	
	}
	@Test(dataProvider = "WS1BusinessValidation", dataProviderClass = CreditCardTestProvider.class)
	public void testBusinessValidation(CodeType type, Object transaction) {
		CreditCardResponse response = bean.createTransaction((CreditCardTransactionBO) transaction);
		LOGGER.info("RESPONSE " + response.getCodeType());
		Assert.assertEquals(response.getCodeType(), type);
	}
}
