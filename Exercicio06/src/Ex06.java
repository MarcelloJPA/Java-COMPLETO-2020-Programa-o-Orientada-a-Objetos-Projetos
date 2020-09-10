import java.util.Scanner;
import java.util.Locale;
public class Ex06 {

	public static void main(String[] args) {
		/*Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: 
		 * A, B e C. Em seguida, calcule e
		mostre:
		a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
		b) a �rea do c�rculo de raio C. (pi = 3.14159)
		c) a �rea do trap�zio que tem A e B por bases e C por altura.
		d) a �rea do quadrado que tem lado B.
		e) a �rea do ret�ngulo que tem lados A e B
*/		Locale.setDefault(Locale.US);
		Scanner valor = new Scanner(System.in);
		double A, B, C, triangulo, circulo, quadrado,retangulo, trapezio;
		
		A = valor.nextDouble();
		B = valor.nextDouble();
		C = valor.nextDouble();
		
		triangulo = ( A * C) / 2.0;
		circulo = 3.14159 * Math.pow(C, 2);
		trapezio = (A + B) / 2 * C;
		quadrado = Math.pow(B, 2);
		retangulo = A * B; 
		System.out.printf("TRI�NGULO :%.3f \n", triangulo);
		System.out.printf("C�RCULO : %.3f \n",circulo);
		System.out.printf("TRAP�ZIO: %.3f \n", trapezio);
		System.out.printf("QUADRADO: %.3f \n",quadrado);
		System.out.printf("RET�NGULO: %.3f \n",retangulo);

		valor.close();
	}

}
