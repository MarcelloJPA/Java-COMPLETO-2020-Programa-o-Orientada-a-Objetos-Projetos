package Entities;

public class Product {
	
	//private para proteger os atributos
	private String name;
	private double price;
	private int quantity;
	
	
	//Construtor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Sobrecarga(Utilizar o mesmo construtor com parametros diferentes)
	public Product(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	
	//Getter (Retornar atributo)
	public String getName() {
		return name;
	}
	
	//Setter (Alterar atributo)
	//void (Não retorna nada)
	public void setName(String name) {
		 this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	

}
