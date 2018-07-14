package com.lyubov.patterns.behavioral.mediator;

/**
 * Mediator
 */
public interface Chat {
    void sendMessage(String message, Client client);
}
