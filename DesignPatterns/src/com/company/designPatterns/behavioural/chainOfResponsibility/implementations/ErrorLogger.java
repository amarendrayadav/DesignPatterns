package com.company.designPatterns.behavioural.chainOfResponsibility.implementations;

import com.company.designPatterns.behavioural.chainOfResponsibility.interfaces.AbstractLogger;

/**
 * Created by amya0316 on 5/13/2018.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error::Logger: " + message);
    }
}
