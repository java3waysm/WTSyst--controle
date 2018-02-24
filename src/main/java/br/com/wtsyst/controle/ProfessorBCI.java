package br.com.wtsyst.controle;

import java.util.List;

import org.springframework.stereotype.Controller;

import br.com.wtsyst.bean.Professor;

public interface ProfessorBCI {

	public void insert(Professor a);
	
	public void excluir(Professor a);
	
	public void atualizar(Professor a);
	
	public List<Professor> select();
	
}
