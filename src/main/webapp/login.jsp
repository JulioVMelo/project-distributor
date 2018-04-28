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
           
            <form action="index.jsp" class="form-signin">
                
                <input type="text" id="usuario" class="form-control" placeholder="Usuário" required autofocus>
                <input type="password" id="senha" class="form-control" placeholder="Senha" required>
                    
                </div>
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Entrar</button>
            </form>
</body>
</html>