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
		
		System.out.println("Voc� digitou " + x);
		System.out.println("o n�mero � " + y);
		System.out.println("O float �  " +  p);
		
		
		
		sc.close();

	}

}
