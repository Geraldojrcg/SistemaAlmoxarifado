package com.br.ufrn.almoxarifado;

import java.util.List;

public class Almoxarifado {
	private String nome;
	private Usuario chefe;
	private List<TipoMaterial> tiposMateriais;
	private List<Usuario> usuariosAlmoxarifado;
	private Boolean enderecado;
	private List<LocalizacaoAlmoxarifado> localizacoes;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Usuario getChefe() {
		return chefe;
	}
	public void setChefe(Usuario chefe) {
		this.chefe = chefe;
	}
	public List<TipoMaterial> getTiposMateriais() {
		return tiposMateriais;
	}
	public void setTiposMateriais(List<TipoMaterial> tiposMateriais) {
		this.tiposMateriais = tiposMateriais;
	}
	public List<Usuario> getUsuariosAlmoxarifado() {
		return usuariosAlmoxarifado;
	}
	public void setUsuariosAlmoxarifado(List<Usuario> usuariosAlmoxarifado) {
		this.usuariosAlmoxarifado = usuariosAlmoxarifado;
	}
	public Boolean getEnderecado() {
		return enderecado;
	}
	public void setEnderecado(Boolean enderecado) {
		this.enderecado = enderecado;
	}
	public List<LocalizacaoAlmoxarifado> getLocalizacoes() {
		return localizacoes;
	}
	public void setLocalizacoes(List<LocalizacaoAlmoxarifado> localizacoes) {
		this.localizacoes = localizacoes;
	}
	
}
