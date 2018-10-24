package com.lyubov.patterns.behavioral.chainofresresponsibility.nic;

import java.io.File;

/**
 * Открытие в "текстовом редакторе"
 */
public class EditorFile extends RunnableFile {
    public void openFile(File file) throws CrashToOpenRunnableFile {
        System.out.println("Открываю в тектовом редакторе");
    }
}
