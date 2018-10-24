package com.lyubov.patterns.creational.builder;

public class Main {
    public static void main(String[] args){
        Pizza pizza = new PizzaBuilder()
                .addCheese()
                .addMushrooms()
                .addHam()
                .addPepperoni()
                .build();
        pizza.getOrderPizza();
    }
}
