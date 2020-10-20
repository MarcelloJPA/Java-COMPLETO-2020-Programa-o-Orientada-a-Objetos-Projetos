package entities;


public class produto {
	
	public String name; //Public Informa que pode ser acesssado por outros arquivos
	public double preco;
	public int quantidade;
	
	public double totalValueInStock() {
		return quantidade * preco;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade = this.quantidade + quantidade;
	}
	
	public void removeProdutos(int quantidade) {
		this.quantidade = this.quantidade - quantidade;
	}
	
	public String toString() {
		return name 
				+ ", $ "
				+ preco
				+ ", "
				+ quantidade
				+ " unidades, Total: $  "
				+ totalValueInStock();
				
	}

}
