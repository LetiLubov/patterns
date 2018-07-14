package com.lyubov.patterns.behavioral.memento;

/**
 * Originator
 */
public class Game {
    private int level;
    public void load(Save save){
        level = save.getLevel();
    }
    public Save save(){
        return new Save(level);
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel() {
        return level;
    }
}
