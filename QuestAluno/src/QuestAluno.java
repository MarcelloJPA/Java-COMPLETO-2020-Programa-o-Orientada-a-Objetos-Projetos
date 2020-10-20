import java.util.Locale;
import java.util.Scanner;
import Entities.NotaAluno;

public class QuestAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		NotaAluno notas = new NotaAluno();
		
		System.out.println("Nome: ");
		notas.nome = sc.nextLine();
		System.out.println("Primeira Nota: ");
		notas.primeiroTri = sc.nextDouble();
		System.out.println("Segunda Nota: ");
		notas.segundoTri = sc.nextDouble();
		System.out.println("Terceira Nota: ");
		notas.terceiroTri = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f\n", notas.finalAno());
		
		if(notas.finalAno()<60.00) {
			System.out.println("Falhou");
			System.out.printf("Falta %.2f", notas.pontosFaltam());
		}
		else {
			System.out.println("Aprovado");
		}
		
		sc.close();

	}

}
