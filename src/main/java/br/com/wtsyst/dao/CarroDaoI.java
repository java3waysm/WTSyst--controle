package br.com.wtsyst.dao;

import java.util.Calendar;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wtsyst.bean.Carro;

//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/

public interface CarroDaoI extends JpaRepository<Carro, Long> {

	
	public List<Carro> findByNome(String nome);

	public List<Carro> findByCor(String nome);

	public List<Carro> findByAnoBetween(Calendar ini, Calendar fim);

	public List<Carro> findByCorAndAnoBetween(String cor, Calendar ini, Calendar fim);

	public List<Carro> findByPessoa_Nome(String nome);
	
	public List<Carro> findByNomeAndPessoa_Nome(String nome, String nomeDono);

}
