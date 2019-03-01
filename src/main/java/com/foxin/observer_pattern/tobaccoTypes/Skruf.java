package com.foxin.observer_pattern.tobaccoTypes;

import com.foxin.observer_pattern.availableEshops.Eshop;

import java.util.ArrayList;
import java.util.List;

public class Skruf implements Tobacco {

    private Integer amount;
    private Integer price;

    public Skruf(Integer amount, Integer price) {
        this.price = price;
        this.amount = amount;
    }

    public void updateEshopSelection(Eshop eshop){
        if (amount >= 10) {
            this.price = this.price - ((this.price/100)*eshop.getDiscount()) - ((this.price/100)*eshop.getPackageDiscount());
        }
        else{
            this.price = this.price - ((this.price/100)*eshop.getDiscount());
        }
    }

    public Integer getAmount(){return amount;}
    public Integer getPrice(){return price;}
}
