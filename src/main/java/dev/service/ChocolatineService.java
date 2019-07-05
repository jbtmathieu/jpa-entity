package dev.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import dev.entite.Chocolatine;
import dev.entite.Commande;
import dev.entite.Livreur;

public class ChocolatineService {
    public static EntityManagerFactory emf= Persistence.createEntityManagerFactory("glenshop");
	
	public List<Chocolatine> lister() {
	    
	    EntityManager em = emf.createEntityManager();
	    EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        
        TypedQuery<Chocolatine> query = em.createQuery("select c from Chocolatine c", Chocolatine.class);
        
        List<Chocolatine> liste = query.getResultList();
        
        
        tx.commit();
        em.close();
        
		return liste;
	}
	
	public void creerChocolatine(Chocolatine choco) {
	    EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        
        tx.begin();
     
        em.persist(choco);
        
        tx.commit();
        em.close();
        
	}
	
	public void creerLivreur(Livreur livreur) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        
        tx.begin();
     
        em.persist(livreur);
        
        tx.commit();
        em.close();
        
    }
	
	public void creerCommande(Commande commande) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        
        tx.begin();
     
        em.persist(commande);
        
        tx.commit();
        em.close();
        
    }


}
