package com.daleyzou.design.structure.chain;

/**
 * PurchaseRequest
 * @description TODO
 * @author dalelyzou
 * @date 2020年07月09日 9:46
 * @version 1.3.0
 */
public class PurchaseRequest {
    double amount;
    int number;
    String purpose;

    public PurchaseRequest(double amount, int number, String purpose) {
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
