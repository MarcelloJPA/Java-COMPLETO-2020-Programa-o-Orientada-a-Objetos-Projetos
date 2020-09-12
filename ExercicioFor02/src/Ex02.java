import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de vezes");
		int n = sc.nextInt();
		int qtd, in = 0, out = 0;
		
		
		for(int i=0; i<n; i++) {
			System.out.println("Informe os numeros");
			qtd = sc.nextInt();
			if(qtd >= 10 && qtd <= 20) {
				in = in+1;
			}
			else {
				out = out+1;
			}
			}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		
		sc.close();

	}

}
