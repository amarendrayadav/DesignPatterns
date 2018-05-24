package com.company.designPatterns.behavioural.strategyOrPolicy.implementations;

import com.company.designPatterns.behavioural.strategyOrPolicy.interfaces.DragonSlayerStrategy;

/**
 * Created by amya0316 on 5/13/2018.
 */
public class ProjectileStrategy implements DragonSlayerStrategy {
    @Override
    public void execute() {
        System.out.println("Projectile Strategy is used for execution");
    }
}
