import java.util.Scanner;

class Ex01 {

	public static void main(String[] args) {
		/*Fazer um programa para ler um n�mero inteiro, 
		e depois dizer se este n�mero � negativo ou n�o*/
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("N�mero: \n");
		num = sc.nextInt();
		
		if(num > 0) {
			System.out.printf("%d � Positivo  \n", num);
		}
		else {
			System.out.printf("%d � Negativo \n", num);
		}
		sc.close();
	}

}
