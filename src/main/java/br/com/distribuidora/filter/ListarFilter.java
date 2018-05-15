package br.com.distribuidora.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

@WebFilter(filterName = "/ListarFilter", urlPatterns = { "/lista" })
public class ListarFilter implements Filter {

	private static final String llogin = "isaias";

	public ListarFilter() {
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("iniciando o filtro");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest requisicao = (HttpServletRequest) request;

		HttpSession sessao = requisicao.getSession();
		String loginSessao = sessao.getAttribute("login").toString();
		

		if (loginSessao.equals(llogin)) {
			RequestDispatcher disp = requisicao.getRequestDispatcher("/lista");
			disp.forward(request, response);
			chain.doFilter(request, response);
		} else {
			JOptionPane.showMessageDialog(null, "Voce não tem permissõo, " +loginSessao);
			RequestDispatcher disp = requisicao.getRequestDispatcher("/login.jsp");
			disp.forward(request, response);
		}
	}

	public void destroy() {
	}

}
