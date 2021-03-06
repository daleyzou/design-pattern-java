package com.daleyzou.design.action.iterator.objectdemo;

/**
 * AbstractIterator
 * @description TODO
 * @author daleyzou
 * @date 2020年10月27日 9:53
 * @version 1.0.0
 */
public interface AbstractIterator {
    void next();

    boolean isLast();

    void previous();

    boolean isFirst();

    Object getNextItem();

    Object getPreviousItem();

}
