package com.daleyzou.design.action.memento;

/**
 * MementoCaretaker
 * @description TODO
 * @author daleyzou
 * @date 2020年10月28日 20:35
 * @version 1.0.0
 */
public class MementoCaretaker {
    private ChessmanMemento chessmanMemento;

    public ChessmanMemento getChessmanMemento() {
        return chessmanMemento;
    }

    public void setChessmanMemento(ChessmanMemento chessmanMemento) {
        this.chessmanMemento = chessmanMemento;
    }
}
