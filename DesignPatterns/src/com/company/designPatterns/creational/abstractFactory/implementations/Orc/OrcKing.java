package com.company.designPatterns.creational.abstractFactory.implementations.Orc;

import com.company.designPatterns.creational.abstractFactory.interfaces.King;

/**
 * Created by amya0316 on 5/7/2018.
 */
public class OrcKing implements King {
    static final String KING = "This is Orc King";

    @Override
    public String getKing() {
        return KING;
    }
}
