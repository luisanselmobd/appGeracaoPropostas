package br.edu.infnet.appGeracaoPropostas.model.domain;
import javax.persistence.Entity;

@Entity
public class Comercial extends Colaborador {
	
    public Comercial() {
    }
    
	public String toString() {
		return String.format("Nome: %s | E-mail: %s", super.getNome(), super.getEmail());
	}
	
	public Comercial(String nome, String email) {
	    super(nome, email);
	}

}
