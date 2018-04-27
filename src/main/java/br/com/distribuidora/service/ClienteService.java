package br.com.distribuidora.service;

import java.util.List;

import br.com.distribuidora.model.Cliente;
import br.com.distribuidora.repository.ClienteRepository;

public class ClienteService {

	private ClienteRepository clienteRepository;

	public ClienteService() {
		this.clienteRepository = new ClienteRepository();
	}

	public void salvar(Cliente cliente) {
		this.clienteRepository.salvar(cliente);
	}

	public void deletar(Long id) {
		this.clienteRepository.deletar(id);
	}

	public List<Cliente> listar() {
		return this.clienteRepository.listar();
	}
	
	public void editar(Cliente cliente) {
		this.clienteRepository.editar(cliente);
	}
	public Cliente consulta(Long id) {
		return this.clienteRepository.consulta(id);
	}

}
