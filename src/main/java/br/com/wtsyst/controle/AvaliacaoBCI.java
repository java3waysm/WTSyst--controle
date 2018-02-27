package br.com.wtsyst.controle;

import java.util.List;

import br.com.wtsyst.bean.Avaliacao;



public interface AvaliacaoBCI {

	public void insert(Avaliacao a);
	
	public void excluir(Avaliacao a);
	
	public void atualizar(Avaliacao a);
	
	public void avaliaResultados(Avaliacao a);
	
	public List<Avaliacao> select();
	
}
