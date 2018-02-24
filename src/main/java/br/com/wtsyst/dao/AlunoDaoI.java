package br.com.wtsyst.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wtsyst.bean.Aluno;

public interface AlunoDaoI extends JpaRepository<Aluno, Long> {

}
