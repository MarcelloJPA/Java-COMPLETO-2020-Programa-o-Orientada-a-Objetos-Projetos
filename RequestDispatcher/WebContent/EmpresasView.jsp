<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ page import="java.util.List, exercicio.Empresa"%>
    
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Empresas</title>
</head>
<body>

	<ul>
		<% List<Empresa> lista = (List<Empresa>)request.getAttribute("nome"); %>
		<% 
		for(Empresa empresa : lista){
			
			System.out.println(empresa);
		}
		%>
		
			
	
		
		 
	</ul>

</body>
</html>