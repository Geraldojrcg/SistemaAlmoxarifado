package com.br.ufrn.almoxarifado;

import java.math.BigDecimal;

import com.br.ufrn.almoxarifado.producao.DenominacaoComumBrasileira;
import com.sun.xml.internal.txw2.Document;

public class MaterialAnalisavel {
	private BigDecimal teorConcentracao;
	private int prazoEntrega;
	private DenominacaoComumBrasileira dcb;
	private String apresentacaoFarmaceutica;
	private BigDecimal volumeMinimo;
	private Document fichaSeguranca;
	private Long registroAnvisa;
	private BigDecimal qtdAmostraAnalise;
	private int tempoLimiteAnalise;
	private int testeMaquina;
	private Material material;
	
	public BigDecimal getTeorConcentracao() {
		return teorConcentracao;
	}
	public void setTeorConcentracao(BigDecimal teorConcentracao) {
		this.teorConcentracao = teorConcentracao;
	}
	public int getPrazoEntrega() {
		return prazoEntrega;
	}
	public void setPrazoEntrega(int prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}
	public DenominacaoComumBrasileira getDcb() {
		return dcb;
	}
	public void setDcb(DenominacaoComumBrasileira dcb) {
		this.dcb = dcb;
	}
	public String getApresentacaoFarmaceutica() {
		return apresentacaoFarmaceutica;
	}
	public void setApresentacaoFarmaceutica(String apresentacaoFarmaceutica) {
		this.apresentacaoFarmaceutica = apresentacaoFarmaceutica;
	}
	public BigDecimal getVolumeMinimo() {
		return volumeMinimo;
	}
	public void setVolumeMinimo(BigDecimal volumeMinimo) {
		this.volumeMinimo = volumeMinimo;
	}
	public Document getFichaSeguranca() {
		return fichaSeguranca;
	}
	public void setFichaSeguranca(Document fichaSeguranca) {
		this.fichaSeguranca = fichaSeguranca;
	}
	public Long getRegistroAnvisa() {
		return registroAnvisa;
	}
	public void setRegistroAnvisa(Long registroAnvisa) {
		this.registroAnvisa = registroAnvisa;
	}
	public BigDecimal getQtdAmostraAnalise() {
		return qtdAmostraAnalise;
	}
	public void setQtdAmostraAnalise(BigDecimal qtdAmostraAnalise) {
		this.qtdAmostraAnalise = qtdAmostraAnalise;
	}
	public int getTempoLimiteAnalise() {
		return tempoLimiteAnalise;
	}
	public void setTempoLimiteAnalise(int tempoLimiteAnalise) {
		this.tempoLimiteAnalise = tempoLimiteAnalise;
	}
	public int getTesteMaquina() {
		return testeMaquina;
	}
	public void setTesteMaquina(int testeMaquina) {
		this.testeMaquina = testeMaquina;
	}
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	
}
