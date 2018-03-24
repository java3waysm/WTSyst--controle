package br.com.wtsyst.controle.impl;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.wtsyst.bean.Carro;
import br.com.wtsyst.controle.CarroBCI;
import br.com.wtsyst.dao.CarroDaoI;

@Controller
public class CarroBC implements CarroBCI {

	@Autowired
	private CarroDaoI dao;

	@Override
	public void insert(Carro c) {
		dao.save(c);
	}

	@Override
	public List<Carro> select() {

		Calendar init = new GregorianCalendar();
		init.set(Calendar.YEAR, 1980);

		Calendar fim = new GregorianCalendar();
		fim.set(Calendar.YEAR, 1989);

		return dao.findByPessoa_nascimentoBetween(init, fim);
	}

}
