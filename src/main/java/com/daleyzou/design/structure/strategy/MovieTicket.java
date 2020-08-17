package com.daleyzou.design.structure.strategy;

/**
 * MovieTicket
 * @description TODO
 * @author dalelyzou
 * @date 2020年07月17日 9:58
 * @version 1.3.1
 */
public class MovieTicket {
    double price;
    Discount discount;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return discount.calculate(this.price);
    }
}
