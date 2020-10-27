package com.daleyzou.design.action.iterator.objectdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Client
 * @description TODO
 * @author daleyzou
 * @date 2020年10月27日 21:06
 * @version 1.0.0
 */
public class Client {
    public static void main(String[] args){
        List<Object> lists = new ArrayList<>(5);
        lists.add("one");
        lists.add("two");
        lists.add("three");
        lists.add("five");

        AbstractObjectList objectList = new ProductList(lists);
        AbstractIterator iterator = objectList.createIterator();
        System.out.println("==============正=======================");
        while (!iterator.isLast()){
            System.out.println(iterator.getNextItem() + "");
            iterator.next();
        }
        System.out.println("+++++++++++++++反+++++++++++++++++");
        while (!iterator.isFirst()){
            System.out.println(iterator.getPreviousItem());
            iterator.previous();
        }
    }
}
