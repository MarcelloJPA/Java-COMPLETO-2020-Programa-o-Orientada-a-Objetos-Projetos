package swing;

import java.awt.*; 	import javax.swing.*;		import java.awt.event.*;
public  class BarraRolagem extends JFrame
{	
	JScrollBar JSBHor = new JScrollBar (0,2,1,1,30);
	JScrollBar JSBVer = new JScrollBar (JScrollBar.VERTICAL,1,1,1,15);
	
	public BarraRolagem()
	{	
		super("Usando Barras de Rolagem");
		setSize(400,300);
		Container c=getContentPane();
		c.setBackground(new Color(255,255,10));
		c.setLayout(new BorderLayout());
		c.add("South", JSBHor);
		c.add("East", JSBVer);	
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String x[])
	{	
		new BarraRolagem();
	}
}
