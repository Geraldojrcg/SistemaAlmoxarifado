package com.br.ufrn.almoxarifado;

import java.math.BigDecimal;
import java.util.Date;

import com.br.ufrn.almoxarifado.producao.OrdemProducao;
import com.br.ufrn.almoxarifado.rh.PessoaJuridica;

public class LoteMaterial {
	private Material material;
	private Date dataValidade;
	private Date dataFabricacao;
	private EstadoLote estado;
	private String numeroLoteFabricante;
	private String numeroLoteInterno;
	private String numeroLoteFornecedor;
	private int volumes;
	private OrdemProducao ordemProducao;
	private PessoaJuridica fabricante;
	private PessoaJuridica fornecedor;
	private int qtdCaixaEmbarque;
	private BigDecimal pesoBrutoTotal;
	private BigDecimal pesoLiquidoTotal;
	private BigDecimal tara;
	private Double valorUnitario;
	
	public Material getMaterial() {
		return material;
	}
	public void setMaterial(Material material) {
		this.material = material;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public EstadoLote getEstado() {
		return estado;
	}
	public void setEstado(EstadoLote estado) {
		this.estado = estado;
	}
	public String getNumeroLoteFabricante() {
		return numeroLoteFabricante;
	}
	public void setNumeroLoteFabricante(String numeroLoteFabricante) {
		this.numeroLoteFabricante = numeroLoteFabricante;
	}
	public String getNumeroLoteInterno() {
		return numeroLoteInterno;
	}
	public void setNumeroLoteInterno(String numeroLoteInterno) {
		this.numeroLoteInterno = numeroLoteInterno;
	}
	public String getNumeroLoteFornecedor() {
		return numeroLoteFornecedor;
	}
	public void setNumeroLoteFornecedor(String numeroLoteFornecedor) {
		this.numeroLoteFornecedor = numeroLoteFornecedor;
	}
	public int getVolumes() {
		return volumes;
	}
	public void setVolumes(int volumes) {
		this.volumes = volumes;
	}
	public OrdemProducao getOrdemProducao() {
		return ordemProducao;
	}
	public void setOrdemProducao(OrdemProducao ordemProducao) {
		this.ordemProducao = ordemProducao;
	}
	public PessoaJuridica getFabricante() {
		return fabricante;
	}
	public void setFabricante(PessoaJuridica fabricante) {
		this.fabricante = fabricante;
	}
	public PessoaJuridica getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(PessoaJuridica fornecedor) {
		this.fornecedor = fornecedor;
	}
	public int getQtdCaixaEmbarque() {
		return qtdCaixaEmbarque;
	}
	public void setQtdCaixaEmbarque(int qtdCaixaEmbarque) {
		this.qtdCaixaEmbarque = qtdCaixaEmbarque;
	}
	public BigDecimal getPesoBrutoTotal() {
		return pesoBrutoTotal;
	}
	public void setPesoBrutoTotal(BigDecimal pesoBrutoTotal) {
		this.pesoBrutoTotal = pesoBrutoTotal;
	}
	public BigDecimal getPesoLiquidoTotal() {
		return pesoLiquidoTotal;
	}
	public void setPesoLiquidoTotal(BigDecimal pesoLiquidoTotal) {
		this.pesoLiquidoTotal = pesoLiquidoTotal;
	}
	public BigDecimal getTara() {
		return tara;
	}
	public void setTara(BigDecimal tara) {
		this.tara = tara;
	}
	public Double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
}
