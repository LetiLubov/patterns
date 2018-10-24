package com.lyubov.patterns.behavioral.memento;

/**
 * Сохраняет "моментальный список" состояния объекта, позволяющий такому объекту вернуться к исходному состоянию,
 * не раскрывая своего содержимого внешнему миру
 *
 * Реализация: сохранение в играх
 *
 * Game - игра, изменчивая среда
 * Save - слепок момента aka сохранение
 * RunnableFile - шкатулка, куда можно положить сейв
 */
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
