package br.com.wtsyst.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.wtsyst.bean.Aluno;
import br.com.wtsyst.controle.AlunoBCI;
import br.com.wtsyst.dao.AlunoDaoI;

@Controller
public class AlunoBC implements AlunoBCI {

	@Autowired
	private AlunoDaoI dao;
	
	@Override
	public void insert(Aluno a) {
		dao.save(a);
	}

	@Override
	public List<Aluno> select() {
		return dao.findAll();
	}

	@Override
	public Boolean aprovado(Aluno a) {
		return a.getNota() >= 7;
	}

}
