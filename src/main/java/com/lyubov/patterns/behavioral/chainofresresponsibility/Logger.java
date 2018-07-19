package com.lyubov.patterns.behavioral.chainofresresponsibility;

public abstract class Logger {
    private int priority;

    private Logger next;
    public Logger(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    public void writeMessage(String message, int level){
        if (level <= priority)
            customMessage(message);
        if (next != null) {
            next.writeMessage(message, level);
        }
    }

    public abstract void customMessage(String message);
}
