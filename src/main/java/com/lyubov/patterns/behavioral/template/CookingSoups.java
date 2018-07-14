package com.lyubov.patterns.behavioral.template;

public abstract class CookingSoups {
    public final void recipe(){
        writeTitle();
        getPanAndAddWater();
        addFirstIngredient();
        addSecondIngredient();
        addSeсretIngredient();
    }
    protected void writeTitle(){}
    private void getPanAndAddWater(){
        System.out.println("Взять кострюлю, налить воды");
    }
    protected void addFirstIngredient(){}
    protected void addSecondIngredient(){}
    protected void addSeсretIngredient(){}
}
