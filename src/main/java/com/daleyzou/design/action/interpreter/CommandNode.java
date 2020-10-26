package com.daleyzou.design.action.interpreter;

/**
 * CommandNode
 * @description TODO
 * @author daleyzou
 * @date 2020年10月26日 21:15
 * @version 1.0.0
 */
public class CommandNode extends Node {
    private Node node;

    @Override
    public void interpret(Context context) {
        if (context.getCurrentToken().equals("LOOP")) {
            node = new LoopCommandNode();
            node.interpret(context);
        } else {
            node = new PrimitiveCommandNode();
            node.interpret(context);
        }
    }

    @Override
    public void execute() {
        node.execute();
    }
}
