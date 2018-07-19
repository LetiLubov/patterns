package com.lyubov.patterns.behavioral.template;

public class Shchi extends CookingSoups {
    @Override
    public void addFirstIngredient() {
        System.out.println("Добавить капусты");
    }

    @Override
    public void addSecondIngredient() {
        System.out.println("Еще капусты");
    }
    @Override
    public void writeTitle() {
        System.out.println("Готовим Щи");
    }
}
