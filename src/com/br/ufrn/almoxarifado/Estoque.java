package com.br.ufrn.almoxarifado;

import java.math.BigDecimal;

public class Estoque {
	private BigDecimal qtdAtual;
	private Almoxarifado almoxarifado;
	private LoteMaterial lote;
	private Material material;
	private BigDecimal qtdMaxima;
	private MovimentacaoEstoque historicoMovimentacoes;
	
	public BigDecimal getQtdAtual() {
		return qtdAtual;
	}
	public void setQtdAtual(BigDecimal qtdAtual) {
		this.qtdAtual = qtdAtual;
	}
	public Almoxarifado getAlmoxarifado() {
		return almoxarifado;
	}
	public void setAlmoxarifado(Almoxarifado almoxarifado) {
		this.almoxarifado = almoxarifado;
	}
	public LoteMaterial getLote() {
		return lote;
	}
	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public BigDecimal getQtdMaxima() {
		return qtdMaxima;
	}
	public void setQtdMaxima(BigDecimal qtdMaxima) {
		this.qtdMaxima = qtdMaxima;
	}
	public MovimentacaoEstoque getHistoricoMovimentacoes() {
		return historicoMovimentacoes;
	}
	public void setHistoricoMovimentacoes(MovimentacaoEstoque historicoMovimentacoes) {
		this.historicoMovimentacoes = historicoMovimentacoes;
	}
	
}
