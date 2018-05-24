package com.company.designPatterns.creational.abstractFactory.implementations.Orc;

import com.company.designPatterns.creational.abstractFactory.interfaces.Castle;

/**
 * Created by amya0316 on 5/7/2018.
 */
public class OrcCastle implements Castle {
    static final String CASTLE = "This is Orc Castle!";

    @Override
    public String getCastle() {
        return CASTLE;
    }
}
