package dev.ihm.options;

import dev.entite.Chocolatine;
import dev.ihm.util.IhmUtil;
import dev.service.util.TypeOfObject;
import dev.service.ChocolatineService;
import dev.service.util.ServiceUtil;

public class CreerChocolatineOption implements OptionMenu {
    
    private static ChocolatineService chocolatineService = ServiceUtil.chocolatineService;

	@Override
	public String getLibelle() {
		
		return "Créer Chocolatine";
	}
	public void executer() {
		execute();

	}

	public static Chocolatine execute() {
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
		return choco;
	}

}
