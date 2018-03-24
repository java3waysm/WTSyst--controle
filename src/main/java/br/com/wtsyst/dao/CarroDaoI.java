package br.com.wtsyst.dao;

import java.util.Calendar;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.wtsyst.bean.Carro;

//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/

public interface CarroDaoI extends JpaRepository<Carro, Long> {

	 @Query("select c from Carro c where c.nome = ?1 and c.endereco = ?2")
	 public Carro buscaPorNome(String nome, String endereco);
	
	
	public List<Carro> findByNome(String s);
	
	public List<Carro> findByNomeOrCor(String s, String c);
	
	public List<Carro> findByAnoBetween(Calendar init, Calendar fim); 
	
	public List<Carro> findByAnoBetweenAndNomeOrNome(Calendar init, Calendar fim, String nome, String nome2); 

	public List<Carro> findByPessoa_nascimentoBetween(Calendar init, Calendar fim);
	

}
