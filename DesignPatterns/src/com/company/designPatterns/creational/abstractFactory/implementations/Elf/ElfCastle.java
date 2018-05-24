package com.company.designPatterns.creational.abstractFactory.implementations.Elf;

import com.company.designPatterns.creational.abstractFactory.interfaces.Castle;

/**
 * Created by amya0316 on 5/7/2018.
 */
public class ElfCastle implements Castle {
    static final String CASTLE = "This is Elf Castle!";

    @Override
    public String getCastle() {
        return CASTLE;
    }
}
