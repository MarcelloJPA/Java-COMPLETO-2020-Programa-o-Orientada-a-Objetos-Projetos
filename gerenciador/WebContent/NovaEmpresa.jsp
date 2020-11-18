<%

String nomeEmpresa = (String)request.getAttribute("Nome");
System.out.print(nomeEmpresa);

 %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>

<h1>Empresa <%= nomeEmpresa %> Cadastrada com sucesso	</h1>



</body>
</html>