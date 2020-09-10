package com.daleyzou.design.structure.decorator;

/**
 * BlackBorderDecorator
 * @description TODO
 * @author daleyzou
 * @date 2020年09月10日 20:35
 * @version 1.0.0
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为组件增加黑色边框");
    }
}
