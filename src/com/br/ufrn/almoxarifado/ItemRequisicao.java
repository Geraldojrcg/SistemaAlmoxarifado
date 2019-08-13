package com.br.ufrn.almoxarifado;

import java.math.BigDecimal;

public class ItemRequisicao {
	private Material material;
	private BigDecimal qtdRequisicao;
	private BigDecimal qtdAtendida;
	private UnidadeMedida unidadeMedida;
	
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public BigDecimal getQtdRequisicao() {
		return qtdRequisicao;
	}
	public void setQtdRequisicao(BigDecimal qtdRequisicao) {
		this.qtdRequisicao = qtdRequisicao;
	}
	public BigDecimal getQtdAtendida() {
		return qtdAtendida;
	}
	public void setQtdAtendida(BigDecimal qtdAtendida) {
		this.qtdAtendida = qtdAtendida;
	}
	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	
}
