<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

<title>Clientes</title>
</head>
<body>

	<jsp:useBean id="cliente"
		class="br.com.distribuidora.repository.ClienteRepository" />

	<div align="center">
		<form action="cliente" method="POST">
			<br> <br>
			<input type="hidden" name="id" value="${clientes.id}">
			
			<div class="form-group" style="width: 400px; text-align: left;">

				<label> Nome:</label><input id="nome" name="nome" type="text"
					value="${clientes.nome}" class="form-control" />

			</div>

			<div class="form-group" style="width: 400px; text-align: left;">

				<label>Endereco:</label><input id="endereco" name="endereco"
					value="${clientes.endereco}" type="text" class="form-control" />

			</div>

			<div class="form-group" style="width: 400px; text-align: left;">

				<label>Email:</label><input id="email" name="email" type="text"
					value="${clientes.email}" class="form-control" />

			</div>

			<div class="form-group" style="width: 400px; text-align: left;">
				<label>Telefone:</label><input id="telefone" name="telefone"
					value="${clientes.telefone}" type="text" class="form-control" />
			</div>

			<input id="enviar" type="submit" value="Enviar" />
			<a href="lista" class="nounderline">
			<button type="button">Listar</button>
		</a>
		</form>

	</div>

	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>