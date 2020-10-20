import java.util.Locale;

public class SaidaDados {

	public static void main(String[] args) {
		double x = 10.3575894;
				System.out.printf("%.2f\n", x); 
				/*printf(formatado) "%.2f" duas casas decimais \n pula linha*/
				
				
				Locale.setDefault(Locale.US);/*Formatos estados unidos */
				System.out.printf("%.2f\n", x); /*Imprime agora com ponto e nao virgula*/
				
				/*CONCATENANDO */
				System.out.print("Resultado = " + x + " Metros\n" );
				
				System.out.printf("Resultado = " + "%.2f" + " Metros\n", x);
				
				String nome = "Maria";
				int idade = 51;
				double renda = 3000.50;
				
				
				/*%f -> Flutuante
				  %d -> Inteiro
				  %s -> Texto
				  %n -> Quebra de Linha
				*/
				
				System.out.printf("%s tem %d anos e ganha %.2f R$", nome,idade,renda);
				
	}

}
