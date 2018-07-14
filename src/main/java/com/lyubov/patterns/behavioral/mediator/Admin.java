package com.lyubov.patterns.behavioral.mediator;

public class Admin implements Client {
    private Chat chat;
    public Admin(Chat chat) {
        this.chat = chat;
    }
    @Override
    public String getNickName() {
        return "Админ";
    }
    @Override
    public void getMessage(String message) {
        System.out.println("Админ получил сообщение: " + message);
    }
    @Override
    public void sendMessage(String message) {
        System.out.println(getNickName() + " отправил сообщение \"" + message + "\"");
        chat.sendMessage(message, this);
    }
}
