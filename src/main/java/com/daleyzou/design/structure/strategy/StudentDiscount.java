package com.daleyzou.design.structure.strategy;

/**
 * StudentDiscount
 * @description TODO
 * @author daleyzou
 * @date 2020年07月17日 10:02
 * @version 1.3.1
 */
public class StudentDiscount implements Discount {
    @Override
    public double calculate(double price) {
        return 0;
    }
}
