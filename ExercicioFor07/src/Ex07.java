import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		/* Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
		come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
		exemplo.*/
			
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print(i + " ");
			System.out.print(i*i+ " ");
			System.out.println(i*i*i+ " ");
		}
		
		sc.close();
	}

}
