package dev;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import dev.entite.Chocolatine;

public class App {

	public static void main(String[] args) {
		
		// je veux faire du JPA !!!
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
		
		EntityManager em = emf.createEntityManager();
		
		//Chocolatine choco1 = new Chocolatine(1, "glen", 37.5f, 2.0f);
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		//em.persist(choco1);
		
		//TypedQuery<Chocolatine> query = em.createQuery("select c from chocolatine c", Chocolatine.class);
		String nomRecherche = "gsslen";
		
		TypedQuery<Chocolatine> query = em.createQuery("select c from Chocolatine c where c.nom=:nomRech", Chocolatine.class);
		query.setParameter("nomRech", nomRecherche);
		
		List<Chocolatine> liste = query.getResultList();
		
		liste.forEach(System.out::println);
		
		tx.commit();
		
		em.close();
		
		emf.close();

	}

}
