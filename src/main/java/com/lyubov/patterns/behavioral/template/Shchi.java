package com.lyubov.patterns.behavioral.template;

public class Shchi extends CookingSoups {
    @Override
    protected void addFirstIngredient() {
        System.out.println("Добавить капусты");
    }

    @Override
    protected void addSecondIngredient() {
        System.out.println("Еще капусты");
    }
    @Override
    protected void writeTitle() {
        System.out.println("Готовим Щи");
    }
}
