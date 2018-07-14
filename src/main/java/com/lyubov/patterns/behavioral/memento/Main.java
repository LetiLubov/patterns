package com.lyubov.patterns.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.setLevel(7);
        File file = new File();
        file.setSave(game.save());
        game.setLevel(8);
        //все плохо, вернем старое сохранение
        game.load(file.getSave());
    }
}
