package com.company.designPatterns.creational.abstractFactory.implementations.Elf;

import com.company.designPatterns.creational.abstractFactory.interfaces.Army;
import com.company.designPatterns.creational.abstractFactory.interfaces.Castle;
import com.company.designPatterns.creational.abstractFactory.interfaces.King;
import com.company.designPatterns.creational.abstractFactory.interfaces.KingdomFactory;

/**
 * Created by amya0316 on 5/7/2018.
 */
public class ElfKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
