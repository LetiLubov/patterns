package com.lyubov.patterns.behavioral.chainofresresponsibility.nic;

/**
 * Кастомная ошибка
 */
public class CrashToOpenRunnableFile extends RuntimeException {
    public CrashToOpenRunnableFile(String message) {
        super(message);
    }
}
