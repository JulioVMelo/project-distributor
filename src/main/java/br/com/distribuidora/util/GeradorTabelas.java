package br.com.distribuidora.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class GeradorTabelas {

	public static void main(String[] args) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ACME");
//		factory.close();
		
		EntityManagerFactory facotry = Persistence.createEntityManagerFactory("distribuidora");
		EntityManager manager = facotry.createEntityManager();
		
		
	}
}
