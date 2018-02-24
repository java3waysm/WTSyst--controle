package br.com.wtsyst.controle;

import java.util.List;

import br.com.wtsyst.bean.Aluno;
import br.com.wtsyst.bean.Avaliacao;
import br.com.wtsyst.bean.Professor;

public interface ProfessorBCI {

	public void insert(Avaliacao a);
	
	public void excluir(Avaliacao a);
	
	public void atualizar(Avaliacao a);
	
	
	public List<Avaliacao> select();
	
	
	public List<Professor> selectProfessor();
	
}
