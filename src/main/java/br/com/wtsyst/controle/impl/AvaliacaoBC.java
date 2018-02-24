package br.com.wtsyst.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.wtsyst.bean.Avaliacao;
import br.com.wtsyst.bean.Escola;
import br.com.wtsyst.controle.AvaliacaoBCI;
import br.com.wtsyst.dao.AvalicaoDaoI;

@Controller
public class AvaliacaoBC implements AvaliacaoBCI {

	@Autowired
	private AvalicaoDaoI dao;

	@Override
	public void insert(Avaliacao a) {
		dao.save(a);
	}

	@Override
	public void excluir(Avaliacao a) {
		dao.delete(a);
	}

	@Override
	public void atualizar(Avaliacao a) {
		dao.save(a);
	}

	@Override
	public void avaliaResultados(Avaliacao a) {
		Escola e = new Escola();
		Avaliacao av = new Avaliacao();

		if (av.getNota() >= e.getMediaAprovacao()) {

			av.setAprovado(true);
		}

		else
			av.setAprovado(false);

	}

	@Override
	public List<Avaliacao> select() {
		return dao.findAll();
	}

}
