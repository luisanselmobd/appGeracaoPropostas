package br.edu.infnet.appGeracaoPropostas.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Infraestrutura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String nome;	
	private String localizacao;	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;	
	@OneToMany(mappedBy = "infraestrutura", cascade = CascadeType.ALL)
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

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

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
	
	public Infraestrutura() {
		
	}

	

}
