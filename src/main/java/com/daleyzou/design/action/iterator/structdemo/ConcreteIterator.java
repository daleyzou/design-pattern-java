package com.daleyzou.design.action.iterator.structdemo;

/**
 * ConcreteIterator
 * @description TODO
 * @author daleyzou
 * @date 2020年10月27日 9:43
 * @version 1.0.0
 */
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate concreteAggregate;
    private int cursor;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public void first() {

    }

    @Override
    public void next() {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object currentItem() {
        return null;
    }
}
