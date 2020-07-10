package com.daleyzou.design.action.chain;

import com.google.gson.Gson;

import java.lang.management.GarbageCollectorMXBean;

/**
 * President
 * @description TODO
 * @author daleyzou
 * @date 2020年07月09日 10:05
 * @version 1.3.0
 */
public class President extends Approver {
    static final Gson GSON = new Gson();
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() >= 100000 &&purchaseRequest.getAmount() < 500000){
            System.out.println("董事长审批：" + GSON.toJson(purchaseRequest));
        }else {
            this.successor.processRequest(purchaseRequest);
        }
    }
}
