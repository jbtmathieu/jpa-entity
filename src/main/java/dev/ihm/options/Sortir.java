package dev.ihm.options;

public class Sortir implements OptionMenu{

	@Override
	public String getLibelle() {
		
		return "Sortir";
	}

	@Override
	public void executer() {
		System.out.println("Aurevoir");
		
	}

	@Override
	public boolean isSortir() {
		return true;
	}
	
	

}
