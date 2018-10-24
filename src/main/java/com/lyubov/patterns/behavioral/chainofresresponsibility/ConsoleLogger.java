package com.lyubov.patterns.behavioral.chainofresresponsibility;

/**
 * Реализация логгера выводящего информацию на консоль
 * @author Lyubov Ruzanova
 */
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
