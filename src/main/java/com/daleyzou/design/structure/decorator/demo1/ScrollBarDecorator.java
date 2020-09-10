package com.daleyzou.design.structure.decorator.demo1;

/**
 * ScrollBarDecorator
 * @description TODO
 * @author daleyzou
 * @date 2020年09月10日 20:35
 * @version 1.0.0
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为组件增加滚动条");
    }
}
