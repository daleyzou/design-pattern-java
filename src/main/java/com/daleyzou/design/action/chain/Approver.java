package com.daleyzou.design.action.chain;

/**
 * Approver
 * @description TODO
 * @author dalelyzou
 * @date 2020年07月09日 9:49
 * @version 1.3.0
 */
abstract class Approver {
    protected Approver successor;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
