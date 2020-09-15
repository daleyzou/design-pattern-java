package com.daleyzou.design.structure.flyweight;

/**
 * Chessman
 * @description TODO
 * @author daleyzou
 * @date 2020年09月15日 9:32
 * @version 1.0.0
 */
public abstract class Chessman {
    public abstract String getColor();

    public void display() {
        System.out.println("chess is the color: " + this.getColor());
    }
}
