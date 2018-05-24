package com.company.designPatterns.behavioural.strategyOrPolicy;

import com.company.designPatterns.behavioural.strategyOrPolicy.implementations.MeleeStrategy;
import com.company.designPatterns.behavioural.strategyOrPolicy.implementations.ProjectileStrategy;
import com.company.designPatterns.behavioural.strategyOrPolicy.implementations.SpellStrategy;
import com.company.designPatterns.behavioural.strategyOrPolicy.interfaces.DragonSlayerStrategy;

/**
 * Created by amya0316 on 5/13/2018.
 */
public class TestStrategyPattern {

    public void testStrategyPattern() {
        DragonSlayerStrategy dragonSlayerStrategy = new MeleeStrategy();
        DragonSlayer dragonSlayer = new DragonSlayer(dragonSlayerStrategy);
        dragonSlayer.goToBattle();
        dragonSlayerStrategy.execute();
        // Change of strategy
        dragonSlayerStrategy = new ProjectileStrategy();
        dragonSlayer.changeStrategy(dragonSlayerStrategy);
        dragonSlayer.goToBattle();
        dragonSlayerStrategy.execute();
        // Change of strategy
        dragonSlayerStrategy = new SpellStrategy();
        dragonSlayer.changeStrategy(dragonSlayerStrategy);
        dragonSlayer.goToBattle();
        dragonSlayerStrategy.execute();

    }
}
