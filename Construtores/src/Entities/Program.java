package Entities;
/*
O construtor � um m�todo cujo o nome deve ser o mesmo da classe sem indica��o de retorno, nem mesmo void.
O construtor � invocado na cria��o do objeto, atrav�s do operador new.
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
