package br.edu.infnet.appGeracaoPropostas.model.domain;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String nome;	
	private String identificacao;
	
	@ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JsonBackReference("produtos")
	private List<Produto> produtos;	
	@ManyToMany(cascade = CascadeType.DETACH)
	@JsonBackReference("servicos")
	private List<Servico> servicos;	
	@ManyToOne
	@JsonBackReference("infraestrutura")
	@JoinColumn(name = "infraestrutura_id")
	private Infraestrutura infraestrutura;
	
	
	

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

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public Infraestrutura getInfraestrutura() {
		return infraestrutura;
	}

	public void setInfraestrutura(Infraestrutura infraestrutura) {
		this.infraestrutura = infraestrutura;
	}

	public Projeto() {
		
	}
	
	public Projeto(String nome, String identificacao, Infraestrutura infraestrutura) {
		setNome(nome);
		setIdentificacao(identificacao);
		setInfraestrutura(infraestrutura);
	}
	
	public String toString() {
		
		return String.format("Nome: %s | Identificação: %s | Infraestrutura: %s | Nº de produtos : %d ", this.getNome(), this.getIdentificacao(), this.getInfraestrutura(), this.getProdutos().size());
	}

	

}