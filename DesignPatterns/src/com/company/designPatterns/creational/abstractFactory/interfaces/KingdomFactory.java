package com.company.designPatterns.creational.abstractFactory.interfaces;

/**
 * Created by amya0316 on 5/7/2018.
 */
public interface KingdomFactory {
    Castle createCastle();

    King createKing();

    Army createArmy();
}
