package br.edu.infnet.appGeracaoPropostas.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String nome;	
	private String descricao;
	@ManyToMany(mappedBy="servicos")
	@JsonBackReference("projetosServico")
	private List<Projeto> projetos;
	
	
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

	public Servico() {
		
	}
	
	public Servico(String nome, String descricao) {
		setNome(nome);
		setDescricao(descricao);
	}
		
	public String toString() {
		return String.format("Nome: %s | Descrição: %s ", this.getNome(), this.getDescricao());
	}
	
}