import java.util.Scanner;

public class estruturaCondicional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		
		System.out.println("Informe a Hora: \n");
		hora = sc.nextInt();
		
		if(hora<12) {
			System.out.println("Bom dia!");
		}
		else if(hora < 18){
			System.out.println("Boa Tarde");
		}
		else {
			System.out.println("Boa Noite");
		}

		
	}

}
