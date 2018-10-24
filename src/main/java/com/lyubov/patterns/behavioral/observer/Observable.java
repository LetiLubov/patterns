package com.lyubov.patterns.behavioral.observer;

/**
 * Объект наблюдения
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
