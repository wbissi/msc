package edu.utfpr.ppgca.msc.ws1;

import javax.ejb.Stateful;

import edu.utfpr.ppgca.msc.external.BankServices;

@Stateful(mappedName = "creditCard/transaction")
public class CreditCardTransaction {

	private BankServices bankService;

	public CreditCardResponse createTransaction(CreditCardTransactionBO transaction) {
		CreditCardResponse info = bankService.verifyCreditCardInfo(transaction);
		// Método não implementado para este exemplo.
		return info;
	}
}
