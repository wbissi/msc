package edu.utfpr.ppgca.msc.ws1;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@Stateless(mappedName = "creditCard/services")
@WebService(targetNamespace = "http://edu.utfpr.ppgca.msc", serviceName = "transaction")
public class CreditCardServices {

	@EJB
	private CreditCardTransaction bean;
	
	@WebMethod
	@WebResult(name = "creditCardResponse")
	public CreditCardResponse processRequest(@WebParam(name = "creditCardTransaction") CreditCardTransactionBO transaction) {
		return bean.createTransaction(transaction);
	}

}
