package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Ace extends JFrame implements ActionListener{
	JLabel l1;
	JButton b1, b2;
	int i1, i2;
	public Ace(){
		setTitle("Teste Evento Acao");
		setSize(240,100); //tamanho da janela
		getContentPane().setLayout(null); // anula o layout padrao
		//cor de fundo da janela no padr�o RGB (Red Green Blue)
		getContentPane().setBackground(new Color(255,255,255));
		//provoca o termino da execu��o (encerra o programa)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		i1 = i2 = 0;
		b1 = new JButton("Gravar");
		b1.setBounds(10, 10, 100, 30);
		b1.addActionListener(this);
		b2 = new JButton("Sair");
		b2.setBounds(120, 10, 100, 30);
		b2.addActionListener(this);
		l1 = new JLabel("Pressione os bot�es");
		l1.setBounds(5, 50, 220, 20);
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(l1);
		setVisible(true);
	}
public void actionPerformed(ActionEvent e){
		if (e.getSource() == b1)
		l1.setText("Bot�o gravar pressionado " + ++i1 + " vez(es)");
		if (e.getSource() == b2)
		l1.setText("Bot�o sair pressionado " + ++i2 + " vez(es)");
	}
	public static void main(String [] args){
	  new TesteEventoAcao();
	 
  }
}
