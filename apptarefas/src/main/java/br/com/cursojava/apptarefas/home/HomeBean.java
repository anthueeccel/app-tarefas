package br.com.cursojava.apptarefas.home;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.cursojava.apptarefas.utils.AbstractBean;
import br.com.cursojava.apptarefasfacade.HelloFacade;
;

@ManagedBean
public class HomeBean extends AbstractBean{

	private HelloFacade facade = new HelloFacade();
	private String nome = "";
	
	private List<String> nomes = Arrays.asList("Jo�o","Maria","Ana","Frederico","Tib�rcio","Clotilde","Jaime");


	public String getMensagem() {
		return facade.getMensagem();
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<String> getNomes() {
		return nomes;
	}
}
