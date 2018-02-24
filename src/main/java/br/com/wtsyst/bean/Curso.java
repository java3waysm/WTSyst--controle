package br.com.wtsyst.bean;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_curso")
	private Integer id;
	private String nome;
	@OneToOne
	
	private Professor professor;

	@OneToMany(targetEntity = Curso.class, mappedBy = "curso", fetch = FetchType.LAZY)	
	
	@ManyToMany(fetch = FetchType.LAZY, targetEntity = Aluno.class, mappedBy = "cursos")
	private List<Aluno> alunos;
	@ManyToOne
	
	private Escola escola;
	
	
	
	public Escola getEscola() {
		return escola;
	}
	public void setEscola(Escola escola) {
		this.escola = escola;
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
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
}
