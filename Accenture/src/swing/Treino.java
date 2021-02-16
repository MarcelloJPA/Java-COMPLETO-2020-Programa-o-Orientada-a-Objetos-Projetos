package swing;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Treino extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	static JTextField inputUsuario;
	static JPasswordField inputSenha;
	JButton btnOk, btnCancelar;
	
	
	/*Construtor Padrão*/
	public Treino() {
		//title
		setTitle("Programinha de teste"); 
		//tamanho da tela
		setSize(300,150);
		//anula o layout padrão
		getContentPane().setLayout(null);
		//Background da janela
		getContentPane().setBackground(new Color(99,98,32));
		
		// 3Linhas 2Colunas 1px espaçamento
		GridLayout g1 = new GridLayout(3,2,1,1);
		getContentPane().setLayout(g1);
		
		/*texto usuario*/
		JLabel labelUsuario = new JLabel();
		labelUsuario.setText("Usuario:");
		add(labelUsuario);
		
		/*Campo Usuario*/
		inputUsuario = new JTextField();
		add(inputUsuario);
		
		/*Texto Senha*/
		JLabel labelSenha = new JLabel();
		labelSenha.setText("Senha:");
		add(labelSenha);
		
		/*Campo senha*/
		inputSenha = new JPasswordField();
		add(inputSenha);
		
		/*Botao Logar*/
		btnOk = new JButton("Ok");
		add(btnOk);
		btnOk.addActionListener(this);
		
		/*Botao Cancelar*/
		btnCancelar = new JButton("Sair");
		add(btnCancelar);
		btnCancelar.addActionListener(this);
		
		/*Centralizar Programa*/
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);	
	}
	
	/*Validação Com a classe Action Listener*/
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnOk) {
			String usuario = inputUsuario.getText();
			String senha = String.valueOf(inputSenha.getPassword()); /*Converte para String*/
				if(usuario.equals("Marcello") && senha.equals("123456")) {
					JOptionPane.showMessageDialog(null, "Bem vindo Sr" + usuario );
				}
				else {
					JOptionPane.showMessageDialog(null,"Senha Incorreta, Tente Novamente");
					inputUsuario.setText("");
					inputSenha.setText("");
				}
			}
		if(e.getSource() == btnCancelar) {
			JOptionPane.showMessageDialog(null,"Você escolheu CANCELAR");
			System.exit(0);
		}
	}
	public static void main(String [] args) {
		new Treino();
		
	}

	
	

}
