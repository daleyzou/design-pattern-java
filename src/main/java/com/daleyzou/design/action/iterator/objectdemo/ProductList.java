package com.daleyzou.design.action.iterator.objectdemo;

import java.util.List;

/**
 * ProductList
 * @description TODO
 * @author daleyzou
 * @date 2020年10月27日 9:53
 * @version 1.0.0
 */
public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
