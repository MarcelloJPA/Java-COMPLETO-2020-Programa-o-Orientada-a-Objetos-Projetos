package exercicio;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CadastroEmpresa")
public class CadastroEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeEmpresa = request.getParameter("nome");
		
		Empresa empresa = new Empresa();
				empresa.setNome(nomeEmpresa);
				
		Banco banco = new Banco();
			  banco.adiciona(empresa);
			  
			  List<Empresa> lista = banco.getLista();
			   
			   RequestDispatcher rd = request.getRequestDispatcher("/EmpresasView.jsp");
			   
			   request.setAttribute("nome", empresa.getNome()); //Pendura o objeto no request
			   
			   rd.forward(request, response); //Envia para o JSP
			   
		
	}

}
