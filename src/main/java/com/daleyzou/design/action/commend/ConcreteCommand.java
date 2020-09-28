package com.daleyzou.design.action.commend;

/**
 * ConcreteCommand
 * @description TODO
 * @author daleyzou
 * @date 2020年09月28日 21:46
 * @version 1.0.0
 */
public class ConcreteCommand extends Command {
    Receiver receiver = new Receiver();
    @Override
    public void execute() {
        receiver.action();
    }
}
