package br.com.wtsyst.dao;

import br.com.wtsyst.bean.Escola;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EscolaDaoI extends JpaRepository<Escola, Long> {

}
