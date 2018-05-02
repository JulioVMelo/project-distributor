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

@WebServlet("/cliente")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Cliente cliente;
	private ClienteService clienteService;

	public ClienteController() {
		this.cliente = new Cliente();
		this.clienteService = new ClienteService();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String endereco = request.getParameter("endereco");
		String id = request.getParameter("id");
		
//		if(!id.isEmpty()) {
//			this.cliente.setId(Long.parseLong(id));
//		}
		this.cliente.setId(Long.parseLong(id));
		this.cliente.setNome(nome);
		this.cliente.setEmail(email);
		this.cliente.setTelefone(telefone);
		this.cliente.setEndereco(endereco);

		this.clienteService.salvar(cliente);

	}

}