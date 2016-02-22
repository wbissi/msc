package edu.utfpr.ppgca.msc.ws2;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@Stateless(mappedName = "financial/services")
@WebService(targetNamespace = "http://edu.utfpr.ppgca.msc", serviceName = "transaction")
public class FinancialServices {

	@EJB
	private FinancialTransaction bean;

	@WebMethod
	@WebResult(name = "financialTransactionResponse")
	public FinancialTransactionResponse transaction(
		@WebParam(name = "financialTransaction") FinancialTransactionBO transaction) {
		return bean.sendSimulationToBank(transaction);
	}
}
