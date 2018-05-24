package com.company.designPatterns.behavioural.strategyOrPolicy;

import com.company.designPatterns.behavioural.strategyOrPolicy.interfaces.DragonSlayerStrategy;

/**
 * Created by amya0316 on 5/13/2018.
 */
public class DragonSlayer {
    private DragonSlayerStrategy dragonSlayerStrategy;

    public DragonSlayer(DragonSlayerStrategy dragonSlayerStrategy) {
        this.dragonSlayerStrategy = dragonSlayerStrategy;
    }

    public void changeStrategy(DragonSlayerStrategy dragonSlayerStrategy) {
        System.out.println("old strategy is " + this.dragonSlayerStrategy);
        this.dragonSlayerStrategy = dragonSlayerStrategy;
        System.out.println("new strategy is " + dragonSlayerStrategy);
    }

    public void goToBattle() {
        System.out.println("Dragon Slayer with strategy " + this.dragonSlayerStrategy);
    }
}
