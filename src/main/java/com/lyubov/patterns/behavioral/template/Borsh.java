package com.lyubov.patterns.behavioral.template;

public class Borsh extends CookingSoups {
    @Override
    protected void addFirstIngredient() {
        System.out.println("Добавить свеклу");
    }

    @Override
    protected void addSecondIngredient() {
        System.out.println("Добавить мяса");
    }

    @Override
    protected void writeTitle() {
        System.out.println("Готовим Борщ");
    }

    @Override
    protected void addSeсretIngredient(){
        System.out.println("Борщ готов, сударыня!");
    }
}













































