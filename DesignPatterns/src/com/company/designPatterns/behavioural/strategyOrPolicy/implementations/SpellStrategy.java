package com.company.designPatterns.behavioural.strategyOrPolicy.implementations;

import com.company.designPatterns.behavioural.strategyOrPolicy.interfaces.DragonSlayerStrategy;

/**
 * Created by amya0316 on 5/13/2018.
 */
public class SpellStrategy implements DragonSlayerStrategy {
    @Override
    public void execute() {
        System.out.println("Spell Strategy is used for execution");
    }
}
