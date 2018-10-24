package com.lyubov.patterns.structural.composite;

/**
 * Компоновщик.
 * Пример: чемодан в котором вперемешку и отдельные предметы, так и другие объекты под хранение вещей
 */
public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape triangle2 = new Triangle();
        Shape square = new Square();

        Composite composite = new Composite();
        composite.addComponent(triangle);

        Composite innerComposite = new Composite();
        innerComposite.addComponent(square);
        innerComposite.addComponent(triangle2);

        composite.addComponent(innerComposite);

        composite.draw();
    }
}
