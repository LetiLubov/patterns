package com.lyubov.patterns.creational.abstractfactory;

public class Russian implements Human {
    @Override
    public void sayHello() {
        System.out.println("Привет");
    }

    @Override
    public void getContry() {
        System.out.println("Russia");
    }
}
