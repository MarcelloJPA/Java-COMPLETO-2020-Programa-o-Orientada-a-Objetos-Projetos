import java.util.Locale;
import java.util.Scanner;




public class VectorEx02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantidade de NOMES e PREÇOS");
		int n = sc.nextInt();
		
		double[] vect = new double[n];


		sc.close();
	}

}
