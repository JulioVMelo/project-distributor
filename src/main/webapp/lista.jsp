<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

</head>
<body>
	<jsp:useBean id="cliente"
		class="br.com.distribuidora.repository.ClienteRepository" />

	<form action="lista" method="get">

		<table class="table" style="width: 50%">
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Endereço</th>
				<th>Email</th>
				<th>Telefone</th>
				<th>Editar / Excluir</th>
			</tr>

			<c:forEach var="cliente" items="${clientes}">
				<tr>
					<td>${cliente.id}</td>
					<td>${cliente.nome}</td>
					<td>${cliente.endereco}</td>
					<td>${cliente.email}</td>
					<td>${cliente.telefone}</td>
					<td><a href="editaCliente?id=${cliente.id}">Editar</a> | <a
						href="deletaCliente?id=${cliente.id}">Excluir</a></td>

				</tr>
			</c:forEach>
		</table>
	</form>

	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>