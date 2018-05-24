package com.company.designPatterns.structural.facade;

import com.company.designPatterns.structural.facade.models.BothMenu;
import com.company.designPatterns.structural.facade.models.NonVegMenu;
import com.company.designPatterns.structural.facade.models.VegMenu;

/**
 * Created by amya0316 on 5/23/2018.
 */
public class TestFacade {
    public void testFacade(){
        HotelKeeperFacade keeper = new HotelKeeperFacade();

        VegMenu v = keeper.getVegMenu();
        System.out.println(v.getMenu());
        NonVegMenu nv = keeper.getNonVegMenu();
        System.out.println(nv.getMenu());
        BothMenu bothMenu= keeper.getBothMenu();
        System.out.println(bothMenu.getMenu());
    }
}
