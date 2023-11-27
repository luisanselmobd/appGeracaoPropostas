package br.edu.infnet.appGeracaoPropostas.model.domain;

import java.util.List;

public class Projeto {
	
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private String identificacao;
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	
	private List<Produto> produtos;
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	private List<Servico> servicos;
	public List<Servico> getServicos() {
		return servicos;
	}
	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
	
	private Infraestrutura infraestrutura;
	public Infraestrutura getInfraestrutura() {
		return infraestrutura;
	}
	public void setInfraestrutura(Infraestrutura infraestrutura) {
		this.infraestrutura = infraestrutura;
	}
	
	public Projeto(String nome, String identificacao, Infraestrutura infraestrutura) {
		setNome(nome);
		setIdentificacao(identificacao);
		setInfraestrutura(infraestrutura);
	}
		
	public String toString() {
		return String.format("Nome: %s | Identificação: %s | Infraestrutura: %s ", this.getNome(), this.getIdentificacao(), this.getInfraestrutura());
	}

	

}
