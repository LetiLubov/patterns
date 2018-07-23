package creational.builder;

public class Main {
    public static void main(String[] args){
        Pizza pizza = new PizzaBuilder().addCheese().addMushrooms().build();
        pizza.getOrderPizza();
    }
}
