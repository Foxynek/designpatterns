package com.foxin.observer_pattern.tobaccoTypes;

import com.foxin.observer_pattern.availableEshops.Eshop;

public interface Tobacco {

    Integer getAmount();
    Integer getPrice();
    void updateEshopSelection(Eshop eshop);

}
