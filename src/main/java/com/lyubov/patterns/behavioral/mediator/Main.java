package com.lyubov.patterns.behavioral.mediator;

/**
 * Предназначен для упрощения взаимодействия объектов системы путем создания
 * специального объекта, который управляет распределением сообщений между остальными объектами.
 *
 * Реализация: чат
 *
 * LyubaChat - ConcreteMediator. Посредник, взаимодействующий с несколькими клиентскими классами. Основываясь на
 * получаемой информации, посредник либо вызывает те или иные методы клиента, либо задействует некий общий метод,
 * информирующий клиентов об изменении, либо выполняет обе операции.
 *
 * User и Admin - ConcreteClient. Обеспечивает реализацию каждого метода клиента. Класс ConcreteClient может среди
 * прочих данных сохранять ссылку на экземпляр класса Mediator, чтобы через последний информировать других клиентов о
 * тех или иных изменениях в своих данных.
 */
public class Main {
    public static void main(String[] args){
        LyubaChat lyubaChat = new LyubaChat();
        Admin lyubava = new Admin(lyubaChat);
        User pashka = new User(lyubaChat);
        pashka.setnickName("Pasha");
        User vitaliy = new User(lyubaChat);
        vitaliy.setnickName("Vetch");

        //добавляем пользователей в чат
        lyubaChat.setAdmin(lyubava);
        lyubaChat.addUser(vitaliy);
        lyubaChat.addUser(pashka);

        System.out.println("Чат Любы");

        //тест чата
        vitaliy.sendMessage("Hi");
        lyubava.sendMessage("hi, gyus");
    }
}
