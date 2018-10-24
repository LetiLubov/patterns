package com.lyubov.patterns.behavioral.mediator;

/**
 * Client
 */
public interface Client {
    void sendMessage(String message);
    void getMessage(String message);
    String getNickName();
}
