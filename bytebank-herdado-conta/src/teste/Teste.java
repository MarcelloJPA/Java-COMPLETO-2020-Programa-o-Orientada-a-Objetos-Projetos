package teste;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("x");
		System.out.println(23);
		System.out.println(false);
		
		
		
		ContaCorrente cc = new ContaCorrente(22,33);
		ContaPoupanca cp = new ContaPoupanca(32,55);
		
		System.out.println(cc);
		System.out.println(cp);
		
		println(cc);
		

	}
	
	
	/*Sobrecarga - Vários Métodos com o mesmo nome, Variando os parâmetros*/
	static void println() {
		
	}
	
	static void println(int a) {
		
	}
	
	static void println(boolean valor) {
		
	}
	
	static void println(ContaCorrente cc) {
		
	}

}
