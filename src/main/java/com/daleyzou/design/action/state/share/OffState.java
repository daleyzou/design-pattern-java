package com.daleyzou.design.action.state.share;

/**
 * OffState
 * @description TODO
 * @author daleyzou
 * @date 2020年11月02日 21:47
 * @version 1.0.0
 */
public class OffState extends State {
    @Override
    void on(Switch s) {
        System.out.println("已经打开");
    }

    @Override
    void off(Switch s) {
        System.out.println("关闭");
        Switch.setState(Switch.getState("off"));
    }
}
