package com.daleyzou.design.creation.singleton;

/**
 * EagerSingleton
 * @description daleyozu
 * @author daleyzou
 * @date 2020年07月01日 21:32
 * @version 1.2.0
 */
public class EagerSingleton {
    static EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }
}
