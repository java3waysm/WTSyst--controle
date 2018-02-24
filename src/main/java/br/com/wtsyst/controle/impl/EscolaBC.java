package br.com.wtsyst.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.wtsyst.bean.Escola;
import br.com.wtsyst.controle.EscolaBCI;
import br.com.wtsyst.dao.EscolaDaoI;

@Controller
public class EscolaBC implements EscolaBCI {

	/*teste*/
	@Autowired
	private EscolaDaoI dao;
	
	@Override
	public void insert(Escola e) {
		dao.save(e);
		
	}

	@Override
	public void excluir(Escola e) {
		dao.delete(e);
		
	}

	@Override
	public void atualizar(Escola e) {
		dao.save(e);
		
	}

	@Override
	public List<Escola> select() {
		return dao.findAll();
	}

}
