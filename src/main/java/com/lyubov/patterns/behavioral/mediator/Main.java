package com.lyubov.patterns.behavioral.mediator;

public class Main {
    public static void main(String[] args){
        LyubaChat lyubaChat = new LyubaChat();
        Admin lyubava = new Admin(lyubaChat);
        User pashka = new User(lyubaChat);
        pashka.setnickName("Pasha");
        User vitaliy = new User(lyubaChat);
        vitaliy.setnickName("Vetch");

        lyubaChat.setAdmin(lyubava);
        lyubaChat.addUser(vitaliy);
        lyubaChat.addUser(pashka);

        System.out.println("Чат Любы");
        vitaliy.sendMessage("Hi");
        lyubava.sendMessage("hi, gyus");
    }
}
