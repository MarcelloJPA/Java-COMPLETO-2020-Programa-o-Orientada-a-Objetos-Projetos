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
O construtor é um método cujo o nome deve ser o mesmo da classe sem indicação de retorno, nem mesmo void.
O construtor é invocado na criação do objeto, através do operador new.
O construtor pode receber argumentos.
*/