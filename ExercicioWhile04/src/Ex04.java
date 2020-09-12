import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
		segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas vezes deseja dividir?");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Divisor");
			int x = sc.nextInt();
			System.out.println("Denominador");
			int y = sc.nextInt();
			
			if(y == 0) {
				System.out.println("Divisao Impossivel");
			}
			else {
				double div = (double) x/y;
				System.out.println(div);
			}
		}

	}

}
