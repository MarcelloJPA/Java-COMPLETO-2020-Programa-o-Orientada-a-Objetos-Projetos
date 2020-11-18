package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();

	public List<Empresa> getLista() {
		return lista;
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	
	

}
