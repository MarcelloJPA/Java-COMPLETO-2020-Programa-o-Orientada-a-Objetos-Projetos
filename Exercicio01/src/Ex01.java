import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*Faça um programa para ler dois valores inteiros, 
		 e depois mostrar na tela a soma desses números com uma
			mensagem explicativa, conforme exemplos. */
			
			Scanner num = new Scanner(System.in);
			
			int num1, num2, soma;
			
			System.out.println("Informe o primeiro Numero");
			num1 = num.nextInt();
			System.out.println("Informe o segundo numero");
			num2 = num.nextInt();
			soma = num1+num2;
			System.out.printf("O resultado de %d + %d é %d",num1,num2, soma);
			
			num.close();
	}

}
