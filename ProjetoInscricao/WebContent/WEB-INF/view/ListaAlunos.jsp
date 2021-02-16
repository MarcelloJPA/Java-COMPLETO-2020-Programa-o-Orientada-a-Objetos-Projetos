<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Alunos</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body class="container">

	<table class="table table-dark">
    <thead class="thead-dark">
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Nome</th>
      <th scope="col">Endere�o</th>
      <th scope="col">Nip</th>
      <th scope="col">CPF</th>
      <th scope="col">Email</th>
      <th scope="col">Editar</th>
      <th scope="col">Remover</th>
      
    </tr>
  </thead>
  <tbody>
    
      <c:forEach items="${alunos }" var="i">
      		<tr>
      			<th scoope="row">${i.id }</th>
	      			<td>${i.nome }</td>
	      			<td>${i.endereco }</td>
	      			<td>${i.nip }</td>
	      			<td>${i.cpf }</td>
	      			<td>${i.email }</td>
	      			<td><a href="UnicaEntradaServlet?acao=MostraAluno&id=${i.id }"><img src="img/edit.png" width="40px" height="40px"/></a></td>
	      			<td><a href="UnicaEntradaServlet?acao=RemoveAluno&id=${i.id }"><img src="img/excluir.png" width="40px" height="40px"></a></td>
	      	</tr>
	      		
      </c:forEach>
    	
      
  </tbody>
</table>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>

</body>
</html>