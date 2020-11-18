package livro01;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		 String nome= sc.nextLine();
		 String cor = sc.nextLine();
		 double preco = sc.nextFloat();
		 int quantidade = sc.nextInt();

		 Imovel imovel = new Imovel(nome, cor, preco, quantidade);
		 
		 System.out.print(imovel);
		
		
		
		
		
		sc.close();

	}

}
