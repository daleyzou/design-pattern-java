package com.daleyzou.design.structure.decorator.demo1;

/**
 * Client
 * @description TODO
 * @author daleyzou
 * @date 2020年09月10日 20:43
 * @version 1.0.0
 */
public class Client {
    public static void main(String[] args){
        Component component,componentSB;
        // 定义具体组件
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentSB.display();

        test2();
    }

    private static void test2() {
        System.out.println("=======================test2==========================");
        Component component,componentSB,componentBB;
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();
    }
}
