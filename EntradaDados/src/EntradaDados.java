import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); /*Definir ponto flutuante com . */ 
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double p;
		
		
		x = sc.next(); /* Receber texto*/
		y = sc.nextInt(); /*Ler Inteiro */
		p = sc.nextDouble(); /*Ler ponto FLutante */
		
		System.out.println("Você digitou " + x);
		System.out.println("o número é " + y);
		System.out.println("O float é  " +  p);
		
		
		
		sc.close();

	}

}
