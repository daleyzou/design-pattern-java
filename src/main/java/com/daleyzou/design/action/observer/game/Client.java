package com.daleyzou.design.action.observer.game;

/**
 * Client
 * @description TODO
 * @author daleyzou
 * @date 2020年10月31日 12:01
 * @version 1.0.0
 */
public class Client {
    public static void main(String[] args){
        AllyControlCenter allyControlCenter = new ConcreteAllyControlCenter("金庸群侠");
        Observer player1 = new Player("杨过");
        Observer player2 = new Player("令狐冲");
        Observer player3 = new Player("张无忌");
        Observer player4 = new Player("段誉");

        allyControlCenter.join(player1);
        allyControlCenter.join(player2);
        allyControlCenter.join(player3);
        allyControlCenter.join(player4);

        player1.beAttacked(allyControlCenter);
    }
}
