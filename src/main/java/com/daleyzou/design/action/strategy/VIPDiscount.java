package com.daleyzou.design.action.strategy;

/**
 * VIPDiscount
 * @description TODO
 * @author dalelyzou
 * @date 2020年07月17日 10:02
 * @version 1.3.1
 */
public class VIPDiscount implements Discount {
    @Override
    public double calculate(double price) {
        return 0;
    }
}
