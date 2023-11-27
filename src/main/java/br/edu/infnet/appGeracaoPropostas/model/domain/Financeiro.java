package br.edu.infnet.appGeracaoPropostas.model.domain;

public class Financeiro extends Colaborador {

	public String toString() {
		return String.format("Nome: %s | E-mail: %s", super.getNome(), super.getEmail());
	}
	
	public Financeiro(String nome, String email) {
	    super(nome, email);
	}
	
}
