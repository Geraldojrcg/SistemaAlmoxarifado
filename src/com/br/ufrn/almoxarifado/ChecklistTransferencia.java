package com.br.ufrn.almoxarifado;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.br.ufrn.almoxarifado.rh.Endereco;
import com.sun.xml.internal.txw2.Document;

public class ChecklistTransferencia {
	private Material material;
	private BigDecimal qtd;
	private Endereco local;
	private Date dataConferencia;
	private String observacoes;
	private List<Document> anexoFotos;
	private Boolean aprovado;
	
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public BigDecimal getQtd() {
		return qtd;
	}
	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}
	public Endereco getLocal() {
		return local;
	}
	public void setLocal(Endereco local) {
		this.local = local;
	}
	public Date getDataConferencia() {
		return dataConferencia;
	}
	public void setDataConferencia(Date dataConferencia) {
		this.dataConferencia = dataConferencia;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public List<Document> getAnexoFotos() {
		return anexoFotos;
	}
	public void setAnexoFotos(List<Document> anexoFotos) {
		this.anexoFotos = anexoFotos;
	}
	public Boolean getAprovado() {
		return aprovado;
	}
	public void setAprovado(Boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	
}
