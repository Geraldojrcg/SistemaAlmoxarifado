package com.br.ufrn.almoxarifado;

import java.math.BigDecimal;

public class Material {
	private int codigo;
	private String nome;
	private String especificacao;
	private GrupoMaterial grupoMaterial;
	private int estoqueMinimo;
	private int pontoPedido;
	private UnidadeMedida unidadeEstoque;
	private UnidadeMedida unidadeEntrada;
	private BigDecimal fatorConversaoEntrada;
	private BigDecimal fatorConversaoSaida;
	private UnidadeMedida unidadeSaida;
	private String dadosAdicionais;
	private ClassificacaoMaterial classificacao;
	private int catmat;
	private String condicaoArmazenagem;
	private StatusMaterial status;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecificacao() {
		return especificacao;
	}
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	public GrupoMaterial getGrupoMaterial() {
		return grupoMaterial;
	}
	public void setGrupoMaterial(GrupoMaterial grupoMaterial) {
		this.grupoMaterial = grupoMaterial;
	}
	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}
	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}
	public int getPontoPedido() {
		return pontoPedido;
	}
	public void setPontoPedido(int pontoPedido) {
		this.pontoPedido = pontoPedido;
	}
	public UnidadeMedida getUnidadeEstoque() {
		return unidadeEstoque;
	}
	public void setUnidadeEstoque(UnidadeMedida unidadeEstoque) {
		this.unidadeEstoque = unidadeEstoque;
	}
	public UnidadeMedida getUnidadeEntrada() {
		return unidadeEntrada;
	}
	public void setUnidadeEntrada(UnidadeMedida unidadeEntrada) {
		this.unidadeEntrada = unidadeEntrada;
	}
	public BigDecimal getFatorConversaoEntrada() {
		return fatorConversaoEntrada;
	}
	public void setFatorConversaoEntrada(BigDecimal fatorConversaoEntrada) {
		this.fatorConversaoEntrada = fatorConversaoEntrada;
	}
	public BigDecimal getFatorConversaoSaida() {
		return fatorConversaoSaida;
	}
	public void setFatorConversaoSaida(BigDecimal fatorConversaoSaida) {
		this.fatorConversaoSaida = fatorConversaoSaida;
	}
	public UnidadeMedida getUnidadeSaida() {
		return unidadeSaida;
	}
	public void setUnidadeSaida(UnidadeMedida unidadeSaida) {
		this.unidadeSaida = unidadeSaida;
	}
	public String getDadosAdicionais() {
		return dadosAdicionais;
	}
	public void setDadosAdicionais(String dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}
	public ClassificacaoMaterial getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(ClassificacaoMaterial classificacao) {
		this.classificacao = classificacao;
	}
	public int getCatmat() {
		return catmat;
	}
	public void setCatmat(int catmat) {
		this.catmat = catmat;
	}
	public String getCondicaoArmazenagem() {
		return condicaoArmazenagem;
	}
	public void setCondicaoArmazenagem(String condicaoArmazenagem) {
		this.condicaoArmazenagem = condicaoArmazenagem;
	}
	public StatusMaterial getStatus() {
		return status;
	}
	public void setStatus(StatusMaterial status) {
		this.status = status;
	}
	
}
