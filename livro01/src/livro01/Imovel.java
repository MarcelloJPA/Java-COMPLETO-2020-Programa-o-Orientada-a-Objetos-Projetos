package livro01;

public class Imovel {
	public String nome;
	public String cor;
	public double preco;
	public int quantidade;
	
	public Imovel(){
		
	}
	
	public Imovel(String nome, String cor, double preco, int quantidade) {
		this.nome = nome;
		this.cor = cor;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public String toString() {
		return nome + " " + cor + " " + preco +  " " + quantidade;
	}
	
}
