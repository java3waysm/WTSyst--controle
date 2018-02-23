package br.com.wtsyst.controle;

import java.util.List;

import br.com.wtsyst.bean.Aluno;

public interface AlunoBCI {

	public void insert(Aluno a);
	
	public List<Aluno> select();
	
	public Boolean aprovado(Aluno a);
	
}
