package dev.ihm.options;

import java.util.List;

import dev.entite.Chocolatine;
import dev.service.ChocolatineService;
import dev.service.util.ServiceUtil;

public class ListerChocolatinesOption implements OptionMenu {
	
	private static ChocolatineService chocolatineService = ServiceUtil.chocolatineService;

	@Override
	public String getLibelle() {
		return "Lister Chocolatine";
	}

	@Override
	public void executer() {
		
		execute();

	}

	public static List<Chocolatine> execute(){


		List<Chocolatine> liste = chocolatineService.lister();

		liste.forEach(System.out::println);
		return liste;
	}

}
