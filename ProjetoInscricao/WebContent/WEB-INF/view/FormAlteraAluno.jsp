<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<c:url value="/UnicaEntradaServlet" var="linkServlet"/>
		<form action="${linkServlet }" method="POST">
			<label>Nome:
				<input type="text" name="nome" value="${aluno.nome }">
			</label>
			<label>Endereço:
				<input type="text" name="endereco" value="${aluno.endereco }">
			</label>
			<label>Nip:
				<input type="text" name="nip" value="${aluno.nip }">
			</label>
			<label>CPF:
				<input type="text" name="cpf" value="${aluno.cpf }">
			</label>
			<label>Email
				<input type="email" name="email" value="${aluno.email }">
			</label>
			<input type="hidden" name="id" value="${aluno.id }">
			<input type="hidden" name="acao" value="AlteraAluno">
			<input type="submit" value="Alterar">
		</form>
</body>


</body>
</html>