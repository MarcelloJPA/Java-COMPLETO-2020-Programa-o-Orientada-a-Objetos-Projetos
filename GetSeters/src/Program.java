import java.util.Locale;
import java.util.Scanner;
import Entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a descrição do Produto: ");
		String name = sc.nextLine();
		
		System.out.println("Preço do produto");
		double price = sc.nextDouble();
		
		System.out.println("QUantidade: ");
		int quantity = sc.nextInt();
		
		Product produto = new Product(name, price, quantity);
		
		Product carro = new Product(name, quantity);
		
	
		
		System.out.println(carro.getName());
		
		carro.setName("Porta");
		
		System.out.println(carro.getName());
		
		
		System.out.println(produto.getPrice());
		produto.setPrice(200.20);
		
		System.out.println(produto.getPrice());
		
		
		sc.close();

	}

}
