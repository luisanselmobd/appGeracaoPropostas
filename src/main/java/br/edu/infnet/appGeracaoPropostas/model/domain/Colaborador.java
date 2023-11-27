package br.edu.infnet.appGeracaoPropostas.model.domain;

public abstract class Colaborador {
	private String nome;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Colaborador(String nome, String email) {
		setNome(nome);
		setEmail(email);
	}
}
