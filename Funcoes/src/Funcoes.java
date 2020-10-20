import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c); //Pegou os tres valores e casou na função
		
		showResult(higher);
		
		sc.close();
		
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if(x>y && x>z) {
			aux = x;
		}
		else if(y>z) {
		aux = y;
	}
		else {
			aux = z;
		}
		return aux; //Retorna o Resultado para higher

}
	public static void showResult(int value) {
		System.out.println(value);
	}
}