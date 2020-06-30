package com.warlemcarlos.lojalivre.business.bean;



import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@SessionScoped

@ManagedBean(name="itens")
public class itensBean {
	private List<catalogoBean>itens;
	
	public itensBean() {

     itens = new ArrayList<>();
}

	public List<catalogoBean> getItens() {
		return itens;
	}

	
	}

	
	

