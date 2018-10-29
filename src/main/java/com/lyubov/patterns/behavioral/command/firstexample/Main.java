package com.lyubov.patterns.behavioral.command.firstexample;

import com.lyubov.patterns.behavioral.command.firstexample.editor.Editor;

/**
 * Команда описывает общий для всех конкретных команд интерфейс. Обычно здесь описан всего один метод для запуска команды.
 */
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
