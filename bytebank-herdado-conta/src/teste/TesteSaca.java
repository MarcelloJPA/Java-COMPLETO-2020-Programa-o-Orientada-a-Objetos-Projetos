package teste;

import modelo.Conta;
import modelo.ContaCorrente;
import modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(864, 9170);
		conta.deposita(200.00);
		
		try {
		conta.saca(201.00);
		} 
		catch(SaldoInsuficienteException ex) {
			System.out.println("Saldo Insuficiente" + ex.getMessage());
		}
		System.out.println(conta.getSaldo());

	}

}
