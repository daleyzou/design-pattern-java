package com.daleyzou.design.creation.singleton;

/**
 * Singleton
 * @description TODO
 * @author daleyzou
 * @date 2020年07月01日 21:45
 * @version 1.2.0
 */
public class Singleton {
    private Singleton(){

    }
    private static class HolderClass{
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return HolderClass.instance;
    }
}
