package com.daleyzou.design.structure.flyweight;

import com.google.common.collect.Lists;

import java.util.Hashtable;

/**
 * ChessmanFactory
 * @description TODO
 * @author daleyzou
 * @date 2020年09月15日 9:36
 * @version 1.0.0
 */
public class ChessmanFactory {
    private static ChessmanFactory instance = new ChessmanFactory();

    private java.util.Hashtable ht;

    public ChessmanFactory() {
        ht = new Hashtable();
        Chessman black, white;
        black = new BlackChessman();
        white = new WhiteChessman();
        ht.put("black", black);
        ht.put("white", white);
    }

    public static ChessmanFactory getInstance() {
        return instance;
    }

    public Chessman getChessman(String color){

        return (Chessman) ht.get(color);
    }
}
