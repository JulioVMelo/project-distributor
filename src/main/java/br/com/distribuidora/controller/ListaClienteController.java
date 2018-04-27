package br.com.distribuidora.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.distribuidora.model.Cliente;
import br.com.distribuidora.service.ClienteService;

@WebServlet("/lista")
public class ListaClienteController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	private Cliente cliente;
	private ClienteService clienteService;

	public ListaClienteController() {
		this.clienteService = new ClienteService();
		this.cliente = new Cliente();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher disp = request.getRequestDispatcher("lista.jsp");
		List<Cliente> clientes = this.clienteService.listar();
		
		request.setAttribute("clientes", clientes);
		
		disp.forward(request, response);
		
	}

}
