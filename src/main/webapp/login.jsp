<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="css/auxLogin.css" rel="stylesheet">


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>

	<div class="container">
        <div class="card card-container" >
           
            <form action="loginUsuario" method="post" class="form-signin">
                
                <input type="text" id="login" class="form-control" placeholder="Login">
                <input type="password" id="senha" class="form-control" placeholder="Senha">
                
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Entrar</button>
            </form>
</body>
</html>