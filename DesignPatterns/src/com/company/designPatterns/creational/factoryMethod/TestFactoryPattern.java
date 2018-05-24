package com.company.designPatterns.creational.factoryMethod;

/**
 * Created by amya0316 on 5/7/2018.
 */
public class TestFactoryPattern {

    public void test() {
        Blacksmith blacksmith = new ElfBlacksmith();
        System.out.println(blacksmith.manufactureWeapon("SPEAR"));
        System.out.println(blacksmith.manufactureWeapon("AXE"));

        blacksmith = new OrcBlacksmith();
        System.out.println(blacksmith.manufactureWeapon("SWORD"));
        System.out.println(blacksmith.manufactureWeapon("ARCHER"));
    }
}
