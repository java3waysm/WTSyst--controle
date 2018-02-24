package br.com.wtsyst.bean;

import java.util.List;

public class Escola {
	
	private Integer id;
	private String nome;
	private List<Curso> cursos;
	private String endereco;
	private Integer mediaAprovacao;
	
	
	
	public Integer getMediaAprovacao() {
		return mediaAprovacao;
	}
	public void setMediaAprovacao(Integer mediaAprovacao) {
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
