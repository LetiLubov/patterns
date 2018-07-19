package com.lyubov.patterns.behavioral.chainofresresponsibility;

/**
 * Предназначен для организации в системе уровней ответственности. Использование этого шаблона позволяет установить,
 * должно ли сообщение обрабатываться на том уровне, где оно было получено, или же оно должно передаваться для обработки
 * другому объекту.
 * Хороший пример: банкомат. Сначала надо разменять по сотке, потом по 50 и т.д.
 * Реализация: Логгеры. Есть консольный и файловый логгер, они цепляются друг друга и логируют
 */
public class Main {

    static public void main(String[] args) {
        Logger warnings = new ConsoleLogger(Level.TRACE);
        Logger errors = new FileLogger(Level.ERROR);
        warnings.setNext(errors);
        warnings.writeMessage("ERROR", Level.ERROR);
        warnings.writeMessage("WARN", Level.WARN);
        warnings.writeMessage("TRACE", Level.TRACE);
    }
}
















































