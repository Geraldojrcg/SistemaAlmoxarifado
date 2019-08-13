package com.br.ufrn.almoxarifado;

import java.util.Date;
import java.util.List;

import com.sun.xml.internal.txw2.Document;

public class EntradaEstoque {
	private String codigo;
	private List<MovimentacaoEstoque> itens;
	private StatusMovimentacao status;
	private String observacoes;
	private Usuario responsavel;
	private Date dataCriacao;
	private Date dataEntrada;
	private List<Document> anexos;
	private Boolean precisaConferenciaEstado;
	private Boolean precisaPesagem;
	private Boolean precisaAnalise;
	private NotaFiscal notaFiscal;
	private ChecklistRecebimentoComum checklistRecebimento;
	private ConferenciaPesagem conferenciaPesagem;
	private ChecklistTransferencia checklistTransferencia;
	private String justificativa;
	private TipoEntrada tipoEntrada;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public List<MovimentacaoEstoque> getItens() {
		return itens;
	}
	public void setItens(List<MovimentacaoEstoque> itens) {
		this.itens = itens;
	}
	public StatusMovimentacao getStatus() {
		return status;
	}
	public void setStatus(StatusMovimentacao status) {
		this.status = status;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Usuario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public List<Document> getAnexos() {
		return anexos;
	}
	public void setAnexos(List<Document> anexos) {
		this.anexos = anexos;
	}
	public Boolean getPrecisaConferenciaEstado() {
		return precisaConferenciaEstado;
	}
	public void setPrecisaConferenciaEstado(Boolean precisaConferenciaEstado) {
		this.precisaConferenciaEstado = precisaConferenciaEstado;
	}
	public Boolean getPrecisaPesagem() {
		return precisaPesagem;
	}
	public void setPrecisaPesagem(Boolean precisaPesagem) {
		this.precisaPesagem = precisaPesagem;
	}
	public Boolean getPrecisaAnalise() {
		return precisaAnalise;
	}
	public void setPrecisaAnalise(Boolean precisaAnalise) {
		this.precisaAnalise = precisaAnalise;
	}
	public NotaFiscal getNotaFiscal() {
		return notaFiscal;
	}
	public void setNotaFiscal(NotaFiscal notaFiscal) {
		this.notaFiscal = notaFiscal;
	}
	public ChecklistRecebimentoComum getChecklistRecebimento() {
		return checklistRecebimento;
	}
	public void setChecklistRecebimento(ChecklistRecebimentoComum checklistRecebimento) {
		this.checklistRecebimento = checklistRecebimento;
	}
	public ConferenciaPesagem getConferenciaPesagem() {
		return conferenciaPesagem;
	}
	public void setConferenciaPesagem(ConferenciaPesagem conferenciaPesagem) {
		this.conferenciaPesagem = conferenciaPesagem;
	}
	public ChecklistTransferencia getChecklistTransferencia() {
		return checklistTransferencia;
	}
	public void setChecklistTransferencia(ChecklistTransferencia checklistTransferencia) {
		this.checklistTransferencia = checklistTransferencia;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	public TipoEntrada getTipoEntrada() {
		return tipoEntrada;
	}
	public void setTipoEntrada(TipoEntrada tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}
	
}
