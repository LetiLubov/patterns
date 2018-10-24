package com.lyubov.patterns.base.delegate;

/**
 * Делегат. Перенаправляет (делегирует) обработку другому
 */
public class Main {
    public static void main(String[] args) {
        Painter painter = new Painter();
        painter.setGraphics(new Triangle());
        painter.draw();
    }
}
