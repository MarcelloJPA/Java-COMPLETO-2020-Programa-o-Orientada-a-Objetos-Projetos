import javax.swing.JOptionPane;


public class OrdemInvertida {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		
		 String nomeInvertido = "";
		 
		 for(int i = nome.length()-1; i>-1; i--)
			 nomeInvertido += nome.charAt(i);
		 System.out.println(nome + " -  " + nomeInvertido);

	}

}
