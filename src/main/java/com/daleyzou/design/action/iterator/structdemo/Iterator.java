package com.daleyzou.design.action.iterator.structdemo;

/**
 * Iterator
 * @description TODO
 * @author daleyzou
 * @date 2020年10月27日 9:40
 * @version 1.0.0
 */
public interface Iterator {
    void first();
    void next();
    boolean hasNext();
    Object currentItem();
}
