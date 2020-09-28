package com.daleyzou.design.action.commend;

/**
 * Invoker
 * @description TODO
 * @author daleyzou
 * @date 2020年09月28日 21:48
 * @version 1.0.0
 */
public class Invoker {
    Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
