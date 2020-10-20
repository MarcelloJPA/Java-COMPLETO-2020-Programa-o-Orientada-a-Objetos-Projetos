package Entities;

public class Account {

	private int numConta;
	private String titularConta;
	private double saldoConta;
	
	//2 Construtores:
	
	//1 - Caso nao queria fazer o deposito inicial
	public Account(int numConta, String titularConta) {
		this.numConta = numConta;
		this.titularConta = titularConta;
	}
	//2 - Caso queira fazer um deposito inicial
	public Account(int numConta, String titularConta, double depositoInicial) {
		this.numConta = numConta;
		this.titularConta = titularConta;
		deposito(depositoInicial);
	}
	
	//
	public int getnumConta() {
		return numConta;
		}
	
	public String gettitularConta() {
		return titularConta;
	}
	
	public void settitularConta(String titularConta) {
		this.titularConta = titularConta;
	}
	
	public double getsaldoConta() {
		return saldoConta;
	}
	
	//void porque não há retorno, somente alteração do saldoConta
	public void deposito(double montante) {
		saldoConta = saldoConta + montante;
	}
	
	public void saque(double montante) {
		saldoConta = saldoConta - montante + 5.0;
	}
	
	public String toString() {
		return "Conta "
				+ numConta
				+ ", Titular: "
				+ titularConta
				+ ", Saldo: $"
				+ String.format("%.2f", saldoConta);
	}
	
	
}
