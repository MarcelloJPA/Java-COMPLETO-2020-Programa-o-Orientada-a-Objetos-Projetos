package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class Ex1 {
	/* Jframe � um componente de janela */

	public static void main(String[] args) {
		String titulo = JOptionPane.showInputDialog("Informe um t�tulo para a janela");
		int altura = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite a altura da tela"));
		int largura = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite a largura da tela"));
		int r = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Informe de 0 a 255 pra red"));
		int g = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Informe de 0 a 255 pra green"));
		int b = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Informe de 0 a 255 pra blue"));
		
		/*JFrame � uma Classe com componentes de janela*/
		JFrame janela = new JFrame();
		janela.setTitle(titulo);
		janela.setSize(altura, largura);
		janela.getContentPane().setBackground(new Color(r, g, b));
		janela.getContentPane().setLayout(null);
		janela.setVisible(true);
		
		
		//provoca o termino da execu��o (encerra o programa)
		  janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*Obt�m a resolu��o do Windows*/
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		/*Para centralizar a janela*/
		janela.setLocation((screen.width - janela.WIDTH)/2, 
			     (screen.height - janela.HEIGHT)/2);
	}
	

}
