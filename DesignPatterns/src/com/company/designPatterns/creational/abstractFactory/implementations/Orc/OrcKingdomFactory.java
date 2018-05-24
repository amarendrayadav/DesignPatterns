package com.company.designPatterns.creational.abstractFactory.implementations.Orc;

import com.company.designPatterns.creational.abstractFactory.interfaces.Army;
import com.company.designPatterns.creational.abstractFactory.interfaces.Castle;
import com.company.designPatterns.creational.abstractFactory.interfaces.King;
import com.company.designPatterns.creational.abstractFactory.interfaces.KingdomFactory;

/**
 * Created by amya0316 on 5/7/2018.
 */
public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
