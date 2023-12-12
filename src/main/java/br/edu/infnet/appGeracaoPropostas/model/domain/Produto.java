package br.edu.infnet.appGeracaoPropostas.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Produto {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String nome;
	private String marca;	
	private String modelo;	
	private float alturaInstalacao;	
	private float quantidade;	
	private String unidadeMedida;
	@ManyToMany(mappedBy="produtos")
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getAlturaInstalacao() {
		return alturaInstalacao;
	}

	public void setAlturaInstalacao(float alturaInstalacao) {
		this.alturaInstalacao = alturaInstalacao;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

	public Produto() {
		
	}

	public Produto(String nome, String marca, String modelo) {
		setNome(nome);
		setMarca(marca);
		setModelo(modelo);
	}
		
	public String toString() {
		return String.format("Nome: %s | Marca: %s | Modelo: %s", this.getNome(), this.getMarca(), this.getModelo());
	}


}