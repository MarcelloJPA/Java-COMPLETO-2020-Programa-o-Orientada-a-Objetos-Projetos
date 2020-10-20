import java.util.Locale;
import java.util.Scanner;
import Entities.Rentangulo;

public class ExercicioObjeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//Da classe Rentagulo crie um objeto com as caracteristicas da classe
		Rentangulo retangulo = new Rentangulo();
		
		System.out.println("Enter Rectangle width and height: ");
		
		System.out.println("Width: ");
		retangulo.width = sc.nextDouble();
		System.out.println("Height: ");
		retangulo.height = sc.nextDouble();
		
		System.out.println(retangulo.toString());
		
		sc.close();
	}

	

}
