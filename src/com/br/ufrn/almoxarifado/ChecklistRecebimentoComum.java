package com.br.ufrn.almoxarifado;

import java.util.Date;
import java.util.List;

import com.br.ufrn.almoxarifado.rh.Funcionario;
import com.sun.xml.internal.txw2.Document;

public class ChecklistRecebimentoComum {
	private Date dataChegada;
	private LoteMaterial lote;
	private Boolean materialConfereNF;
	private Boolean etiquetadoIdentificacao;
	private Boolean embalagemIntegra;
	private Boolean embalagemSuja;
	private Boolean embalagemUmida;
	private Boolean embalagemDeformada;
	private Boolean embalagemVazada;
	private Boolean embalagemLacreViolado;
	private String placa;
	private Float temperatura;
	private int numeroConhecimento;
	private String motorista;
	private String observacoes;
	private Funcionario conferente;
	private List<Document> anexoFotos;
	private Boolean aprovado;
	
	public Date getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}
	public LoteMaterial getLote() {
		return lote;
	}
	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}
	public Boolean getMaterialConfereNF() {
		return materialConfereNF;
	}
	public void setMaterialConfereNF(Boolean materialConfereNF) {
		this.materialConfereNF = materialConfereNF;
	}
	public Boolean getEtiquetadoIdentificacao() {
		return etiquetadoIdentificacao;
	}
	public void setEtiquetadoIdentificacao(Boolean etiquetadoIdentificacao) {
		this.etiquetadoIdentificacao = etiquetadoIdentificacao;
	}
	public Boolean getEmbalagemIntegra() {
		return embalagemIntegra;
	}
	public void setEmbalagemIntegra(Boolean embalagemIntegra) {
		this.embalagemIntegra = embalagemIntegra;
	}
	public Boolean getEmbalagemSuja() {
		return embalagemSuja;
	}
	public void setEmbalagemSuja(Boolean embalagemSuja) {
		this.embalagemSuja = embalagemSuja;
	}
	public Boolean getEmbalagemUmida() {
		return embalagemUmida;
	}
	public void setEmbalagemUmida(Boolean embalagemUmida) {
		this.embalagemUmida = embalagemUmida;
	}
	public Boolean getEmbalagemDeformada() {
		return embalagemDeformada;
	}
	public void setEmbalagemDeformada(Boolean embalagemDeformada) {
		this.embalagemDeformada = embalagemDeformada;
	}
	public Boolean getEmbalagemVazada() {
		return embalagemVazada;
	}
	public void setEmbalagemVazada(Boolean embalagemVazada) {
		this.embalagemVazada = embalagemVazada;
	}
	public Boolean getEmbalagemLacreViolado() {
		return embalagemLacreViolado;
	}
	public void setEmbalagemLacreViolado(Boolean embalagemLacreViolado) {
		this.embalagemLacreViolado = embalagemLacreViolado;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Float temperatura) {
		this.temperatura = temperatura;
	}
	public int getNumeroConhecimento() {
		return numeroConhecimento;
	}
	public void setNumeroConhecimento(int numeroConhecimento) {
		this.numeroConhecimento = numeroConhecimento;
	}
	public String getMotorista() {
		return motorista;
	}
	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Funcionario getConferente() {
		return conferente;
	}
	public void setConferente(Funcionario conferente) {
		this.conferente = conferente;
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
