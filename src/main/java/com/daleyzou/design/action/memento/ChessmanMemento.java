package com.daleyzou.design.action.memento;

/**
 * ChessmanMemento
 * @description TODO
 * @author daleyzou
 * @date 2020年10月28日 20:34
 * @version 1.0.0
 */
public class ChessmanMemento {
    private String lable;

    private int x;

    private int y;

    public ChessmanMemento(String label, int x, int y) {
        this.lable = label;
        this.x = x;
        this.y = y;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
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
