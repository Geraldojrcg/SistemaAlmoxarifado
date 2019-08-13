package com.br.ufrn.almoxarifado;

import java.util.Date;
import java.util.List;

import com.br.ufrn.almoxarifado.rh.PessoaJuridica;
import com.sun.xml.internal.txw2.Document;

public class SaidaEstoque {
	private Usuario responsavel;
	private Date dataEnvio;
	private Date dataCriacao;
	private List<MovimentacaoEstoque> itens;
	private StatusMovimentacao status;
	private String observacoes;
	private PessoaJuridica transportadora;
	private List<Document> anexos;
	private GuiaRemessa guiaRemessa;
	private PessoaJuridica pjDestino;
	private String justificativa;
	
	public Usuario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}
	public Date getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
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
	public PessoaJuridica getTransportadora() {
		return transportadora;
	}
	public void setTransportadora(PessoaJuridica transportadora) {
		this.transportadora = transportadora;
	}
	public List<Document> getAnexos() {
		return anexos;
	}
	public void setAnexos(List<Document> anexos) {
		this.anexos = anexos;
	}
	public GuiaRemessa getGuiaRemessa() {
		return guiaRemessa;
	}
	public void setGuiaRemessa(GuiaRemessa guiaRemessa) {
		this.guiaRemessa = guiaRemessa;
	}
	public PessoaJuridica getPjDestino() {
		return pjDestino;
	}
	public void setPjDestino(PessoaJuridica pjDestino) {
		this.pjDestino = pjDestino;
	}
	public String getJustificativa() {
		return justificativa;
	}
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
	
}
