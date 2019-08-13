package com.br.ufrn.almoxarifado;

import com.br.ufrn.almoxarifado.rh.Contato;
import com.br.ufrn.almoxarifado.rh.Endereco;

public class DadosEntrega {
	private Endereco endereco;
	private String local;
	private Contato contato;
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	

}
