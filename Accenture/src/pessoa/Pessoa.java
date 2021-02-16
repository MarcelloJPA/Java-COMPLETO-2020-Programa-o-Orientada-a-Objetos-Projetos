package pessoa;

import java.util.ArrayList;

public class Pessoa {
	
	private String nome;
	private ArrayList enderecos = new ArrayList();

	public Pessoa(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(String end) {
		this.enderecos.add(end);
	}
	
	
	
	

}
