package com.daleyzou.design.structure.decorator.demo2;

/**
 * Client1
 * @description TODO
 * @author daleyzou
 * @date 2020年09月10日 21:11
 * @version 1.0.0
 */
public class Client1 {
    public static void main(String[] args){
        Document doc;
        doc = new PurchaseRequest();
        Approver newDoc;
        newDoc = new Approver(doc);
        doc.display();
        newDoc.approve();
    }
}
