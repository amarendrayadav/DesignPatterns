package com.company.designPatterns.creational.abstractFactory;

import com.company.designPatterns.creational.KingdomType;
import com.company.designPatterns.creational.abstractFactory.implementations.Elf.ElfKingdomFactory;
import com.company.designPatterns.creational.abstractFactory.implementations.Orc.OrcKingdomFactory;
import com.company.designPatterns.creational.abstractFactory.interfaces.Army;
import com.company.designPatterns.creational.abstractFactory.interfaces.Castle;
import com.company.designPatterns.creational.abstractFactory.interfaces.King;
import com.company.designPatterns.creational.abstractFactory.interfaces.KingdomFactory;

import static com.company.designPatterns.creational.abstractFactory.TestAbstractFactoryPattern.FactoryMaker.makeFactory;

/**
 * Created by amya0316 on 5/7/2018.
 */
public class TestAbstractFactoryPattern {
    public void createKingdom(KingdomType type) {
        KingdomFactory factory = makeFactory(type);
        Castle castle = factory.createCastle();
        System.out.println(castle.getCastle());
        King king = factory.createKing();
        System.out.println(king.getKing());
        Army army = factory.createArmy();
        System.out.println(army.getArmy());
    }

    static class FactoryMaker {
        public static KingdomFactory makeFactory(KingdomType type) {
            switch (type) {
                case ELF:
                    return new ElfKingdomFactory();
                case ORC:
                    return new OrcKingdomFactory();
                default:
                    throw new IllegalArgumentException("KingdomType not supported.");
            }
        }
    }
}

