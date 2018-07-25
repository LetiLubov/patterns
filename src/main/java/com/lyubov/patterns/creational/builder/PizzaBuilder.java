package com.lyubov.patterns.creational.builder;

public class PizzaBuilder {
    Pizza pizza = new Pizza();

    public PizzaBuilder addMushrooms() {
        pizza.setAddMushrooms(true);
        return this;
    }

    public PizzaBuilder addPepperoni() {
        pizza.setAddPepperoni(true);
        return this;
    }

    public PizzaBuilder addCheese() {
        pizza.setAddCheese(true);
        return this;
    }

    public PizzaBuilder addHam() {
        pizza.setAddHam(true);
        return this;
    }

    public Pizza build(){
        return pizza;
    }
}
