package br.com.wtsyst.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.wtsyst.bean.Aluno;
import br.com.wtsyst.bean.Avaliacao;
import br.com.wtsyst.bean.Curso;
import br.com.wtsyst.bean.Escola;
import br.com.wtsyst.configuration.Jpa;
import br.com.wtsyst.controle.AvaliacaoBCI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Jpa.class})
public class AvaliacaoTeste {
	
	@Autowired
	private AvaliacaoBCI controle;
	
		
	@Test
	public void avaliaAprovacao() {
		
		Escola e = new Escola();
		e.setMediaAprovacao(7);
		
		Curso c = new Curso();
		c.setEscola(e);
		
		Aluno a = new Aluno();
		Avaliacao av = new Avaliacao();
		
		av.setAluno(a);
		av.setCurso(c);
		
		
		av.setNota(8.0);
		controle.avaliaResultados(av);
		Assert.assertEquals(true, av.getAprovado());

		av.setNota(4.0);
		controle.avaliaResultados(av);
		Assert.assertEquals(false, av.getAprovado());
		
		av.getCurso().getEscola().setMediaAprovacao(3);
		controle.avaliaResultados(av);
		Assert.assertEquals(true, av.getAprovado());
		
		
		
		av.getCurso().getEscola().setMediaAprovacao(7);
		av.setNota(7.0);
		controle.avaliaResultados(av);
		Assert.assertEquals(true, av.getAprovado());
		
		
	}
	
	
	
}







