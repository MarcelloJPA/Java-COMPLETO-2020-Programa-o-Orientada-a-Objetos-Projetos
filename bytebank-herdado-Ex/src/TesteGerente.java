
public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Carlos Silva");
		gerente.setCpf("123456789-88");
		gerente.setSalario(5000);
		
		
		System.out.println(gerente.getNome() + " " + gerente.getCpf() + " " + gerente.getSalario());
		
		boolean autentica = gerente.autentica(2525);
		System.out.println(autentica);
		
		System.out.println(gerente.getBonificacao());

		
		
	}

}
