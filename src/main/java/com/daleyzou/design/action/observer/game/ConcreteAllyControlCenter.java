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
        System.out.println(allyName + "战队创建成功");
        System.out.println("-------------------------------");
        this.allyName = allyName;
    }

    @Override
    public void notifyObservers(String name) {
        System.out.println(this.allyName + "紧急通知， " + name + "受到敌人攻击");
        for (Observer player : players) {
            if (!player.getName().equals(name)) {
                player.help();
            }
        }
    }
}
