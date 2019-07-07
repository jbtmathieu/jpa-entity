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

    public Livreur rechercheLivreur(String name){
	    if (!("".equals(name))) {
            EntityManager em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();

            tx.begin();

            TypedQuery<Livreur> query = em.createQuery("select c from Livreur c where c.name=:nomRech", Livreur.class);
            query.setParameter("nomRech", name);
            Livreur livreur = query.getSingleResult();

            livreur.toString();

            tx.commit();
            em.close();
            if (livreur.equals("")){
                return null;
            }else return livreur;
        }
	    return null;
    }


    public boolean affecterCommandeLivreur(Integer id, Livreur livreur) {
	    if (livreur.equals(null)){
	        return false;
        }else {
            EntityManager em = emf.createEntityManager();
            EntityTransaction tx = em.getTransaction();


            Commande commande =em.find(Commande.class, id);
            if (!commande.equals(null)){
                em.close();
                return false;
            }else{
                commande.setLivreur(livreur);
                em.close();
                return true;
            }
        }
    }
}
