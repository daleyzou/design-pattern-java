package com.daleyzou.design.action.mediator;

/**
 * TextBox
 * @description TODO
 * @author daleyzou
 * @date 2020年10月28日 9:44
 * @version 1.0.0
 */
public class TextBox extends Component {
    @Override
    public void update() {
        System.out.println("客户信息增加成功后文本框清空");
    }

    public void setText(){
        System.out.println("文本框显示：小龙女。");
    }
}
