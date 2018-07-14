package com.lyubov.patterns.behavioral.mediator;

public interface Client {
    void sendMessage(String message);
    void getMessage(String message);
    String getNickName();
}
