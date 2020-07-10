package com.daleyzou.design.action.chain;

import com.google.gson.Gson;

/**
 * Congress
 * @description TODO
 * @author zoudaifa
 * @date 2020年07月10日 9:26
 * @version 1.3.0
 */
public class Congress extends Approver {
    static final Gson GSON = new Gson();
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        // 到了董事会，也就是这个责任链的末端了
        System.out.println("董事长召开董事会进行讨论：" + GSON.toJson(purchaseRequest));
    }
}
