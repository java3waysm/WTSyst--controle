package br.com.wtsyst.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_escola", sequenceName = "escola_seq", initialValue = 1)
public class Escola {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_escola")	
	private Integer id;
	private String nome;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH, targetEntity = Curso.class, mappedBy = "escola")
	private List<Curso> cursos;
	
	private String endereco;
	private Double mediaAprovacao;
	
	
	public Escola() {
	}

	public Escola(Integer id) {
		this.id = id;
	}
	
	public Double getMediaAprovacao() {
		return mediaAprovacao;
	}
	public void setMediaAprovacao(Double mediaAprovacao) {
		this.mediaAprovacao = mediaAprovacao;
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
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
