package com.lyubov.patterns.behavioral.mediator;

/**
 * Админ (ConcreteClient)
 */
public class Admin implements Client {
    private Chat chat;
    public Admin(Chat chat) {
        this.chat = chat;
    }

    public String getNickName() {
        return "Админ";
    }

    public void getMessage(String message) {
        System.out.println("Админ получил сообщение: " + message);
    }

    public void sendMessage(String message) {
        System.out.println(getNickName() + " отправил сообщение \"" + message + "\"");
        chat.sendMessage(message, this);
    }
}
