package com.daleyzou.design.action.memento;

/**
 * Chessman
 * @description TODO
 * @author daleyzou
 * @date 2020年10月28日 20:34
 * @version 1.0.0
 */
public class Chessman {
    private String label;
    private int x;
    private int y;

    public Chessman(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public ChessmanMemento save(){
        return new ChessmanMemento(this.label, this.x, this.y);
    }

    public void restore(ChessmanMemento chessmanMemento){
        this.label = chessmanMemento.getLable();
        this.x = chessmanMemento.getX();
        this.y = chessmanMemento.getY();
    }
}
