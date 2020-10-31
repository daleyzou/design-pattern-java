package com.daleyzou.design.action.observer.game;

/**
 * Player
 * @description TODO
 * @author daleyzou
 * @date 2020年10月29日 22:13
 * @version 1.0.0
 */
public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住 " + this.name + " 来救救你");
    }

    @Override
    public void beAttacked(AllyControlCenter allyControlCenter) {
        System.out.println(this.name + " 被攻击");
        allyControlCenter.notifyObservers(this.name);
    }
}
