import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	/*Fazer um programa para ler o código de uma peça 1, 
	o número de peças 1, o valor unitário de cada peça 1, o
	código de uma peça 2, o número de peças 2 e o valor
	unitário de cada peça 2. Calcule e mostre o valor a
	ser pago.*/
		Locale.setDefault(Locale.US);
		
		Scanner peca = new Scanner(System.in);
		
		int codigo1, numero1, codigo2, numero2;
		double valor1, valor2, resultado1, resultado2, valorTotal;
		
		System.out.println("CÓDIGO PEÇA 1: ");
		codigo1 = peca.nextInt();
		
		System.out.println("QUANTIDADE DE PEÇAS 1: ");
		numero1 = peca.nextInt();
		
		System.out.println("VALOR UNITARIO: ");
		valor1 = peca.nextDouble();
		resultado1 = valor1 * numero1;
		
		System.out.println("CÓDIGO PEÇA 2: ");
		codigo2 = peca.nextInt();
		
		System.out.println("QUANTIDADE PEÇA 2: ");
		numero2 = peca.nextInt();
		
		System.out.println("VALOR UNITARIO: ");
		valor2 = peca.nextDouble();
		
		resultado2 = valor2 * numero2;
		
		valorTotal = resultado1 + resultado2;
		
		System.out.printf("VALOR A PAGAR: %.2f ", valorTotal);
		

	}

}
