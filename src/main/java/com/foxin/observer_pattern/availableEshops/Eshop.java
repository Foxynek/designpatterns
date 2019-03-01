package com.foxin.observer_pattern.availableEshops;

import com.foxin.observer_pattern.tobaccoTypes.Tobacco;

public interface Eshop {

    void setDiscount(Integer discount);
    void setPackageDiscount(Integer packageDiscount);
    Integer getDiscount();
    Integer getPackageDiscount();

    void addTobacco(Tobacco tobacco);
    void removeTobacco(Tobacco tobacco);
    void updateAvailableItems();
}
