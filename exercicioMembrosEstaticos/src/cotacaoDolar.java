import java.util.Locale;
import java.util.Scanner;

import Entities.currencyConverter;

public class cotacaoDolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre radius");
		double radius = sc.nextDouble();
		
		
		double c = currencyConverter.circumference(radius);
		double v = currencyConverter.volume(radius);
		
		
		System.out.printf("Circumference %.2f\n", c );
		System.out.printf("Volume %.2f\n", v );
		System.out.printf("PI %.2f", currencyConverter.PI );

		
		
		sc.close();
		

	}

}
