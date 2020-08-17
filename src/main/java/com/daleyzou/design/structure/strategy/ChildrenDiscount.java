package com.daleyzou.design.structure.strategy;

/**
 * ChildrenDiscount
 * @description TODO
 * @author dalelyzou
 * @date 2020年07月17日 10:08
 * @version 1.3.1
 */
public class ChildrenDiscount implements Discount {
    @Override
    public double calculate(double price) {
        return 0;
    }
}
