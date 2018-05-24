package com.company.designPatterns.creational.abstractFactory.implementations.Elf;

import com.company.designPatterns.creational.abstractFactory.interfaces.Army;

/**
 * Created by amya0316 on 5/7/2018.
 */
public class ElfArmy implements Army {
    static final String ARMY = "this is elf Army!";

    @Override
    public String getArmy() {
        return ARMY;
    }
}
