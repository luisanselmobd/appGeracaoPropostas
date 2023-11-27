package br.edu.infnet.appGeracaoPropostas.model.domain;

import java.util.List;

public class Infraestrutura {
	
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private String localizacao;
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	private Cliente cliente;
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	private List<Projeto> projetos;
	public List<Projeto> getProjetos() {
		return projetos;
	}
	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}
	
	public Infraestrutura(String nome, String localizacao, Cliente cliente) {
		setNome(nome);
		setLocalizacao(localizacao);
		setCliente(cliente);
	}
		
	public String toString() {
		return String.format("Nome: %s | Localização: %s | Cliente: %s", this.getNome(), this.getLocalizacao(), this.getCliente());
	}

	

}
