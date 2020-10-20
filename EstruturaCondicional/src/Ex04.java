import java.util.Scanner;

/* Com base na tabela abaixo, escreva um programa 
 * que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double codigo, quantidade, preco;
		
		System.out.print("Menu de 1 a 5: ");
		codigo = sc.nextInt();
		
		System.out.println("Quantos deseja? ");
		quantidade = sc.nextInt();
		
		
		if(codigo == 1) {
			preco = quantidade * 4.0;
			
		}
		else if(codigo == 2){
			preco = quantidade * 4.50;
		}
		else if(codigo == 3) {
			preco = quantidade * 5.00;
		}
		
		else if(codigo == 4) {
			preco = quantidade * 2.00;
		}
		else {
			preco = quantidade * 1.50;
		}
		
		System.out.printf("Total %.2f", preco);
}
	}