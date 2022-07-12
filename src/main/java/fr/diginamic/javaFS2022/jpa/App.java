package fr.diginamic.javaFS2022.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_local");
    	EntityManager em = emf.createEntityManager();
    	System.out.println("connection ok : " + em);
    	em.close();
    	emf.close();
    }
}
