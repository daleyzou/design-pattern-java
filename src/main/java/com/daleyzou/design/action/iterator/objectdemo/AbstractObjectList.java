package com.daleyzou.design.action.iterator.objectdemo;

import java.util.List;

/**
 * AbstractObjectList
 * @description TODO
 * @author daleyzou
 * @date 2020年10月27日 9:51
 * @version 1.0.0
 */
public abstract class AbstractObjectList {
    private java.util.List<Object> objects;

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object object){
        this.objects.add(object);
    }

    public void removeObject(Object object){
        this.objects.remove(object);
    }

    public List<Object> getObjects() {
        return this.objects;
    }

    public abstract AbstractIterator createIterator();

}
