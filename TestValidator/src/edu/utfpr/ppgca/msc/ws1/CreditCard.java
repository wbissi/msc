package edu.utfpr.ppgca.msc.ws1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "numberoCartao", "cvv", "validade", "nomeTitular" })
@XmlRootElement(name = "card")
public class CreditCard {

	@XmlElement(required = true)
	private String numeroCartao;

	@XmlElement(required = true)
	private String cvv;

	@XmlElement(required = true)
	private String validade;

	@XmlElement(required = true)
	private String nomeTitular;

	public CreditCard() {
	}

	public CreditCard(String numeroCartao, String cvv, String validade, String nomeTitular) {
		this.numeroCartao = numeroCartao;
		this.cvv = cvv;
		this.validade = validade;
		this.nomeTitular = nomeTitular;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

}
