import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*Fazer um programa que leia o n�mero de um funcion�rio,
		 *  seu n�mero de horas trabalhadas, o valor que recebe
		 *   porhora e calcula o sal�rio desse funcion�rio. 
		 *   A seguir, mostre o n�mero e o sal�rio do funcion�rio,
		 *    com duas casas
				decimais.*/
		Locale.setDefault(Locale.US);
		Scanner funcionario = new Scanner(System.in);
		
		int num, horasTrab;
		double valorHora, salFunc;
		
		System.out.println("N�mero do Funcionario");
		num = funcionario.nextInt();
		System.out.println("Horas Trabalhadas");
		horasTrab = funcionario.nextInt();
		System.out.println("Valor da Hora");
		valorHora = funcionario.nextDouble();
		
		salFunc = horasTrab * valorHora;
		System.out.println("NUMBER");
		System.out.println(num);
		System.out.println("SALARY");
		System.out.printf("U$ %.2f", salFunc);
		
		
		funcionario.close();
	}

}
