package com.daleyzou.design.action.iterator.structdemo;

/**
 * ConcreteAggregate
 * @description TODO
 * @author daleyzou
 * @date 2020年10月27日 9:43
 * @version 1.0.0
 */
public class ConcreteAggregate implements Aggregate {
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
