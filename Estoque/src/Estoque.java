import java.util.Locale;
import java.util.Scanner;

import entities.produto;

public class Estoque {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Da classe produto crie o objeto item com todas as caracteristicas
		produto item = new produto();
		
		System.out.println("Entre com a descrição do produto: ");
		
		System.out.println("Nome: ");
		item.name = sc.nextLine();
		
		System.out.println("Preço: ");
		item.preco = sc.nextDouble();
		
		System.out.println("Quantidade em Estoque: ");
		item.quantidade = sc.nextInt();
		
		
		System.out.println(item);
		
		
		System.out.println("Entre com a quantidade para adicionar ao estoque: ");
		int quantidade = sc.nextInt();
		item.addProdutos(quantidade);
		
		System.out.println("Atualizado: ");
		
		System.out.println(item);
		
		
		System.out.println("Entre com a quantidade para remover do estoque: ");
		quantidade = sc.nextInt();
		item.removeProdutos(quantidade);
		
		System.out.println(item);
		sc.close();
	}

}
