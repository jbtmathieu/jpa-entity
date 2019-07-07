package dev.ihm.options;

import dev.entite.Chocolatine;
import dev.entite.Commande;
import dev.entite.Livreur;
import dev.ihm.util.IhmUtil;
import dev.service.ChocolatineService;
import dev.service.util.ServiceUtil;

public class CreerCommandeOption implements OptionMenu {
    
    private static ChocolatineService chocolatineService = ServiceUtil.chocolatineService;
    
    @Override
    public String getLibelle() {
        return "Créer commande";
    }

    @Override
    public void executer() {
        execute();
        
    }

    public static Commande execute(){
        System.out.println("Veuillez rentrer un id :");
        String id= IhmUtil.scanner.next();

        Chocolatine choco= CreerChocolatineOption.execute();

        System.out.println("Veuillez rentrer un prix unitaire :");
        String prixUnitaire= IhmUtil.scanner.next();

        System.out.println("Veuillez rentrer un quantité :");
        String quantite= IhmUtil.scanner.next();

        Livreur livreur = CreerLivreurOption.execute();

        Commande commande = new Commande(Integer.parseUnsignedInt(id), choco, Float.parseFloat(prixUnitaire), Integer.parseUnsignedInt(quantite), livreur);
        chocolatineService.creerCommande(commande);
        return commande;
    }
}
