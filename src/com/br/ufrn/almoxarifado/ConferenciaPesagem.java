package com.br.ufrn.almoxarifado;

import java.util.Date;

public class ConferenciaPesagem {
	private Date data;
	private LoteMaterial lote;
	private int numeroVolumes;
	private Double taraKg;
	private int pesoVolume;
	private Boolean executado;
	private Boolean conferido;
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public LoteMaterial getLote() {
		return lote;
	}
	public void setLote(LoteMaterial lote) {
		this.lote = lote;
	}
	public int getNumeroVolumes() {
		return numeroVolumes;
	}
	public void setNumeroVolumes(int numeroVolumes) {
		this.numeroVolumes = numeroVolumes;
	}
	public Double getTaraKg() {
		return taraKg;
	}
	public void setTaraKg(Double taraKg) {
		this.taraKg = taraKg;
	}
	public int getPesoVolume() {
		return pesoVolume;
	}
	public void setPesoVolume(int pesoVolume) {
		this.pesoVolume = pesoVolume;
	}
	public Boolean getExecutado() {
		return executado;
	}
	public void setExecutado(Boolean executado) {
		this.executado = executado;
	}
	public Boolean getConferido() {
		return conferido;
	}
	public void setConferido(Boolean conferido) {
		this.conferido = conferido;
	}
	
}
