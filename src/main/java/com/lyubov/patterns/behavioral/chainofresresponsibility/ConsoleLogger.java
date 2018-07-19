package com.lyubov.patterns.behavioral.chainofresresponsibility;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(int priority) {
        super(priority);
    }

    @Override
    public void customMessage(String message) {
        System.out.println("ConsoleLogger "
                + getPriority() + ",  message - " + message);
    }
}
