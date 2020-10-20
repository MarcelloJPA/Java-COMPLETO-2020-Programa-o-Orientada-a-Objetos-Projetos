import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro e dizer
		se este número é par ou ímpar*/

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Verifique se o numero é Par ou Impar: \n");
		num = sc.nextInt();
		
		if(num % 2  == 0) {
			System.out.printf("%d é Par \n", num);
		}
		else {
			System.out.printf("%d é Impar \n", num);
		}
		sc.close();
		
	}

}
