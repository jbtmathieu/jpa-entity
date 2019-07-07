package dev.ihm.options;

import dev.entite.Livreur;
import dev.ihm.util.IhmUtil;
import dev.service.ChocolatineService;
import dev.service.util.ServiceUtil;

public class CreerLivreurOption implements OptionMenu {

    private static ChocolatineService chocolatineService = ServiceUtil.chocolatineService;

    @Override
    public String getLibelle() {
        return "Créer livreur";
    }

    @Override
    public void executer() {
        execute();
        
    }

    public static Livreur execute() {
        System.out.println("Veuillez rentrer un id :");
        String id= IhmUtil.scanner.next();

        System.out.println("Veuillez rentrer un nom :");
        String name= IhmUtil.scanner.next();

        System.out.println("Veuillez rentrer une adresse :");
        String address= IhmUtil.scanner.next();

        System.out.println("Veuillez rentrer un numéro de téléphone :");
        String telNumber= IhmUtil.scanner.next();

        Livreur livreur= new Livreur(Integer.parseUnsignedInt(id), name, address, telNumber);
        chocolatineService.creerLivreur(livreur);
        return livreur;

    }

}
