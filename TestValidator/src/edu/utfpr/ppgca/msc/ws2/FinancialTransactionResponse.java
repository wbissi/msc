package edu.utfpr.ppgca.msc.ws2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import edu.utfpr.ppgca.msc.external.CodeType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "message", "codeType" })
@XmlRootElement(name = "financialTransactionResponse")
public class FinancialTransactionResponse {

	private String message;

	private CodeType codeType;

	public FinancialTransactionResponse() {
	}

	public FinancialTransactionResponse(CodeType codeType) {
		this.message = codeType.getMessage();
		this.codeType = codeType;
	}

	public FinancialTransactionResponse(String returnCode) {
		this.codeType = CodeType.get(returnCode);
		this.message = codeType.getMessage();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CodeType getCodeType() {
		return codeType;
	}

	public void setCodeType(CodeType codeType) {
		this.codeType = codeType;
	}
}
