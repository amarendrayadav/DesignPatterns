package com.company.designPatterns.behavioural.chainOfResponsibility;

import com.company.designPatterns.behavioural.chainOfResponsibility.implementations.ConsoleLogger;
import com.company.designPatterns.behavioural.chainOfResponsibility.implementations.ErrorLogger;
import com.company.designPatterns.behavioural.chainOfResponsibility.implementations.FileLogger;
import com.company.designPatterns.behavioural.chainOfResponsibility.interfaces.AbstractLogger;

/**
 * Created by amya0316 on 5/13/2018.
 */
public class TestChainOfRespPattern {

    private AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public void testChainOfResponsibility() {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
