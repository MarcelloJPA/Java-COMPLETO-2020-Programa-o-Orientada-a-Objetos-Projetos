/*Gerente herda da Classe Funcionario*/
public class Gerente extends Funcionario {

	private int senha = 2525;
	

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o Método do Gerente");
		return super.getSalario();
	}
	
}
