package com.lyubov.patterns.behavioral.command.nic;


public class Main {
    public static void main(String[] args) {
        Command command = new OpenCommand(new OpenWithModifiers());
        command.execute();

    }

    private void executeCommand(Command command) {
        command.execute();
    }
}
