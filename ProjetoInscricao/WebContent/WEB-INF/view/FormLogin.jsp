<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página de Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
	
	<c:url value="/UnicaEntradaServlet" var="LinkServlet"/>
	<form action="${LinkServlet }" method="post">
		<label>Login:
			<input type="text" name="login"/>
		</label>
		<label>Senha:
			<input type="password" name="senha"/>
		</label>
		<input type="submit" value="Entrar"/>
		<input type="hidden" name="acao" value="Login"/>
	</form>
</body>
</html>