package br.com.distribuidora.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.distribuidora.model.Usuario;
import br.com.distribuidora.service.UsuarioService;

@WebServlet("/loginUsuario")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	private UsuarioService usuarioService = new UsuarioService();

	public LoginController() {
		this.usuarioService = new UsuarioService();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String loginUsuario = request.getParameter("login");
		String senhaUsuario = request.getParameter("senha");
		
		Usuario usuario = new Usuario();
		usuario.setLogin(loginUsuario);
		usuario.setSenha(senhaUsuario);

		if (this.usuarioService.autenticar(usuario)){
			HttpSession sessao = request.getSession();
			sessao.setAttribute("login", usuario.getLogin());
			sessao.setMaxInactiveInterval(30*60);

			Cookie cookie = new Cookie("login", usuario.getLogin());
			cookie.setMaxAge(30*60);
			response.addCookie(cookie);
			
			RequestDispatcher disp = request.getRequestDispatcher("index.jsp");
			disp.forward(request, response);
		}
		else {
			RequestDispatcher disp = request.getRequestDispatcher("login.jsp");
			PrintWriter out = response.getWriter();
			out.println("<font color='red'>Usuário ou senha inválido</font>");
			disp.include(request, response);
		}
	}
}
