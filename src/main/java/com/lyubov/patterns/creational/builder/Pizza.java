package com.lyubov.patterns.creational.builder;

public class Pizza {
    private boolean addCheese;
    private boolean addPepperoni;
    private boolean addHam;
    private boolean addMushrooms;

    public void getOrderPizza() {
        System.out.println("Your pizza: ");
        if (addMushrooms) {
            System.out.println("with mushrooms");
        }
        if (addPepperoni) {
            System.out.println("with pepperoni");
        }
        if (addHam) {
            System.out.println("with ham");
        }
        if (addCheese) {
            System.out.println("with cheese");
        }
    }

    public boolean isAddCheese() {
        return addCheese;
    }

    public void setAddCheese(boolean addCheese) {
        this.addCheese = addCheese;
    }

    public boolean isAddPepperoni() {
        return addPepperoni;
    }

    public void setAddPepperoni(boolean addPepperoni) {
        this.addPepperoni = addPepperoni;
    }

    public boolean isAddHam() {
        return addHam;
    }

    public void setAddHam(boolean addHam) {
        this.addHam = addHam;
    }

    public boolean isAddMushrooms() {
        return addMushrooms;
    }

    public void setAddMushrooms(boolean addMushrooms) {
        this.addMushrooms = addMushrooms;
    }
}
