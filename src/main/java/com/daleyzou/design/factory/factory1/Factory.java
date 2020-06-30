package com.daleyzou.design.factory;

/**
 * Factory
 * @description TODO
 * @author daleyzou
 * @date 2020年06月30日 20:13
 * @version 1.2.0
 */
public class Factory {
    public static Product getProduct(String msg){
        if ("ConcreteProduct".equalsIgnoreCase(msg)){
            return new ConcreteProduct();
        }
    }
}
