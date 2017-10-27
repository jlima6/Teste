/**
 * 
 */
package com.lima.Financeiro.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author jonathan.lima
 *
 */
public class JpaUtil {
	 
	private static EntityManagerFactory factory;
	static {
		
		//Create EntityManagerFactory
		factory = Persistence.createEntityManagerFactory("FinanceiroPU");
	}
	
	public static EntityManager getEntityManager() {
		
		//OpenConnection
		return factory.createEntityManager();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Inicio");
		EntityManager manager = JpaUtil.getEntityManager();
		manager.close();
		System.out.println("Fim");*/
	}

}
