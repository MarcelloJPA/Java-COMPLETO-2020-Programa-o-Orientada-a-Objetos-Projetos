package cotacaoDolar;

import java.util.Locale;
import java.util.Scanner;

import Entities.logicaCotacao;

public class cotacaoDOlar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o preço do Dolar?");
		double cotacaoDolar = sc.nextDouble();
		
		System.out.println("Quantos Dolars deseja?");
		double comprarDolar = sc.nextDouble();
		
		double valor = logicaCotacao.cotacaoDolar(cotacaoDolar, comprarDolar);
		System.out.println(valor);
		sc.close();

	}

}
