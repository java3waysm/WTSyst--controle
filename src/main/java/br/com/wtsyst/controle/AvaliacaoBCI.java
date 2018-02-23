package br.com.wtsyst.controle;

import java.util.List;

import br.com.wtsyst.bean.Aluno;
import br.com.wtsyst.bean.Professor;

public interface AvaliacaoBCI {

	public void insert(Professor p);
	
	public void excluir(Professor p);
	
	public void atualizar(Professor p);
	
	
	public List<Professor> select();
	
}
