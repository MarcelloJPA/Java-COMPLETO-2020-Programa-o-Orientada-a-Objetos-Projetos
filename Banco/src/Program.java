import java.util.Locale;
import java.util.Scanner;
import Entities.Account;

 
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter account number");
		int numberAccount  = sc.nextInt();
		
		System.out.println("Enter account holder");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Is there na initial deposit? (y/n)");
		char response  = sc.next().charAt(0);
		if(response == 'y') {
			System.out.println("Digite o deposito inicial: ");
			double deposito = sc.nextDouble();
			account = new Account(numberAccount, holder, deposito);
		}
		else {
			account = new Account(numberAccount, holder);
		}
		
		System.out.println(account);
		
		System.out.println("Entre com um valor para deposito: ");
		double depositoValue = sc.nextDouble();
		account.deposit(depositoValue);
		
		System.out.println(account);
		
		System.out.println("Retire um valor da conta: ");
		double retirarValue = sc.nextDouble();
		
		account.withdraw(retirarValue);
		System.out.println(account);
		
		
		sc.close();
	}
	
}
