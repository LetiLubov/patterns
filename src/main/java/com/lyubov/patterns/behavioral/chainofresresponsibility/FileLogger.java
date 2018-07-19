package com.lyubov.patterns.behavioral.chainofresresponsibility;

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




































