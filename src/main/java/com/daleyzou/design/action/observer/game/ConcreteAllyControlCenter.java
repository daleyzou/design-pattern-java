package com.daleyzou.design.action.observer.game;

/**
 * ConcreteAllyControlCenter
 * @description TODO
 * @author daleyzou
 * @date 2020年10月29日 22:13
 * @version 1.0.0
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String allyName) {
        this.allyName = allyName;
    }

    @Override
    public void notifyObservers(String name) {
        for (Observer player : players) {
            if (!player.getName().equals(name)){
                player.help();
            }
        }
    }
}
