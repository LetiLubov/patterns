package com.lyubov.patterns.behavioral.command.firstexample.commands;

import com.lyubov.patterns.behavioral.command.firstexample.editor.Editor;

/**
 * Конкретная команда
 */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
