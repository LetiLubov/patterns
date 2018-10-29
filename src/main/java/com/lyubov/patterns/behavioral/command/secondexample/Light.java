package com.lyubov.patterns.behavioral.command.secondexample;

//Receiver
public class Light{
    private boolean on;
    public void switchOn(){
        on = true;
        printInfo();
    }
    public void switchOff(){
        on = false;
        printInfo();
    }

    private void printInfo() {
        System.out.println("light - " + on);
    }
}
