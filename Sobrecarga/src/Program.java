import Entities.Product;

public class Program {

	public static void main(String[] args) {
		
		 //Esse Objeto se refere ao que tem 3 parametros 
		Product produto = new Product("verde", 2.99, true);
		
		Product carro = new Product("Vermelha", 2);
		
		System.out.println(produto.comTampa);
		
		System.out.println(carro.porta);
		
		
		
	}

	
	

}
