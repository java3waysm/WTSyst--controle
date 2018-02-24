package br.com.wtsyst.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.wtsyst.bean.Professor;
import br.com.wtsyst.controle.ProfessorBCI;
import br.com.wtsyst.dao.ProfessorDaoI;

@Controller
public class ProfessorBC implements ProfessorBCI{

	@Autowired
	private ProfessorDaoI dao;
	
	@Override
	public void insert(Professor e) {
		dao.save(e);
	}

	@Override
	public void excluir(Professor e) {
		dao.delete(e);
	}

	@Override
	public void atualizar(Professor e) {
		dao.save(e);
		
	}

	@Override
	public List<Professor> select() {
		return dao.findAll();
	}

}
