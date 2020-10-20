package estoqueProduto;

import java.util.Locale;
import java.util.Scanner;

import entities.produto;

public class Estoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		produto prod = new produto();
		System.out.println("Insira os dados do produto: ");
		
		System.out.println("Nome: ");
		prod.name = sc.nextLine();
		
		System.out.println("Preço: ");
		prod.price = sc.nextDouble();
		
		System.out.println("Quantidade: ");
		prod.quantity = sc.nextInt();
		
		System.out.println(prod.name + ", " + prod.price +  ", " + prod.quantity);
		
		
		
		sc.close();

	}

}
