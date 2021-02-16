
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("222.222.222-87");
		nico.setSalario(3525.98);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
