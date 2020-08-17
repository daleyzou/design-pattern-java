package com.daleyzou.design.creation.singleton;

/**
 * LazySingleton
 * @description TODO
 * @author daleyzou
 * @date 2020年07月01日 21:38
 * @version 1.2.0
 */
public class LazySingleton {
    private volatile static  LazySingleton lazySingleton = null;

    private LazySingleton() {
    }
    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            synchronized (LazySingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
