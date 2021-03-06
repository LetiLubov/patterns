package com.lyubov.patterns.behavioral.chainofresresponsibility;

/**
 * Реализация логгера выводящего информацию в файл
 * @author Lyubov Ruzanova
 */
public class FileLogger extends Logger {
    public FileLogger(int priority) {
        super(priority);
    }

    @Override
    public void customMessage(String message) {
        System.out.println("FileLogger "
                + getPriority() + ",  message - " + message);
    }
}




































