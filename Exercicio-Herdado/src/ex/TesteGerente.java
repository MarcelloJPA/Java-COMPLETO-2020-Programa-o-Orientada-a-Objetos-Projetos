package ex;

public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcello lima");
		g1.setCpf("13592473786");
		g1.setSalario(3800);
		g1.setSenha(3232);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());

		boolean autentica = g1.autentica(3232);
		
	}

}
