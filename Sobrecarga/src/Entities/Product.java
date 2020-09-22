package Entities;
/* 
Sobrecarga
	� um recurso que uma classe possui de oferecer mais de uma 
	opera��o com o memso nome, por�m  com diferentes listas de parametros
*/

public class Product {

	public String cor;
	public double preco;
	public boolean comTampa;
	public String porta;
	public int volante;
	
	//Construtor Caneta
	public Product(String cor, double preco, boolean comTampa){
		
		this.cor = cor;
		this.preco = preco;
		this.comTampa = comTampa;
		
		}
	
	//Sobrecarga de Caneta(Mesmo construtor com diferente parametro)
	public Product(String porta, int volante){
	
		this.porta = porta;
		this.volante = volante;
		}
	
	

}
