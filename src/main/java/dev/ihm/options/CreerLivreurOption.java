package dev.ihm.options;

import dev.service.ChocolatineService;
import dev.service.util.ServiceUtil;

public class CreerLivreurOption implements OptionMenu {

    private ChocolatineService chocolatineService = ServiceUtil.chocolatineService;
    @Override
    public String getLibelle() {
        // TODO Auto-generated method stub
        return "Créer livreur";
    }

    @Override
    public void executer() {
        // TODO Auto-generated method stub
        
    }

}
