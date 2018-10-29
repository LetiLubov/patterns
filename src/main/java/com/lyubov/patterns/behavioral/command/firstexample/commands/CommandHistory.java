package com.lyubov.patterns.behavioral.command.firstexample.commands;

import java.util.Stack;

/**
 * Конкретная команда
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
