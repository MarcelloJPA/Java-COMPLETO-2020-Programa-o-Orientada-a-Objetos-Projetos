package acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Banco;

public class RemoveAluno {

	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		
		banco.removeAluno(id);
		
		response.sendRedirect("AlunosLista.jsp");
		
		
		
		
		
	}
}
