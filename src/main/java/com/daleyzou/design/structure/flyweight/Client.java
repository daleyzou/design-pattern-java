package com.daleyzou.design.structure.flyweight;

/**
 * Client
 * @description TODO
 * @author daleyzou
 * @date 2020年09月15日 9:44
 * @version 1.0.0
 */
public class Client {
    public static void main(String[] args){
        Chessman black1, black2, black3, white1, white2;
        ChessmanFactory chessmanFactory;

        chessmanFactory = ChessmanFactory.getInstance();
        black1 = chessmanFactory.getChessman("black");
        black2 = chessmanFactory.getChessman("black");
        black3 = chessmanFactory.getChessman("black");
        System.out.println("black is equal? " + (black1 == black2));

        white1 = chessmanFactory.getChessman("white");
        white2 = chessmanFactory.getChessman("white");
        System.out.println("white is equal?" + (white1 == white2));

        black1.display();
        black2.display();
        black3.display();
        white1.display();
        white2.display();
    }
}
