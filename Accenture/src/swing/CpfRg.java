package swing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CpfRg {

	public static void main(String[] args) {
		
		/*Janela*/
		JFrame janela = new JFrame();
		janela.setTitle("ATUALIZA DADOS CADASTRAIS");
		janela.setSize(960,720);
		janela.getContentPane().setBackground(new Color(200,32,68));
		janela.setVisible(true);

		/*Label*/
		JLabel jl = new JLabel();
		jl.setText("CPF: ");
		jl.setLocation(10,10);
		jl.setSize(370,50);
		
		JLabel jl1 = new JLabel();
		jl1.setText("RG: ");
		jl1.setLocation(10,10);
		jl1.setSize(370,50);
		
		
		
	}	
		
	
	

}
