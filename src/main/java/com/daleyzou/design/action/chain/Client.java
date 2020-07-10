package com.daleyzou.design.action.chain;

/**
 * Client
 * @description TODO
 * @author zoudaifa
 * @date 2020年07月10日 9:33
 * @version 1.3.0
 */
public class Client {
    public static void main(String[] args){
        Approver wuzhang, gyang, jguo, meeting;
        wuzhang = new Director("张无忌");
        gyang = new VicePresident("杨过");
        jguo = new President("郭靖");
        meeting = new Congress("董事会");

        // 创建职责链
        wuzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);

        PurchaseRequest pr1 = new PurchaseRequest(45000, 100001, "购买倚天剑");
        wuzhang.processRequest(pr1);
        PurchaseRequest pr2 = new PurchaseRequest(60000, 100002, "购买葵花宝典");
        wuzhang.processRequest(pr2);
        PurchaseRequest pr3 = new PurchaseRequest(160000, 100003, "购买金刚经");
        wuzhang.processRequest(pr3);
        PurchaseRequest pr4 = new PurchaseRequest(800000, 100004, "购买桃花岛");
        wuzhang.processRequest(pr4);
    }
}
