package com.daleyzou.design.action.state.share;

/**
 * OnState
 * @description TODO
 * @author daleyzou
 * @date 2020年11月02日 21:47
 * @version 1.0.0
 */
public class OnState extends State {
    @Override
    void on(Switch s) {
        System.out.println("已经处于打开状态");
    }

    @Override
    void off(Switch s) {
        System.out.println("关闭");
        s.setState(Switch.getState("off"));
    }
}
