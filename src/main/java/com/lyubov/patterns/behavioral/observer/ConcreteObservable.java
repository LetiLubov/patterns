package com.lyubov.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Метеостанция к примеру
 * Изменения спровоциораваны в changeStateConcreteObserver() и хотим оповестить всех наблюдателей.
 */
public class ConcreteObservable implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private int valueField;
    public void changeStateConcreteObserver(int valueField) {
        this.valueField = valueField;
        //do some staff
        notifyObservers();
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleEvent("Объект изменил параметры valueField = " + valueField);
        }
    }
}
