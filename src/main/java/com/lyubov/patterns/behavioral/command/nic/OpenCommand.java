package com.lyubov.patterns.behavioral.command.nic;

public class OpenCommand implements Command {
    OpenWithModifiers openWithModifiers;

    public OpenCommand(OpenWithModifiers openWithModifiers) {
        this.openWithModifiers = openWithModifiers;
    }

    @Override
    public void execute() {
        openWithModifiers.open();
    }
}
