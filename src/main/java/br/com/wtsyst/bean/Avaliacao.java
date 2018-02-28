package br.com.wtsyst.bean;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name = "seq_avaliacao", sequenceName = "avaliacao_seq", initialValue = 1)
public class Avaliacao {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_avaliacao")
	private Integer id;
	
	@OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
	private Curso curso;
	
	@OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
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
