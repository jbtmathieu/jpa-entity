package dev.ihm.options;

import java.util.List;

import dev.entite.Chocolatine;
import dev.service.ChocolatineService;
import dev.service.util.ServiceUtil;

public class ListerChocolatinesOption implements OptionMenu {
	
	private ChocolatineService chocolatineService = ServiceUtil.chocolatineService;

	@Override
	public String getLibelle() {
		return "Lister Chocolatine";
	}

	@Override
	public void executer() {
		System.out.println("je liste");
		
		List<Chocolatine> lister = chocolatineService.lister();
		
		lister.forEach(System.out::println);
		
		
	}

}
