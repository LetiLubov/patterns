package com.lyubov.patterns.behavioral.observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 * Наблюдатель за объектом, выводит сообщения на консоль
 */
public class ConcreteObserverFile implements Observer{
    public void handleEvent(String message) {
        File file = new File("Observer.txt");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.append("Состояние изменено в " + new Date() + " сообщение с метеостанции: \"" + message + "\"\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
