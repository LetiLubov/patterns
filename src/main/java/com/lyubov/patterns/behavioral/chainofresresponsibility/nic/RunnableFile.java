package com.lyubov.patterns.behavioral.chainofresresponsibility.nic;

import java.io.File;

/**
 * Абстрактный класс файлов
 * @author Lyubov Ruzanova
 */
public abstract class RunnableFile {

    private RunnableFile next;

    public void setNext(RunnableFile next) {
        this.next = next;
    }

    /**
     * Открывает файл, если не может, то передает эстафету следюущему
     * @param file - файл
     */
    public void openFileByChainOfResponsibility(File file){
        try{
            openFile(file);
        } catch (CrashToOpenRunnableFile ex) {
            System.out.println(ex);
            if (next != null) {
                next.openFile(file);
            }
        }
    }

    /**
     * Открывает файл в чем надо, зависит от имплементации
     * @param file
     * @throws CrashToOpenRunnableFile
     */
    public abstract void openFile(File file) throws CrashToOpenRunnableFile;
}
