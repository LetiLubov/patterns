package com.lyubov.patterns.behavioral.observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class ConcreteObserverFile implements Observer{
    public void handleEvent(String message) {
        File file = new File("Obsever.txt");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.append("Состояние изменено в " + LocalDateTime.now() + " сообщение с метеостанции: \"" + message + "\"\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
