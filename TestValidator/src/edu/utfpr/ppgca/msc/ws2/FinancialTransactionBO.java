package edu.utfpr.ppgca.msc.ws2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "cardTransaction")
public class FinancialTransactionBO {

	@XmlElement(required = true)
	private String documento;

	@XmlElement(required = true)
	private String nome;

	@XmlElement(required = true)
	private Double valor;

	@XmlElement(required = true)
	private Integer numParcelas;

	@XmlElement(required = true)
	private String tipoJuros;

	@XmlElement(required = true)
	private Double rendaFamiliar;

	private Boolean correntista;

	public FinancialTransactionBO() {
	}

	public FinancialTransactionBO(String documento, String nome, Double valor, Integer numParcelas,
		String tipoJuros, Double rendaFamiliar, Boolean correntista) {
		this.documento = documento;
		this.nome = nome;
		this.valor = valor;
		this.numParcelas = numParcelas;
		this.tipoJuros = tipoJuros;
		this.rendaFamiliar = rendaFamiliar;
		this.correntista = correntista;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(Integer numParcelas) {
		this.numParcelas = numParcelas;
	}

	public String getTipoJuros() {
		return tipoJuros;
	}

	public void setTipoJuros(String tipoJuros) {
		this.tipoJuros = tipoJuros;
	}

	public Double getRendaFamiliar() {
		return rendaFamiliar;
	}

	public void setRendaFamiliar(Double rendaFamiliar) {
		this.rendaFamiliar = rendaFamiliar;
	}

	public Boolean isCorrentista() {
		return correntista;
	}

	public void setCorrentista(Boolean correntista) {
		this.correntista = correntista;
	}
}
