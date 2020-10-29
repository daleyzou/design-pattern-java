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
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void help() {

    }

    @Override
    public void beAttacked(AllyControlCenter allyControlCenter) {

    }
}
