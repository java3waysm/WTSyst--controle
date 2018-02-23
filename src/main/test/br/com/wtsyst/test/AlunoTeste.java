package br.com.wtsyst.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.wtsyst.bean.Aluno;
import br.com.wtsyst.configuration.Jpa;
import br.com.wtsyst.controle.AlunoBCI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Jpa.class})
public class AlunoTeste {

	@Autowired
	private AlunoBCI controle;
	
	@Test
	public void testeAprovado() {
		Aluno a = new Aluno();
		a.setNota(0.5);
		Assert.assertEquals(true, controle.aprovado(a));
	}
	
}
