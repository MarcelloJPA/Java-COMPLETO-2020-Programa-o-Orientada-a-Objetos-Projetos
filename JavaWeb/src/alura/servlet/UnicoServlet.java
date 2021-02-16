package alura.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import acao.ListaAlunos;
import acao.RemoveAluno;


@WebServlet("/UnicoServlet")
public class UnicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
				String paramAcao = request.getParameter("acao");
				System.out.print(paramAcao);
				System.out.print("Entrou");
				
				if(paramAcao.equals("ListaAlunos")) {
					ListaAlunos acao = new ListaAlunos();
					acao.executa(request, response);
				}
				else if(paramAcao.equals("RemoveAluno")) {
					System.out.print("EntrouRemove");
					RemoveAluno acao = new RemoveAluno();
					acao.executa(request, response);
					}
				else if(paramAcao.equals("MostrarEmpresa")) {
					System.out.print("Mostrando EMpresa");
				}
		
				
		
	}

}
