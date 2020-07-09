package com.daleyzou.design.action.chain;

/**
 * President
 * @description TODO
 * @author daleyzou
 * @date 2020年07月09日 10:05
 * @version 1.3.0
 */
public class President extends Approver {
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {

    }
}
