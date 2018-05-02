package br.com.distribuidora.service;

import br.com.distribuidora.model.Usuario;
import br.com.distribuidora.repository.UsuarioRepository;

public class UsuarioService {

	UsuarioRepository usuarioRepository = new UsuarioRepository();
	Usuario usuario = new Usuario();
	
	public UsuarioService() {
		this.usuarioRepository = new UsuarioRepository();
	}
	
	public boolean autenticar(Usuario usuario) {
		return this.usuarioRepository.autenticar(usuario);
	}
	
}
