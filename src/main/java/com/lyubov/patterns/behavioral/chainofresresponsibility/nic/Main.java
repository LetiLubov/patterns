package com.lyubov.patterns.behavioral.chainofresresponsibility.nic;

/**
 * Формируем цепь передачи обязанностей
 */
public class Main {
    public static void main(String[] args) {
        RunnableFile graphFile = new GraphFile();
        EditorFile editorFile = new EditorFile();

        //установка следующего отвественного на октрытие файла
        graphFile.setNext(editorFile);

        //пробуем открыть
        graphFile.openFileByChainOfResponsibility(null);
    }
}
