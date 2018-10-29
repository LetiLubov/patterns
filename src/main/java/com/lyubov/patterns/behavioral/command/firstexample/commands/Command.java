package com.lyubov.patterns.behavioral.command.firstexample.commands;

import com.lyubov.patterns.behavioral.command.firstexample.editor.Editor;

/**
 * Команда описывает общий для всех конкретных команд интерфейс. Обычно здесь описан всего один метод для запуска команды.
 */
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
