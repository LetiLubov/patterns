package com.lyubov.patterns.behavioral.chainofresresponsibility.nic;

import java.io.File;

/**
 * Открытие в "графиком"
 */
public class GraphFile extends RunnableFile{
    public void openFile(File file) throws CrashToOpenRunnableFile {
//        System.out.println("Смогла открыть график");
        throw new CrashToOpenRunnableFile("Не открыть мне график");
    }
}
