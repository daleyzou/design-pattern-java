package com.daleyzou.design.action.mediator;

/**
 * List
 * @description TODO
 * @author daleyzou
 * @date 2020年10月28日 9:44
 * @version 1.0.0
 */
public class List extends Component {
    @Override
    public void update() {
        System.out.println("列表框增加一项：张无忌。");

    }
    public void select(){
        System.out.println("列表框选中一项：小龙女。");

    }
}
