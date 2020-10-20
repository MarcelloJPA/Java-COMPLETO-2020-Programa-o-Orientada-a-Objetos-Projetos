package Entities;

public class logicaCotacao {
	
	public static double cotacaoDolar(double cotacaoDolar, double comprarDolar) {
		double reais = cotacaoDolar * comprarDolar;
		return (reais * 6 / 100) + reais;
				
	}	

}
