package dev.ihm.options;

import dev.service.util.TypeOfObject;

public interface OptionMenu {
	
	String getLibelle();
	
	void executer();
	
	default boolean isSortir() {
		return false;
	}
}
