package com.daleyzou.design.action.chain;

/**
 * Handler
 * @description TODO
 * @author dalelyzou
 * @date 2020年07月09日 9:29
 * @version 1.3.0
 */
abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(String request);
}
