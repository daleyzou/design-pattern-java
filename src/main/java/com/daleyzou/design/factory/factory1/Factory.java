package com.daleyzou.design.factory.factory1;

/**
 * Factory
 * @description TODO
 * @author daleyzou
 * @date 2020年06月30日 20:13
 * @version 1.2.0
 */
public class Factory {
    public static Product getProduct(String msg){
        Product product = null;
        if ("ConcreteProduct".equalsIgnoreCase(msg)){
            product = new ConcreteProduct();
        }
        return product;
    }
}
