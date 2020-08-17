package com.daleyzou.design.creation.factory.factory2;

/**
 * Client
 * @description TODO
 * @author daleyzou
 * @date 2020年06月30日 21:13
 * @version 1.2.0
 */
public class Client {

    public static void main(String[] args){
         SkinFactory skinFactory = new SummerSkinFactory();
        Button button = skinFactory.createButton();
        button.display();
    }
}
