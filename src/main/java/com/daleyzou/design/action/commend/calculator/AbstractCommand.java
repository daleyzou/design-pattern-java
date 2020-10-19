package com.daleyzou.design.action.commend.calculator;

/**
 * AbstractCommand
 * @description TODO
 * @author daleyzou
 * @date 2020年10月14日 21:56
 * @version 1.0.0
 */
public abstract class AbstractCommand {
    public abstract int execute(int value);

    public abstract int undo();
}
