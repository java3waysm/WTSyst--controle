package br.com.wtsyst.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.wtsyst.bean.Curso;
import br.com.wtsyst.controle.CursoBCI;
import br.com.wtsyst.dao.CursoDaoI;

public class CursoBC implements CursoBCI {

	@Autowired
	private CursoDaoI dao;
	
	@Override
	public void insert(Curso c) {
	dao.save(c);
		
	}

	@Override
	public void excluir(Curso c) {
		dao.delete(c);
		
	}

	@Override
	public void atualizar(Curso c) {
		dao.save(c);
		
	}

	@Override
	public List<Curso> select() {
		return dao.findAll();
	}

}
