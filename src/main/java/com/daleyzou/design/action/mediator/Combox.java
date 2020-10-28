package com.daleyzou.design.action.mediator;

/**
 * Combox
 * @description TODO
 * @author daleyzou
 * @date 2020年10月28日 9:45
 * @version 1.0.0
 */
public class Combox extends Component {
    @Override
    public void update() {
        System.out.println("组合框增加一项：张无忌。");

    }
    public void select(){
        System.out.println("组合框选中一项：小龙女。");

    }
}
