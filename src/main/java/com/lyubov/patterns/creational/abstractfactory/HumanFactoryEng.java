package com.lyubov.patterns.creational.abstractfactory;

public class HumanFactoryEng implements HumanFactory {
    public Human getHuman() {
        return new British();
    }
}


















