package com.lyubov.patterns.creational.abstractfactory;

public class British implements Human {
    @Override
    public void getContry() {
        System.out.println("UK");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
