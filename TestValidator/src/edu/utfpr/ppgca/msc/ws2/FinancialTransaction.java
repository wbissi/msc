package edu.utfpr.ppgca.msc.ws2;

import javax.ejb.Stateful;

import edu.utfpr.ppgca.msc.external.BankServices;

@Stateful(mappedName = "financial/transaction")
public class FinancialTransaction {

	private BankServices bankService;

	public FinancialTransactionResponse sendSimulationToBank(FinancialTransactionBO transaction) {
		FinancialTransactionResponse response = bankService.validateFunding(transaction);
		// Método não implementado para este exmeplo.
		return response;
	}
	
}
