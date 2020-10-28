package com.daleyzou.design.action.iterator.objectdemo;

import java.util.List;

/**
 * ProductIterator
 * @description TODO
 * @author daleyzou
 * @date 2020年10月27日 9:53
 * @version 1.0.0
 */
public class ProductIterator implements AbstractIterator {
    private final ProductList productList;

    private final List<Object> products;
    private int cursor1 = 0;
    private int cursor2 = 0;

    /**
     * 这里需要传递访问的聚合数据到迭代器，如果在访问对象中直接使用内部类的方式，就不需要再传递一次数据了
     * */
    public ProductIterator(ProductList productList) {
        this.productList = productList;
        this.products = productList.getObjects();
        this.cursor2 = products.size() - 1;

    }

    @Override
    public void next() {
        if (cursor1 < products.size()){
            cursor1++;
        }
    }

    @Override
    public boolean isLast() {
        return cursor1 == products.size();
    }

    @Override
    public void previous() {
        if (cursor2 > -1){
            cursor2--;
        }
    }

    @Override
    public boolean isFirst() {
        return cursor2 == -1;
    }

    @Override
    public Object getNextItem() {
        return products.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}
