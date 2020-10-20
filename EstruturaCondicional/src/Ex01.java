import java.util.Scanner;

class Ex01 {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro, 
		e depois dizer se este número é negativo ou não*/
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Número: \n");
		num = sc.nextInt();
		
		if(num > 0) {
			System.out.printf("%d é Positivo  \n", num);
		}
		else {
			System.out.printf("%d é Negativo \n", num);
		}
		sc.close();
	}

}
