package Entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	
	
	//Criando Construtor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

}
/*
O construtor � um m�todo cujo o nome deve ser o mesmo da classe sem indica��o de retorno, nem mesmo void.
O construtor � invocado na cria��o do objeto, atrav�s do operador new.
O construtor pode receber argumentos.
*/