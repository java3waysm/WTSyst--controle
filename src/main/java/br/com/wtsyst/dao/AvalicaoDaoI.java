package br.com.wtsyst.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wtsyst.bean.Avaliacao;

public interface AvalicaoDaoI extends JpaRepository<Avaliacao, Long>{

}
