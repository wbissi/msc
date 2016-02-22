package edu.utfpr.ppgca.msc.ws1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import edu.utfpr.ppgca.msc.external.CodeType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "message", "codeType" })
@XmlRootElement(name = "creditCardResponse")
public class CreditCardResponse {

	private String message;

	private CodeType codeType;

	public CreditCardResponse() {
	}

	public CreditCardResponse(String code) {
		this.codeType = CodeType.get(code);
		this.message = codeType.getMessage();
	}

	public CreditCardResponse(String code, String message) {
		this.message = message;
		this.codeType = CodeType.get(code);
	}

	public CreditCardResponse(String message, CodeType codeType) {
		this.message = message;
		this.codeType = codeType;
	}

	public CreditCardResponse(CodeType codeType) {
		this.message = codeType.getMessage();
		this.codeType = codeType;
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
