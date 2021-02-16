package gui;

import javax.swing.JOptionPane;

public class ExercicioTela {
	
	int largura, altura, r, g, b;
	String titulo;
	
	public ExercicioTela()
	{
		largura = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura"));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a Altura"));
		r = Integer.parseInt(JOptionPane.showInputDialog("Digite para red"));
		g = Integer.parseInt(JOptionPane.showInputDialog("Digite para green"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite para blue"));
		titulo = JOptionPane.showInputDialog("Informe um titulo");

		

	}
	
	public static void main(String[] args) {
		
		
		
		

	}

}
