package com.company.designPatterns.structural.facade;

import com.company.designPatterns.structural.facade.implementations.BothRestaurant;
import com.company.designPatterns.structural.facade.implementations.NonVegRestaurant;
import com.company.designPatterns.structural.facade.implementations.VegRestaurant;
import com.company.designPatterns.structural.facade.models.BothMenu;
import com.company.designPatterns.structural.facade.models.NonVegMenu;
import com.company.designPatterns.structural.facade.models.VegMenu;

/**
 * Created by amya0316 on 5/23/2018.
 */
public class HotelKeeperFacade {
    public VegMenu getVegMenu() {
        VegRestaurant v = new VegRestaurant();
        VegMenu vegMenu = (VegMenu) v.getMenus();
        return vegMenu;
    }

    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant v = new NonVegRestaurant();
        NonVegMenu NonvegMenu = (NonVegMenu) v.getMenus();
        return NonvegMenu;
    }

    public BothMenu getBothMenu() {
        BothRestaurant v = new BothRestaurant();
        BothMenu bothMenu = (BothMenu) v.getMenus();
        return bothMenu;
    }
}
