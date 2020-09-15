package com.daleyzou.design.structure.flyweight;

import lombok.Data;

/**
 * Coordinates
 * @description TODO
 * @author daleyzou
 * @date 2020年09月15日 9:59
 * @version 1.0.0
 */
public class Coordinates {
    private int x;

    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
