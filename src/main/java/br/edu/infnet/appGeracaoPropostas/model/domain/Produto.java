package br.edu.infnet.appGeracaoPropostas.model.domain;

import java.util.List;

public class Produto {
	
	
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private String marca;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	private String modelo;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	private float alturaInstalacao;
	public float getAlturaInstalacao() {
		return alturaInstalacao;
	}
	public void setAlturaInstalacao(float alturaInstalacao) {
		this.alturaInstalacao = alturaInstalacao;
	}
	
	private float quantidade;
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	
	private String unidadeMedida;
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	
	private List<Projeto> projetos;
	public List<Projeto> getProjetos() {
		return projetos;
	}
	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}


	public Produto(String nome, String marca, String modelo) {
		setNome(nome);
		setMarca(marca);
		setModelo(modelo);
	}
		
	public String toString() {
		return String.format("Nome: %s | Marca: %s | Modelo: %s", this.getNome(), this.getMarca(), this.getModelo());
	}


}
