package dev.entite;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "Commande")
@Table(name = "commande")
public class Commande {

    @Id
    private Integer id;
    @Transient
    private Chocolatine choco;
    private float prixUnitaire;
    private Integer quantite;
    @Transient
    private Livreur livreur;
    private LocalDateTime DateHeure;
    

    public Commande(Integer id, Chocolatine choco, float prixUnitaire, Integer quantite, Livreur livreur) {
        super();
        this.id = id;
        this.choco = choco;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
        this.livreur = livreur;
        this.DateHeure = LocalDateTime.now();
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Chocolatine getChoco() {
        return choco;
    }
    public void setChoco(Chocolatine choco) {
        this.choco = choco;
    }
    public float getPrixUnitaire() {
        return prixUnitaire;
    }
    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
    public Integer getQuantite() {
        return quantite;
    }
    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }
    public Livreur getLivreur() {
        return livreur;
    }
    public void setLivreur(Livreur livreur) {
        this.livreur = livreur;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Commande [id=");
        builder.append(id);
        builder.append(", choco=");
        builder.append(choco);
        builder.append(", prixUnitaire=");
        builder.append(prixUnitaire);
        builder.append(", quantite=");
        builder.append(quantite);
        builder.append(", livreur=");
        builder.append(livreur);
        builder.append("]");
        return builder.toString();
    }
    
    
}
