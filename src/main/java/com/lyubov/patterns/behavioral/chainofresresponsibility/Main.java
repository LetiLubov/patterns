package com.lyubov.patterns.behavioral.chainofresresponsibility;

/**
 * Предназначен для организации в системе уровней ответственности. Использование этого шаблона позволяет установить,
 * должно ли сообщение обрабатываться на том уровне, где оно было получено, или же оно должно передаваться для обработки
 * другому объекту.
 * Хороший пример: банкомат. Сначала надо разменять по сотке, потом по 50 и т.д.
 * Реализация: Логгеры. Есть консольный и файловый логгер, они цепляются друг друга и логируют
 *
 * @author Lyubov Ruzanova
 */
public class Main {

    static public void main(String[] args) {
        Logger warnings = new ConsoleLogger(LevelConstants.TRACE);
        Logger errors = new FileLogger(LevelConstants.ERROR);

        warnings.setNext(errors);

        System.out.println("====");
        warnings.writeMessage("ERROR", LevelConstants.ERROR);
        System.out.println("====");
        warnings.writeMessage("WARN", LevelConstants.WARN);
        System.out.println("====");
        warnings.writeMessage("TRACE", LevelConstants.TRACE);
        System.out.println("====");
    }
}
















































