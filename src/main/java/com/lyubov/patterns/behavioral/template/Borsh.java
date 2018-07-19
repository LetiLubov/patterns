package com.lyubov.patterns.behavioral.template;

public class Borsh extends CookingSoups {
    @Override
    public void addFirstIngredient() {
        System.out.println("Добавить свеклу");
    }

    @Override
    public void addSecondIngredient() {
        System.out.println("Добавить мяса");
    }

    @Override
    public void writeTitle() {
        System.out.println("Готовим Борщ");
    }

    @Override
    public void addSeсretIngredient(){
        System.out.println("Борщ готов, сударыня!");
    }
}













































