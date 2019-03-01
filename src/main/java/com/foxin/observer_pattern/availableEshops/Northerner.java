package com.foxin.observer_pattern.availableEshops;

import com.foxin.observer_pattern.tobaccoTypes.Tobacco;

import java.util.ArrayList;
import java.util.List;

public class Northerner implements Eshop {

    private List<Tobacco> availableTobacco = new ArrayList<Tobacco>();
    private Integer discount;
    private Integer packageDiscount;

    public void setDiscount(Integer discount){
        this.discount = discount;
    }
    public void setPackageDiscount(Integer packageDiscount){
        this.packageDiscount = packageDiscount;
    }
    public Integer getDiscount(){return discount;}
    public Integer getPackageDiscount(){return packageDiscount;}

    public void addTobacco(Tobacco tobacco){
        availableTobacco.add(tobacco);
    }

    public void removeTobacco(Tobacco tobacco){
        availableTobacco.remove(tobacco);
    }

    public void updateAvailableItems(){
        System.out.println("Selection of: " + this.getClass().getSimpleName() + "\n");
        for (Tobacco tobacco : availableTobacco){
            tobacco.updateEshopSelection(this);
            System.out.println(tobacco.getClass().getSimpleName() + " amount: " + tobacco.getAmount() + " price: " + tobacco.getPrice() + "\n");
        }
    }
}
