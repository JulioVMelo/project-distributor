package br.com.distribuidora.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.distribuidora.model.Usuario;

@WebServlet("/loginUsuario")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Usuario usuario = new Usuario();
	Usuario
	
	public LoginController() {
		this.usuario = new Usuario();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		String loginUsuario = request.getParameter("login");
		String senhaUsuario = request.getParameter("senha");
		
		usuario.setLogin(loginUsuario);
		usuario.setSenha(senhaUsuario);
		
		
		
	}
}
