package dev.ihm.options;

public interface OptionMenu {
	
	String getLibelle();
	
	void executer();
	
	default boolean isSortir() {
		return false;
	}
}
