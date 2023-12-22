package br.edu.infnet.appGeracaoPropostas.model.domain;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String nome;
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	@JsonBackReference("infraestruturas")
	private List<Infraestrutura> infraestruturas;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Infraestrutura> getInfraestruturas() {
		return infraestruturas;
	}

	public void setInfraestruturas(Collection<Infraestrutura> collection) {
		this.infraestruturas = (List<Infraestrutura>) collection;
	}

	public Cliente() {
		
	}
	
	public Cliente(String nome) {
		setNome(nome);
	}
		
	public String toString() {
		return String.format("Nome: %s ", this.getNome());
	}

	
	
}
