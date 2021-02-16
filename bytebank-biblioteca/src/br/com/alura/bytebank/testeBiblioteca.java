package br.com.alura.bytebank;

import modelo.Conta;
import modelo.ContaCorrente;

public class testeBiblioteca {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(123, 321);
		
		c.deposita(300);
		
		System.out.println("Saldo:" + c.getSaldo());
	}

}
