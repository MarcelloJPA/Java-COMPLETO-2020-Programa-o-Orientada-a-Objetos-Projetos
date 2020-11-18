package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ListaEmpresa")
public class ListaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		Banco banco = new Banco();
		
		List<Empresa> lista = banco.getLista();
		
		request.setAttribute("empresas", lista); //Pendurando a lista na requisi��o
		
		RequestDispatcher rd = request.getRequestDispatcher("/EmpresaLista.jsp");
		
		rd.forward(request, response);
		
	}

}