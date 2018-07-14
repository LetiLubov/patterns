package com.lyubov.patterns.behavioral.mediator;

public class User implements Client {
    private String nickName;

    private Chat chat;
    public User(Chat chat) {
        this.chat = chat;
    }

    public void setnickName(String name) {
        this.nickName = name;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public void getMessage(String message) {
        System.out.println(nickName + " получил сообщение - " + message);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(nickName + " отправил сообщение \"" + message + "\"");
        chat.sendMessage(message, this);
    }

}
