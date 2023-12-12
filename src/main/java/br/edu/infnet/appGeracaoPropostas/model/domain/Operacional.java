package br.edu.infnet.appGeracaoPropostas.model.domain;
import javax.persistence.Entity;

@Entity
public class Operacional extends Colaborador {
	
	public Operacional() {
		
	}
	
	public String toString() {
		return String.format("Nome: %s | E-mail: %s", super.getNome(), super.getEmail());
	}
	
	public Operacional(String nome, String email) {
	    super(nome, email);
	}

}
