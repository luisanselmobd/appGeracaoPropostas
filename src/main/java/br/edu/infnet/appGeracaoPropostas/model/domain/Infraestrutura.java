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
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
public class Infraestrutura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String nome;	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idEndereco")
	private Endereco endereco;
	@ManyToOne
	@JsonBackReference("cliente")
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;	
	@OneToMany(mappedBy = "infraestrutura", cascade = CascadeType.ALL)
	@JsonBackReference("projetos")
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



	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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

	public Infraestrutura(String nome, Endereco endereco, Cliente cliente) {
		setNome(nome);
		setEndereco(endereco);
		setCliente(cliente);
	}
		
	public String toString() {
		return String.format("Nome: %s | Endereço: %s | Cliente: %s", this.getNome(), this.getEndereco(), this.getCliente());
	}
	
	public Infraestrutura() {
		
	}

	

}
