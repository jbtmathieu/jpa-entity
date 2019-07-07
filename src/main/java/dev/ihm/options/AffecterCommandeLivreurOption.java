package dev.ihm.options;

import dev.ihm.util.IhmUtil;
import dev.service.ChocolatineService;
import dev.service.util.ServiceUtil;

public class AffecterCommandeLivreurOption implements OptionMenu {

    private ChocolatineService chocolatineService = ServiceUtil.chocolatineService;
    
    @Override
    public String getLibelle() {
        return "AffecterCommande Livreur";
    }

    @Override
    public void executer() {
        System.out.println("Veuillez rentrer un nom livreur:");
        String name= IhmUtil.scanner.next();

            System.out.println("Veuillez rentrer l'identifiant de la commande:");
            String id= IhmUtil.scanner.next();
           if (chocolatineService.affecterCommandeLivreur(Integer.parseUnsignedInt(id), chocolatineService.rechercheLivreur(name))){
            System.out.println("Affectation faite.");
        }else{
               System.out.println("Erreur");
           }

    }

}
