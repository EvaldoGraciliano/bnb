package com.capgemini.bnb.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class FundosDeInvestimento implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long codigo;
	private String instituicao;
	private BigDecimal valorDoLimiteUtilizado;
	
	
	@Id 
	@GeneratedValue 
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public BigDecimal getValorDoLimiteUtilizado() {
		return valorDoLimiteUtilizado;
	}

	public void setValorDoLimiteUtilizado(BigDecimal valorDoLimiteUtilizado) {
		this.valorDoLimiteUtilizado = valorDoLimiteUtilizado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FundosDeInvestimento other = (FundosDeInvestimento) obj;
		return Objects.equals(codigo, other.codigo);
	}

}
