package dados;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AtualizaDados extends JFrame implements ActionListener {

	static JTextField inputCpf, inputRg, inputNome, inputLogradouro, inputEndereco, inputComplemento, inputBairro,
			inputCidade, inputCep, inputEstado;
	static JButton btnOK, btnCancelar;

	/* Construtor Padrão */
	public AtualizaDados() {
		setTitle("ATUALIZA DADOS CADASTRAIS");
		setSize(800, 400);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(99, 98, 32));

		GridLayout g1 = new GridLayout(10, 4, 2, 2);
		getContentPane().setLayout(g1);

		JLabel labelCpf = new JLabel("CPF: ");
		add(labelCpf);
		
		JTextField inputCpf = new JTextField();
		inputCpf.setSize(2,2);
		add(inputCpf);
		
		
		
		
		
		
		
		
		
		
		
		setVisible(true);

	}

	public static void main(String args[]) {
		new AtualizaDados();

	}

}