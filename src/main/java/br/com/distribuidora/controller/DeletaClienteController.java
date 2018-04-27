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

@WebServlet("/deletaCliente")
public class DeletaClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Cliente cliente;
	private ClienteService clienteService;

	public DeletaClienteController() {
		this.clienteService = new ClienteService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		transforma de string long
		Long id = Long.parseLong(request.getParameter("id"));
		
		this.clienteService.deletar(id);
		List<Cliente> clientes = this.clienteService.listar();

		RequestDispatcher disp = request.getRequestDispatcher("lista.jsp");
		request.setAttribute("clientes", clientes);
		disp.forward(request, response);  
	}

}
