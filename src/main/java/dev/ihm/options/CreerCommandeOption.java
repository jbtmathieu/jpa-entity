package dev.ihm.options;

import dev.entite.Chocolatine;
import dev.entite.Commande;
import dev.entite.Livreur;
import dev.ihm.util.IhmUtil;
import dev.service.ChocolatineService;
import dev.service.util.ServiceUtil;

public class CreerCommandeOption implements OptionMenu {
    
    private ChocolatineService chocolatineService = ServiceUtil.chocolatineService;
    
    @Override
    public String getLibelle() {
        // TODO Auto-generated method stub
        return "Créer commande";
    }

    @Override
    public void executer() {
        System.out.println("Veuillez rentrer un id :");
        String id= IhmUtil.scanner.next();
        
        System.out.println("Veuillez rentrer un nom :");
        String name= IhmUtil.scanner.next();
        
        System.out.println("Veuillez rentrer une addresse:");
        String address= IhmUtil.scanner.next();
        
        System.out.println("Veuillez rentrer un numero de telephone:");
        String telephone= IhmUtil.scanner.next();
                
        
        Commande choco = new Commande(Integer.parseUnsignedInt(id), name, address, telephone);
        chocolatineService.creerCommande(choco);
        
    }

}
