package br.edu.infnet.appGeracaoPropostas.model.domain;
import javax.persistence.*;

/*@MappedSuperclass*/
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Colaborador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String nome;
	private String email;
	
	

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Colaborador() {

	}
	
	public Colaborador(String nome, String email) {
		setNome(nome);
		setEmail(email);
	}
}
