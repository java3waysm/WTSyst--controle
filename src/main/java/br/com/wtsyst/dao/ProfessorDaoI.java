package br.com.wtsyst.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wtsyst.bean.Professor;

public interface ProfessorDaoI extends JpaRepository<Professor, Long>{
	
}
