package com.daleyzou.design.action.interpreter;

/**
 * Node
 * @description TODO
 * @author daleyzou
 * @date 2020年10月26日 21:14
 * @version 1.0.0
 */
public abstract class Node {
    public abstract void interpret(Context context);

    public abstract void execute();
}
