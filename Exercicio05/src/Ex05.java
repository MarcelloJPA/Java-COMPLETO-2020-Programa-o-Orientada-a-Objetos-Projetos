import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	/*Fazer um programa para ler o c�digo de uma pe�a 1, 
	o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
	c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor
	unit�rio de cada pe�a 2. Calcule e mostre o valor a
	ser pago.*/
		Locale.setDefault(Locale.US);
		
		Scanner peca = new Scanner(System.in);
		
		int codigo1, numero1, codigo2, numero2;
		double valor1, valor2, resultado1, resultado2, valorTotal;
		
		System.out.println("C�DIGO PE�A 1: ");
		codigo1 = peca.nextInt();
		
		System.out.println("QUANTIDADE DE PE�AS 1: ");
		numero1 = peca.nextInt();
		
		System.out.println("VALOR UNITARIO: ");
		valor1 = peca.nextDouble();
		resultado1 = valor1 * numero1;
		
		System.out.println("C�DIGO PE�A 2: ");
		codigo2 = peca.nextInt();
		
		System.out.println("QUANTIDADE PE�A 2: ");
		numero2 = peca.nextInt();
		
		System.out.println("VALOR UNITARIO: ");
		valor2 = peca.nextDouble();
		
		resultado2 = valor2 * numero2;
		
		valorTotal = resultado1 + resultado2;
		
		System.out.printf("VALOR A PAGAR: %.2f ", valorTotal);
		

	}

}
