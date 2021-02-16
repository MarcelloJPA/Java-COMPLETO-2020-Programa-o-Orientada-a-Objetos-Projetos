package swing;

import java.awt.*;
import javax.swing.*;

class TesteJframe extends JFrame{
	public TesteJframe(){
		//Titulo da janela
		setTitle("Primeira Janela Swing");
		//tamanho da janela
		setSize(275,100);
		// anula o layout padrao
		getContentPane().setLayout(null);
	//cor de fundo da janela no padr�o RGB (Red Green Blue)
		getContentPane().setBackground(new Color(255,255,255));
		//provoca o termino da execu��o (encerra o programa)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String [] args){
	 TesteJframe janela = new TesteJframe();
	 janela.setVisible(true);
	 
  }
	
	
	public void centralizar(){
		//obt�m a altura e largura da resolu��o v�deo
		Dimension screen = 
          Toolkit.getDefaultToolkit().getScreenSize();
		
		//obt�m a altura e largura da minha janela
		Dimension janela = getSize();
		
		if (janela.height > screen.height)
			setSize(janela.width, screen.height);
		if (janela.width > screen.width)
			setSize(screen.width, janela.height);
		
		setLocation((screen.width - janela.width)/2, 
			     (screen.height - janela.height)/2);
		
	}
	
	

} 