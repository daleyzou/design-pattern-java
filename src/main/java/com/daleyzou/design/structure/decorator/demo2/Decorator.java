package com.daleyzou.design.structure.decorator.demo2;

/**
 * Decorator
 * @description TODO
 * @author daleyzou
 * @date 2020年09月10日 21:05
 * @version 1.0.0
 */
public class Decorator extends Document {
    private Document document;

    public Decorator(Document document) {
        this.document = document;
    }

    @Override
    public void display() {
        document.display();
    }
}
