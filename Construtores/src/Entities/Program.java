package Entities;
/*
O construtor é um método cujo o nome deve ser o mesmo da classe sem indicação de retorno, nem mesmo void.
O construtor é invocado na criação do objeto, através do operador new.
O construtor pode receber argumentos.
*/

import java.util.Locale;
import java.util.Scanner;
import Entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name,price,quantity);
		
		System.out.println(product.name + " " + product.price  + " " + product.quantity);
		sc.close();

	}

}
