package br.com.wtsyst.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wtsyst.bean.Curso;

public interface CursoDaoI extends JpaRepository<Curso, Long> {

}
