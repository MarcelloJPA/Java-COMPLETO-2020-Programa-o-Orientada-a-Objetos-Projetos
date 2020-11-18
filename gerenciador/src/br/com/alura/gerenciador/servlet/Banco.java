package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	/*Sendo o atributo lista estático, estará acessível por qualquer classe da nossa aplicação, 
	 * inclusive servlets que capazes de listar os dados para o usuário*/
    private static List<Empresa> lista = new ArrayList<>();

	public static List<Empresa> getLista() {
		return lista;
	}

	public static void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		Banco.lista.add(empresa);
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		Banco.lista.add(empresa2);
	}
    
    

}
