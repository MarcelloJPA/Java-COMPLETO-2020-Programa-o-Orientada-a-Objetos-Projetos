package swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TesteLogonUsuario extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JButton btnOk, btnCancelar;
	JTextField campoUsuario;
	JPasswordField campoSenha;
	public TesteLogonUsuario()
	{
		setTitle("Tela de Login de Usuario");
		setSize(300,100);
		GridLayout gl = new GridLayout(3,2,1,1);
		getContentPane().setLayout(gl);		
		
		JLabel labelUsuario = new JLabel();
		labelUsuario.setText("Usuario: ");
		add(labelUsuario);

		campoUsuario = new JTextField();
		add(campoUsuario);

		JLabel labelSenha = new JLabel();
		labelSenha.setText("Senha: ");
		add(labelSenha);

		campoSenha = new JPasswordField();
		campoSenha.setEchoChar('?');
		add(campoSenha);

		btnOk = new JButton("Ok");
		add(btnOk);
		btnOk.addActionListener(this);

		btnCancelar = new JButton("Cancelar");
		add(btnCancelar);
		btnCancelar.addActionListener(this);

		setLocationRelativeTo(null);
		setVisible(true);	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == btnOk){
			String usu = campoUsuario.getText();
			String senha = String.valueOf(campoSenha.getPassword());
			if (campoUsuario.getText().equals("Marcos") && senha.equals("123"))
			{
				JOptionPane.showMessageDialog(null, usu + ", "
						+ "você foi logado ao sistema.");
				System.exit(0);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Usuario ou senha inválidos. "
						+ "Tente novamente");
				campoSenha.setText("");
			}
		}
		if (e.getSource() == btnCancelar){
			JOptionPane.showMessageDialog(null, "Voce escolheu CANCELAR. ");
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		new TesteLogonUsuario();		
	}
}
