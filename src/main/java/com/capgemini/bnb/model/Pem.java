package com.capgemini.bnb.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pem  implements Serializable{
	private static final long serialVersionUID = 1L;

	private int codigo;
	private String instituicao;
	private int valorDoLimiteUtilizado;
	
	

	@Id 
	@GeneratedValue 
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public int getValorDoLimiteUtilizado() {
		return valorDoLimiteUtilizado;
	}
	public void setValorDoLimiteUtilizado(int valorDoLimiteUtilizado) {
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
		Pem other = (Pem) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	

}
