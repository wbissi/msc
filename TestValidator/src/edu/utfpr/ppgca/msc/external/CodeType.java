package edu.utfpr.ppgca.msc.external;

import javax.xml.bind.annotation.XmlEnumValue;

public enum CodeType {

	@XmlEnumValue(value = "0")
	NOT_ENUMERATED(0, "Erro Geral"),

	@XmlEnumValue(value = "1")
	SUCCESS(1, "Sucesso"),

	@XmlEnumValue(value = "2")
	INSUFFICIENT_BALANCE(2, "Saldo Insuficiente"),

	@XmlEnumValue(value = "3")
	INVALID_FIELDS(3, "Dados Inválidos"),

	@XmlEnumValue(value = "4")
	SUSPECTED_FRAUD(4, "Suspeita de Fraude"),

	@XmlEnumValue(value = "5")
	UNAUTHORIZED_TRANSACTION_BANK(5, "Transação Não Autorizada Pelo Banco"),

	@XmlEnumValue(value = "6")
	NEGATIVE_CUSTOMER(6, "Cliente Negativado (blacklist)");

	private int code;

	private String message;

	CodeType(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getValue() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public static CodeType get(String value) {
		for (CodeType codeType : values()) {
			if (Integer.valueOf(value) == codeType.getValue()) {
				return codeType;
			}
		}
		return null;
	}

}
