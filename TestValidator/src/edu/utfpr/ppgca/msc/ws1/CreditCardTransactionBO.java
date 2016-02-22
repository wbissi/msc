package edu.utfpr.ppgca.msc.ws1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "card", "value", "installments", "interest" })
@XmlRootElement(name = "cardTransaction")
public class CreditCardTransactionBO {

	@XmlElement(required = true)
	private CreditCard creditCard;

	@XmlElement(required = true)
	private Double valor;

	@XmlElement(required = true)
	private Integer numParcelas;

	@XmlElement(required = true)
	private Boolean jurosParcelado;

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard card) {
		this.creditCard = card;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double value) {
		this.valor = value;
	}

	public Integer getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(Integer installments) {
		this.numParcelas = installments;
	}

	public Boolean isJurosParcelado() {
		return jurosParcelado;
	}

	public void setJurosParcelado(Boolean interest) {
		this.jurosParcelado = interest;
	}

}
