package com.lyubov.patterns.behavioral.observer;

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
