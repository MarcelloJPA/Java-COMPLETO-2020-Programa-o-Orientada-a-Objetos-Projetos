package fluxo;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import acao.AlteraAluno;
import acao.ListaAlunos;
import acao.Login;
import acao.LoginForm;
import acao.MostraAluno;
import acao.NovoAluno;
import acao.NovoAlunoForm;
import acao.RemoveAluno;


@WebServlet("/UnicaEntradaServlet")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		
		String nome = null;
		
		if(paramAcao.equals("ListaAlunos")) {
			ListaAlunos acao = new ListaAlunos();
			nome = acao.executa(request, response);
			System.out.println(nome);
		}
		else if(paramAcao.equals("NovoAluno")) {
			NovoAluno acao = new NovoAluno();
			nome = acao.executa(request,response);
			System.out.println(nome);
		}	
		else if(paramAcao.equals("RemoveAluno")) {
			RemoveAluno acao = new RemoveAluno();
			nome = acao.executa(request,response);
			System.out.println(nome);
		}
		else if(paramAcao.equals("NovoAlunoForm")) {
			NovoAlunoForm acao = new NovoAlunoForm();
			nome = acao.executa(request, response);
			System.out.println(nome);
		}
		else if(paramAcao.equals("MostraAluno")) {
			MostraAluno acao = new MostraAluno();
			nome = acao.executa(request,response);
			System.out.println(nome);
		}
		else if(paramAcao.equals("AlteraAluno")) {
			AlteraAluno acao = new AlteraAluno();
			nome = acao.executa(request,response);
			System.out.println(nome);
		}
		else if(paramAcao.equals("LoginForm")) {
			LoginForm acao = new LoginForm();
			nome = acao.executa(request,response);
			System.out.println(nome);
		}
		else if(paramAcao.equals("Login")) {
			Login acao = new Login();
			nome = acao.executa(request,response);
			System.out.println(nome);
		}
		
		
		String[] tipoEEndereco = nome.split(":");
		if(tipoEEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereco[1]);
			rd.forward(request, response);
		}
		else {
			response.sendRedirect(tipoEEndereco[1]);
		}	 
	}

}
