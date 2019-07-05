package dev.ihm.options;

import javax.rmi.CORBA.Util;

import dev.entite.Chocolatine;
import dev.ihm.util.IhmUtil;
import dev.service.ChocolatineService;
import dev.service.util.ServiceUtil;

public class CreerChocolatineOption implements OptionMenu {
    
    private ChocolatineService chocolatineService = ServiceUtil.chocolatineService;

	@Override
	public String getLibelle() {
		
		return "Créer Chocolatine";
	}

	@Override
	public void executer() {
	    System.out.println("Veuillez rentrer un id :");
        String id= IhmUtil.scanner.next();
        
		System.out.println("Veuillez rentrer un nom :");
		String name= IhmUtil.scanner.next();
		
		System.out.println("Veuillez rentrer un poids :");
        String poids= IhmUtil.scanner.next();
        
        System.out.println("Veuillez rentrer une temperature :");
        String temperature= IhmUtil.scanner.next();
        		
        
        Chocolatine choco = new Chocolatine(Integer.parseUnsignedInt(id), name, Float.valueOf(temperature), Float.valueOf(poids));
        chocolatineService.creerChocolatine(choco);
	}

}
