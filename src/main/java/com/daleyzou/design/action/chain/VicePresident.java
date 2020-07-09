package com.daleyzou.design.action.chain;

import com.google.gson.Gson;

/**
 * VicePresident
 * @description TODO
 * @author dalelyzou
 * @date 2020年07月09日 9:59
 * @version 1.3.0
 */
public class VicePresident extends Approver {
    final static Gson GSON = new Gson();
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() >= 50000 && purchaseRequest.getAmount() < 100000){
            System.out.println("副董事长：" + GSON.toJson(purchaseRequest));
        }else {
            this.successor.processRequest(purchaseRequest);
        }
    }
}
