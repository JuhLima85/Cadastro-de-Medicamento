package br.com.juhlima.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

	// Iniciando o JPA manualmente:
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("CursoPU");// Fabrica de
																									// instancias
																									// EntityManager

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();

	}

}
