package br.com.apptarefas.projeto;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.apptarefadao.projeto.Projeto;
import br.com.apptarefadao.projeto.ProjetoRepositorio;
import br.com.apptarefadao.projeto.ProjetoStatus;

public class ProjetoRepositorioTest {
	
	ProjetoRepositorio dao;
	
	@Before
	public void antesDosTestes(){
		dao = new ProjetoRepositorio();
	}

	@Test
	public void TestInserirUm() {
		Assert.assertEquals(dao.inserir(new Projeto(null, "Teste1", "Projeto Teste1", ProjetoStatus.ATIVO, new Date(), new Date(), new Date())), true);
	}
}
