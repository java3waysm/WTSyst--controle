package br.com.wtsyst.controle;

import java.util.List;

import br.com.wtsyst.bean.Carro;


public interface CarroBCI {

	public void insert(Carro C);
	
	public List<Carro> select();
	
	
}
