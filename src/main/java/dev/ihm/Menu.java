package dev.ihm;

import java.util.HashMap;
import java.util.Map;

import dev.ihm.options.AffecterCommandeLivreurOption;
import dev.ihm.options.CreerChocolatineOption;
import dev.ihm.options.CreerCommandeOption;
import dev.ihm.options.CreerLivreurOption;
import dev.ihm.options.ListerChocolatinesOption;
import dev.ihm.options.OptionMenu;
import dev.ihm.options.Sortir;
import dev.ihm.util.IhmUtil;
import dev.service.ChocolatineService;

import java.util.Scanner;

public class Menu {

	private Map<Integer, OptionMenu> options = new HashMap<>();

	private Scanner scanner = IhmUtil.scanner;

	public Menu() {
		init();
	}

	private void init() {
		options.put(1, new ListerChocolatinesOption());
		options.put(2, new CreerChocolatineOption());
		options.put(3, new CreerCommandeOption());
		options.put(4, new CreerLivreurOption());
		options.put(5, new AffecterCommandeLivreurOption());
		options.put(99, new Sortir());
	}

	public void demarrer() {

		boolean sortir = false;

		while (!sortir) {

			afficherMenu();

			int saisie = this.scanner.nextInt();

			OptionMenu optionChoisie = options.get(saisie);

			optionChoisie.executer();

			sortir = optionChoisie.isSortir();
			
			

		}
		ChocolatineService.emf.close();

	}

	private void afficherMenu() {
		options.forEach((numero, option) -> {

			System.out.println(numero + ". " + option.getLibelle());

		});
	}

}
