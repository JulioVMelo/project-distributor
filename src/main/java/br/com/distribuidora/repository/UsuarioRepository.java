package br.com.distribuidora.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.distribuidora.model.Cliente;

public class UsuarioRepository {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("distribuidora");
	
	
	public void autenticar(Cliente cliente) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
	}
}
