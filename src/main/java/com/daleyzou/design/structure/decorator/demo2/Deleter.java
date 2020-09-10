package com.daleyzou.design.structure.decorator.demo2;

/**
 * Deleter
 * @description TODO
 * @author daleyzou
 * @date 2020年09月10日 21:07
 * @version 1.0.0
 */
public class Deleter extends Decorator {
    public Deleter(Document document) {
        super(document);
        System.out.println("增加删除功能");
    }

    public void delete() {
        System.out.println("删除文件");
    }
}
