
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		Funcionario g2 = new Gerente();
		g2.setNome("Carla");
		g2.setSalario(3500);
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Maria");
		ev.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(g2);
		
		System.out.println(controle.getSoma());
	}

}
