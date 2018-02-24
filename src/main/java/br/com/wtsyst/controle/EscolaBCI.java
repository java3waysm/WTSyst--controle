package br.com.wtsyst.controle;

import java.util.List;

import org.springframework.stereotype.Controller;

import br.com.wtsyst.bean.Escola;


public interface EscolaBCI {

	public void insert(Escola e);
	
	public void excluir(Escola e);
	
	public void atualizar(Escola e);
	
	
	public List<Escola> select();
	
}
