package com.company;

import com.company.designPatterns.behavioural.chainOfResponsibility.TestChainOfRespPattern;
import com.company.designPatterns.behavioural.strategyOrPolicy.TestStrategyPattern;
import com.company.designPatterns.creational.abstractFactory.TestAbstractFactoryPattern;
import com.company.designPatterns.creational.builder.WithImmutableClass.TestBuilderPattern;
import com.company.designPatterns.creational.factoryMethod.TestFactoryPattern;
import com.company.designPatterns.structural.facade.TestFacade;

import static com.company.designPatterns.creational.KingdomType.ELF;
import static com.company.designPatterns.creational.KingdomType.ORC;

public class Main {

    public static void main(String[] args) {

        // ================= CREATIONAL_PATTERNS ===================
        // Factory Pattern
        TestFactoryPattern testFactoryPattern = new TestFactoryPattern();
        testFactoryPattern.test();
        System.out.println("====================================================");
        // ================= Abstract Factory Pattern =======================
        TestAbstractFactoryPattern testAbstractFactoryPattern = new TestAbstractFactoryPattern();
        testAbstractFactoryPattern.createKingdom(ELF);
        testAbstractFactoryPattern.createKingdom(ORC);
        System.out.println("====================================================");

        // ================= Builder Pattern =====================
        TestBuilderPattern testBuilderPattern = new TestBuilderPattern();
        testBuilderPattern.testBuilder();
        System.out.println("====================================================");

        // ================= Strategy Pattern =====================
        TestStrategyPattern testStrategyPattern = new TestStrategyPattern();
        testStrategyPattern.testStrategyPattern();
        System.out.println("====================================================");

        // ================= Chain of Responsibility ====================
        TestChainOfRespPattern testChainOfRespPattern = new TestChainOfRespPattern();
        testChainOfRespPattern.testChainOfResponsibility();
        System.out.println("====================================================");

        // ================= Facade =====================
        TestFacade testFacade = new TestFacade();
        testFacade.testFacade();
        System.out.println("====================================================");
        Float ff = 5.5f;
        int a = Integer.valueOf("011",8);
        System.out.println(a);
        System.out.println(ff.floatValue());

    }
}
