package com.lyubov.patterns.behavioral.prototype;

public class Human implements Copyable<Human> {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human copy() {
        return new Human(age, name);
    }
}
