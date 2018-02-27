package br.com.wtsyst.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.wtsyst.bean.Curso;
import br.com.wtsyst.configuration.Jpa;
import br.com.wtsyst.controle.CursoBCI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Jpa.class})
public class CursoTeste {

	@Autowired
	private CursoBCI controle;
	
	
	
	@Test
	public void avaliaCurso() {
		
		Curso c = new Curso();
		
		c.setNota(4);
		controle.avaliaCurso(c);
		Assert.assertEquals(true, c.getValido());
		
		
		c.setNota(3);
		controle.avaliaCurso(c);
		Assert.assertEquals(true, c.getValido());
		
		c.setNota(2);
		controle.avaliaCurso(c);
		Assert.assertEquals(false, c.getValido());
		
		
		c.setNota(1);
		controle.avaliaCurso(c);
		Assert.assertEquals(false, c.getValido());
		
		c.setNota(0);
		controle.avaliaCurso(c);
		Assert.assertEquals(false, c.getValido());
		
	}
	
}
