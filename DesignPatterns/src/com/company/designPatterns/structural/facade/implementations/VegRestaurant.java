package com.company.designPatterns.structural.facade.implementations;

import com.company.designPatterns.structural.facade.interfaces.Hotel;
import com.company.designPatterns.structural.facade.models.Menus;
import com.company.designPatterns.structural.facade.models.VegMenu;

/**
 * Created by amya0316 on 5/23/2018.
 */
public class VegRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        return new VegMenu();
    }
}
