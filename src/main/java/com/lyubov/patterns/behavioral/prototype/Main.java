package com.lyubov.patterns.behavioral.prototype;

/**
 * В Java тоже самое что Cloneable
 */
public class Main {
    public static void main(String[] args) {
        Human original = new Human(12, "Akela");
        System.out.println(original);
        System.out.println(original.copy());
    }
}
