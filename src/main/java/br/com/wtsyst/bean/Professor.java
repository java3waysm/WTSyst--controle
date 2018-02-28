package br.com.wtsyst.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_professor", sequenceName = "professor_seq", initialValue = 1)
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_professor")
	private Integer id;
	private String nome;
	private String matricula;
	private String formacao;
	
	public Professor() {
	}
	public Professor(Integer id) {
		this.id = id;
	}
	
	
	
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
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
}
