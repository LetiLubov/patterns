package com.lyubov.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Позволяет делать "матрешки" и вложенность за счет того, что Composite также имплементит Shape
 * Таким образом хранятся как "простые" фигуры, так и многофигурные
 */
public class Composite implements Shape {
    private List<Shape> components = new ArrayList<Shape>();

    public void removeComponent(Shape component) {
        components.remove(component);
    }

    public void addComponent(Shape component) {
        components.add(component);
    }

    public void draw() {
        for (Shape component : components) {
            component.draw();
        }

    }
}
