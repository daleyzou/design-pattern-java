package com.daleyzou.design.action.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * MementoCaretaker
 * @description TODO
 * @author daleyzou
 * @date 2020年10月28日 20:35
 * @version 1.0.0
 */
public class MementoCaretaker {
    private List<ChessmanMemento> chessmanMementoList = new ArrayList<>();

    public ChessmanMemento getChessmanMemento(int index) {
        return chessmanMementoList.get(index);
    }

    public void setChessmanMemento(ChessmanMemento chessmanMemento) {
        this.chessmanMementoList.add(chessmanMemento);
    }
}
