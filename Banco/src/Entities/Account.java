package Entities;

public class Account {
	
	private int numberAccount;
	private String holder;
	private double balance;
	
	//Construtor, caso nao queria depositar nada de inicio
	public Account(int numberAccount, String holder) {
		this.numberAccount = numberAccount;
		this.holder = holder;
		}
	//Construtor, caso queria um deposito inicial
	public Account(int numberAccount, String holder, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	//Getter (Somente get, num da conta inalteravel)
	public int getnumberAccount() {
		return numberAccount;
	}
	
	//Getter (Retornar titular da conta)
	public String getHolder() {
		return holder;
	}
	
	//Setter (Alterar titlar da conta)
	public void setHolder(String holder) {
		this.holder = holder;
		
	}
	//Getter (Retornar Saldo da Conta)
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance = balance + amount;
		
	}
	
	public void withdraw(double amount) {
		this.balance = (balance - amount) - 5.00;
	}
	
	public String toString() {
		return "Nome "
				+ holder 
				+ ", "
				+" Numero da Conta: "
				+ numberAccount
				+ ", "
				+ " Saldo da Conta: "
				+ balance;
	}

	
}
