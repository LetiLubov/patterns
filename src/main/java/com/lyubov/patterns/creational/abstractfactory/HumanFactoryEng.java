package com.lyubov.patterns.creational.abstractfactory;

public class HumanFactoryEng implements HumanFactory {
    @Override
    public Human getHuman() {
        return new British();
    }
}

















