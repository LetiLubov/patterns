package com.lyubov.patterns.behavioral.observer;

/**
 * Предоставляет компоненту возможность гибкой рассылки сообщений интересующим его получателям.
 *
 * Реализация: метостанция информирует подписчиков о перемене погоды.
 * Метеостанция (объект интереса). Виджеты погоды - наблюдатели. Тогда при обновлении данных погоды, необходимо обновить
 * виджеты. Для этого у метеостанции зафиксированы зависимые от ее инфы наблюдатели, и при обновлении контента
 * вызывается метод оповещения всех наблюдателей (notify), где для каждого из них вызывается handle для триггера их
 * необходимых действий.
 *
 * ConcreteObservable - метеостанция или объект наблюдения
 * ConcreteObserverConsole и ConcreteObserverFile - подисчики
 */
public class Main {
    public static void main(String[] args){
        ConcreteObservable meteoStation = new ConcreteObservable();
        ConcreteObserverConsole consoleObserver = new ConcreteObserverConsole();
        ConcreteObserverFile fileObserver = new ConcreteObserverFile();
        meteoStation.addObserver(consoleObserver);
        meteoStation.addObserver(fileObserver);
        meteoStation.changeStateConcreteObserver(10);
    }
}
