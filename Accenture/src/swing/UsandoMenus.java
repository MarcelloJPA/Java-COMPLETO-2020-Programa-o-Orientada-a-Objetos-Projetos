package swing;
/*O exemplo abaixo ilustra o uso de Menus*/
import java.awt.*;	
import java.awt.event.*;	
import javax.swing.*;

public class UsandoMenus extends JFrame implements ActionListener
{	
	JMenuBar BarraMenu = new JMenuBar();
	JMenu Arquivo = new JMenu ("Arquivo"); 	
	JMenu Editar = new JMenu ("Editar");
	JMenuItem Novo = new JMenuItem ("Novo"); 	
	JMenuItem Salvar = new JMenuItem ("Salvar");
	JMenuItem Sair = new JMenuItem ("Sair");
	JTextField T1 = new JTextField("Aqui teremos as respostas");

	UsandoMenus()
	{ 	
		setTitle("UsandoMenus");
		setSize(270,250);
		setLocation(50,50);
		setResizable(false);
		setJMenuBar(BarraMenu);
		BarraMenu.add(Arquivo);	
		BarraMenu.add(Editar);		
		Arquivo.add(Novo);	
		Arquivo.add(Salvar);	
		Arquivo.add(Sair);

		Novo.addActionListener(this);
		Salvar.addActionListener(this);
		Sair.addActionListener(this);
		getContentPane().add(T1);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);		
		setVisible(true);
	}

	public static void main (String args[])
	{	
		JFrame janela = new UsandoMenus();

	}

	public void actionPerformed(ActionEvent e)
	{ 
		if (e.getSource()==Novo)
			T1.setText("Escolhido o item de Menu Novo");
		if (e.getSource()==Salvar)
			T1.setText("Escolhido o item de Menu Salvar");      
		if (e.getSource()==Sair)
		{
			T1.setText("Escolhido o item de Menu Sair, a aplica��o ser� encerrada!!!");
			System.exit(0);      
		}
	} 		
}
