import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*Fazer um programa para ler um n�mero inteiro e dizer
		se este n�mero � par ou �mpar*/

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Verifique se o numero � Par ou Impar: \n");
		num = sc.nextInt();
		
		if(num % 2  == 0) {
			System.out.printf("%d � Par \n", num);
		}
		else {
			System.out.printf("%d � Impar \n", num);
		}
		sc.close();
		
	}

}
