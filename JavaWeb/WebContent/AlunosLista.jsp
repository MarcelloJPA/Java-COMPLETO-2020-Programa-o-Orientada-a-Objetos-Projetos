<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Alunos</title>
</head>
<body>

	<%@ page import="java.util.List, modelo.Alunos" %>
	  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
	    
	    <ul>
	    
			    <c:forEach items="${alunos }" var="aluno">
			    	<li>${aluno.nome}<a href="UnicoServlet?acao=RemoveAluno?id=${aluno.id }">Remove</a></li>		
			   	</c:forEach>		
			    
			    
			  
	  
		</ul>

</body>
</html>