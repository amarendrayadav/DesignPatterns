package com.company.designPatterns.creational.abstractFactory.implementations.Orc;

import com.company.designPatterns.creational.abstractFactory.interfaces.Army;

/**
 * Created by amya0316 on 5/7/2018.
 */
public class OrcArmy implements Army {
    static final String ARMY = "this is Orc Army!";

    @Override
    public String getArmy() {
        return ARMY;
    }
}
