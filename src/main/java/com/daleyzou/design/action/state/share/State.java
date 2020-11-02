package com.daleyzou.design.action.state.share;

/**
 * State
 * @description TODO
 * @author daleyzou
 * @date 2020年11月02日 21:46
 * @version 1.0.0
 */
public abstract class State {
    abstract void on(Switch s);
    abstract void off(Switch s);
}
