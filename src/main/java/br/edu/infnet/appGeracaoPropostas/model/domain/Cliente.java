package br.edu.infnet.appGeracaoPropostas.model.domain;

import java.util.List;

public class Cliente {

	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private List<Infraestrutura> infraestruturas;
	public List<Infraestrutura> getInfraestruturas() {
		return infraestruturas;
	}
	public void setInfraestruturas(List<Infraestrutura> infraestruturas) {
		this.infraestruturas = infraestruturas;
	}
	
	public Cliente(String nome) {
		setNome(nome);
	}
		
	public String toString() {
		return String.format("Nome: %s ", this.getNome());
	}
	
	
}
