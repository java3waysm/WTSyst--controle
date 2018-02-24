package br.com.wtsyst.controle;

import java.util.List;

import br.com.wtsyst.bean.Curso;

public interface CursoBCI {

	public void insert(Curso c);
	
	public void excluir(Curso c);
	
	public void atualizar(Curso c);
	
	public void avaliaCurso(Curso c);
	
	public List<Curso> select();
	
}
