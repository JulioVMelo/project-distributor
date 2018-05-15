<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link href="css/auxLogin.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>

<body>

	<div class="container">
        <div class="card card-container" >
           
            <form action="loginUsuario" method="post" class="form-signin">
                <div class="form-group">
                <input type="text" name="login" id="login" class="form-control" placeholder="Login">
                <span class='msg-erro msg-login'></span>
				</div>
                <input type="password" name="senha" id="senha" class="form-control" placeholder="Senha">
                
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Entrar</button>
            </form>
      </div>
      	</div>      
        
</body>
</html>