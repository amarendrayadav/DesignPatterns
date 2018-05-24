package com.company.designPatterns.creational.abstractFactory.implementations.Elf;

import com.company.designPatterns.creational.abstractFactory.interfaces.King;

/**
 * Created by amya0316 on 5/7/2018.
 */
public class ElfKing implements King {
    static final String KING = "This is Elf King";

    @Override
    public String getKing() {
        return KING;
    }
}
