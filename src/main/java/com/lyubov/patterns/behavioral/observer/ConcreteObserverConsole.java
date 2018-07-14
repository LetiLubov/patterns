package com.lyubov.patterns.behavioral.observer;

public class ConcreteObserverConsole implements Observer {
    public void handleEvent(String message) {
        System.out.println("Обновление с наблюдаемого объекта !!!! Получено сообщение :\n" + message);
    }
}
