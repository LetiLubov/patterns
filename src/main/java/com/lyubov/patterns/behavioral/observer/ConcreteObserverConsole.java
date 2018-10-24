package com.lyubov.patterns.behavioral.observer;

/**
 * Наблюдатель за объектом, выводит сообщения на консоль
 */
public class ConcreteObserverConsole implements Observer {
    public void handleEvent(String message) {
        System.out.println("Обновление с наблюдаемого объекта !!!! Получено сообщение :\n" + message);
    }
}
