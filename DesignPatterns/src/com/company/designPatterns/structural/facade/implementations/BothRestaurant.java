package com.company.designPatterns.structural.facade.implementations;

import com.company.designPatterns.structural.facade.interfaces.Hotel;
import com.company.designPatterns.structural.facade.models.BothMenu;
import com.company.designPatterns.structural.facade.models.Menus;

/**
 * Created by amya0316 on 5/23/2018.
 */
public class BothRestaurant implements Hotel {
    @Override
    public Menus getMenus() {
        return new BothMenu();
    }
}