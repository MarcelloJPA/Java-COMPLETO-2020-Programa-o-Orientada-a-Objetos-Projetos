<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar Aluno</title>
</head>
<body>
		<c:url value="/UnicaEntradaServlet" var="linkServlet"/>
		<form action="${linkServlet }" method="POST">
			<label>Nome:<input type="text" name="nome"></label>
			<label>Endereço:<input type="text" name="endereco"></label>
			<label>Nip:<input type="text" name="nip"></label>
			<label>CPF:<input type="text" name="cpf"></label>
			<label>Email<input type="email" name="email"></label>
			<input type="hidden" name="acao" value="NovoAluno">
			<input type="submit" value="Enviar">
		</form>
	

</body>
</html>