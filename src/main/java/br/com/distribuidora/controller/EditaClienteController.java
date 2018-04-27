package br.com.distribuidora.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.distribuidora.model.Cliente;
import br.com.distribuidora.service.ClienteService;

@WebServlet("/editaCliente")
public class EditaClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Cliente cliente;
	private ClienteService clienteService;

	public EditaClienteController() {
		this.clienteService = new ClienteService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Long id = Long.parseLong(request.getParameter("id"));
		
		Cliente cliente = this.clienteService.consulta(id);
		
		RequestDispatcher disp = request.getRequestDispatcher("index.jsp");
		
		request.setAttribute("clientes", cliente);
		
		disp.forward(request, response);
		
		this.clienteService.editar(cliente);
	}

}
