package acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Alunos;
import modelo.Banco;

public class ListaAlunos {
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Alunos> lista = banco.getLista();
		
		request.setAttribute("alunos", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("AlunosLista.jsp");
		
		rd.forward(request, response);
		
	}

}
