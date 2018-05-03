package br.com.distribuidora.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.distribuidora.model.Usuario;

public class UsuarioRepository {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("distribuidora");

	public boolean autenticar(Usuario usuario) {

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Query autentica = manager.createQuery("FROM Usuario u WHERE login = ?1 AND senha = ?2");
		autentica.setParameter(1, usuario.getLogin());
		autentica.setParameter(2, usuario.getSenha());

		autentica.setMaxResults(1);
		List<Usuario> list = autentica.getResultList();
		
		manager.getTransaction().commit();

		if(list.size()==1)
			return true;
		else
			return false;
		
		

	}

}