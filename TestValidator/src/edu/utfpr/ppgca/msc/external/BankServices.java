package edu.utfpr.ppgca.msc.external;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import edu.utfpr.ppgca.msc.ws1.CreditCardResponse;
import edu.utfpr.ppgca.msc.ws1.CreditCardTransactionBO;
import edu.utfpr.ppgca.msc.ws2.FinancialTransactionBO;
import edu.utfpr.ppgca.msc.ws2.FinancialTransactionResponse;

/**
 * Classe que simula o serviço externo denominado BankServices.
 * 
 * @author Wilson
 *
 */
@Stateless(mappedName = "bankServices/service")
@WebService(targetNamespace = "http://edu.utfpr.ppgca.msc", serviceName = "transaction")
public class BankServices {

	@WebMethod
	@WebResult(name = "creditCardResponse")
	public CreditCardResponse verifyCreditCardInfo(@WebParam(name = "creditCardTransaction") CreditCardTransactionBO transaction) {
		// Método não implementado para este exemplo.
		return new CreditCardResponse();
	}

	@WebMethod
	@WebResult(name = "financialTransactionResponse")
	public FinancialTransactionResponse validateFunding(@WebParam(name = "financialTransaction") FinancialTransactionBO transaction) {
		// Método não implementado para este exemplo.
		return new FinancialTransactionResponse();
	}	
	
}
