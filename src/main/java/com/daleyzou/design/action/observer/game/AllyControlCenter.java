package com.daleyzou.design.action.observer.game;

import java.util.ArrayList;
import java.util.List;

/**
 * AllyControlCenter
 * @description TODO
 * @author daleyzou
 * @date 2020年10月29日 22:12
 * @version 1.0.0
 */
public abstract class AllyControlCenter {
    protected String allyName;
    protected List<Observer> players = new ArrayList<>();

    protected void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    protected String getAllyName() {
        return allyName;
    }

    protected void join(Observer player) {
        players.add(player);
    }

    protected  void quit(Observer player) {
        players.remove(player);
    }

    public abstract void notifyObservers(String name);
}
