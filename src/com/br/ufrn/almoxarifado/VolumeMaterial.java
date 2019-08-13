package com.br.ufrn.almoxarifado;

import java.math.BigDecimal;

public class VolumeMaterial {
	private String codigo;
	private Material material;
	private BigDecimal qtdInicical;
	private BigDecimal qtdAtual;
	private DimensaoUnidade dimensao;
	private LocalizacaoAlmoxarifado localizacao;
	private LoteMaterial lote;
	private VolumeMaterial volumeOrigem;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public BigDecimal getQtdInicical() {
		return qtdInicical;
	}
	public void setQtdInicical(BigDecimal qtdInicical) {
		this.qtdInicical = qtdInicical;
	}
	public BigDecimal getQtdAtual() {
		return qtdAtual;
	}
	public void setQtdAtual(BigDecimal qtdAtual) {
		this.qtdAtual = qtdAtual;
	}
	public DimensaoUnidade getDimensao() {
		return dimensao;
	}
	public void setDimensao(DimensaoUnidade dimensao) {
		this.dimensao = dimensao;
	}
	public LocalizacaoAlmoxarifado getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(LocalizacaoAlmoxarifado localizacao) {
		this.localizacao = localizacao;
	}
	public LoteMaterial getLote() {
		return lote;
	}
	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}
	public VolumeMaterial getVolumeOrigem() {
		return volumeOrigem;
	}
	public void setVolumeOrigem(VolumeMaterial volumeOrigem) {
		this.volumeOrigem = volumeOrigem;
	}
}
