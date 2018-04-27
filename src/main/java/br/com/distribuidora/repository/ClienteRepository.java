package br.com.distribuidora.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.distribuidora.model.Cliente;

public class ClienteRepository {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("distribuidora");
	// private EntityManager manager = factory.createEntityManager();

	// @PersistenceContext(name = "distribuidora")
	// private EntityManager manager;

	public void salvar(Cliente cliente) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
		manager.close();
	}

	public List<Cliente> listar() {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		List<Cliente> clientes = manager.createQuery("SELECT c FROM Cliente c").getResultList();
		manager.close();
		return clientes;
	}

	public void deletar(Long id) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Cliente cliente = manager.find(Cliente.class, id);
		manager.remove(cliente);
		manager.getTransaction().commit();
		manager.close();
	}

	public Cliente consulta(Long id) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Cliente cliente = manager.find(Cliente.class, id);
		manager.close();
		return cliente;
	}

	public void editar(Cliente cliente) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(cliente);
		manager.getTransaction().commit();
		manager.close();

	}
}
