package br.com.wtsyst.bean;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

public class Avaliacao {
	
	private Integer id;
	
	@OneToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Curso curso;
	
	@OneToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Aluno aluno;
	
	private Double nota;
	private Boolean aprovado;
	
	
	public Boolean getAprovado() {
		return aprovado;
	}
	public void setAprovado(Boolean aprovado) {
		this.aprovado = aprovado;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
}
