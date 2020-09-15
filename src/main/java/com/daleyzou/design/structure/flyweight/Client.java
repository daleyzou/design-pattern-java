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

        black1.display(new Coordinates(1,2));
        black2.display(new Coordinates(2,2));
        black3.display(new Coordinates(3,2));
        white1.display(new Coordinates(4,2));
        white2.display(new Coordinates(5,2));
    }
}
