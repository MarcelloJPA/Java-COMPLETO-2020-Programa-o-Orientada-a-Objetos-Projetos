import java.util.Locale;
import java.util.Scanner;

import Entities.Triangle;

public class SemOrientacaoObjeto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y; //Aponto duas variaveis do Tipo Triangle
		
		x = new Triangle(); //Informo que são dois objetos
		y = new Triangle();
		
		
		
		System.out.println("Informe os Lados do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Informe os Lados do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area(); //Calculo do triangulo//
		double areaY = y.area();
		
		
		System.out.printf("Triangulo X %.4f \n", areaX);
		System.out.printf("Triangulo Y %.4f \n", areaY);
		
		
		if(areaX > areaY) {
			System.out.println("Area X é maior");
		}
		else {
			System.out.println("Area Y é maior");
		}
		
		sc.close();
	}

}
