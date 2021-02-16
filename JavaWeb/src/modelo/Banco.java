package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Alunos> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Alunos aluno = new Alunos();
		aluno.setId(chaveSequencial++);
		aluno.setNome("Marcello");
		aluno.setEndereco("Estrada do Cafundá, 1757 bl7 apartamento 1007");
		
		lista.add(aluno);

	}
	

	public List<Alunos> getLista() {
		return lista;
	}

	public void adiciona(Alunos aluno) {
		aluno.setId(chaveSequencial++);
		Banco.lista.add(aluno);
	}

	public void removeAluno(Integer id) {
		
		Iterator<Alunos> it = lista.iterator();
			
		while(it.hasNext()) {
	       	 Alunos alu = it.next();
	       	 
	       	 if(alu.getId() == id) {
	       		 it.remove();
	       	 }
	       	 
	     }                    
	}
		
	

	
}

