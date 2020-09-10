package com.daleyzou.design.structure.decorator.demo2;

/**
 * Approver
 * @description TODO
 * @author daleyzou
 * @date 2020年09月10日 21:07
 * @version 1.0.0
 */
public class Approver extends Decorator {
    public Approver(Document document) {
        super(document);
        System.out.println("增加审批功能");
    }

    public void approve() {
        System.out.println("审批文件");
    }
}
