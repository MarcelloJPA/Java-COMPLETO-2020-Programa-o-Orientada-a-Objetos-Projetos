import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner raio = new Scanner(System.in);
		
			
		double pi, area, x ;
		System.out.println("Informe o valor do Raio\n");
		 x = raio.nextFloat();
		 pi = 3.14159;
		 
		 area = pi * Math.pow(x, 2);
		 
		 System.out.printf("%.4f \n", area);
		 
		 
		
		
		
		
		
		
		raio.close();
	}

}
