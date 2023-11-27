package br.edu.infnet.appGeracaoPropostas.model.domain;

import java.util.List;

public class Servico {

	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private String descricao;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	private List<Projeto> projetos;
	public List<Projeto> getProjetos() {
		return projetos;
	}
	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}
	
	
	public Servico(String nome, String descricao) {
		setNome(nome);
		setDescricao(descricao);
	}
		
	public String toString() {
		return String.format("Nome: %s | Descrição: %s ", this.getNome(), this.getDescricao());
	}
	
}
