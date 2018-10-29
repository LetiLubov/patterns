package com.lyubov.patterns.behavioral.command.firstexample.commands;

import com.lyubov.patterns.behavioral.command.firstexample.editor.Editor;

/**
 * Конкретная команда
 */
public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
