package com.company.designPatterns.creational.factoryMethod;

/**
 * Created by amya0316 on 5/7/2018.
 */
public class OrcBlacksmith implements Blacksmith {
    @Override
    public String manufactureWeapon(String weaponType) {
        return "OrcWeapon " + weaponType;
    }
}
