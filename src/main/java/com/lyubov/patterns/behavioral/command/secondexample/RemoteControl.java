package com.lyubov.patterns.behavioral.command.secondexample;

//Invoker
public class RemoteControl{
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
