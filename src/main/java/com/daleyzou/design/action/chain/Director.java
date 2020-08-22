package com.daleyzou.design.action.chain;

/**
 * Director
 * @description TODO
 * @author dalelyzou
 * @date 2020年07月09日 9:52
 * @version 1.3.0
 */
public class Director extends Approver {

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() < 50000){
            System.out.println("主任" + this.name + "审批采购单：" + purchaseRequest.getNumber() + ", 金额： " + purchaseRequest.getAmount() + " , 采购目的：" + purchaseRequest.getPurpose());
        }else {
            this.successor.processRequest(purchaseRequest);
        }

    }
}
