package com.lyubov.patterns.creational.abstractfactory;

public class HumanFactoryRus implements HumanFactory {
    @Override
    public Human getHuman() {
        return new Russian();
    }
}














































