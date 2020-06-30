package com.warlemcarlos.lojalivre.business.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@RequestScoped

@ManagedBean(name="catalogo")


public class catalogoBean {
 
	private string nome;
	private string categoria;
	private float preço;
	
	public string getNome() {
		return nome;
	}
	public void setNome(string nome) {
		this.nome = nome;
	}
	public string getCategoria() {
		return categoria;
	}
	public void setCategoria(string categoria) {
		this.categoria = categoria;
	}
	public Float getPreço() {
		return preço;
	}
	public void setPreço(Float preço) {
		this.preço = preço;
	}
	
}
