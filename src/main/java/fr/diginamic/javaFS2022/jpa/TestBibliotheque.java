package fr.diginamic.javaFS2022.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestBibliotheque {

	private static final String SELECT_EMPRUNT_TO_LIVRE_QUERY = "SELECT e.DATE_DEBUT, e.DATE_FIN, e.DELAI, l.TITRE, l.AUTEUR "
			+ "FROM EMPRUNT e, COMPO c, LIVRE l "
			+ "WHERE e.ID = 1 "
			+ "AND e.ID = c.ID_EMP "
			+ "AND c.ID_LIV = l.ID";
	
	private static final String SELECT_CLIENT_TO_EMPRUNT_QUERY = "SELECT * "
			+ "FROM CLIENT c, EMPRUNT e "
			+ "WHERE c.ID = 1 "
			+ "AND c.ID = e.ID_CLIENT";
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_local");
    	EntityManager em = emf.createEntityManager();
    	System.out.println("connection ok : " + em);
    	
    	em.getTransaction().begin();
    	
    	
    	
    	em.getTransaction().commit();
    	
    	em.close();
    	emf.close();

	}

}
