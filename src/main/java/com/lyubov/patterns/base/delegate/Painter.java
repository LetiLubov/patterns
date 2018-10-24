package com.lyubov.patterns.base.delegate;

/**
 * Рисовальщик
 */
public class Painter {
    private Graphics graphics;
    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }
    void draw(){
        if (graphics != null){
            graphics.draw();
        }
    }
}
