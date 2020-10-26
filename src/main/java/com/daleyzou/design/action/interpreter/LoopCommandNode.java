package com.daleyzou.design.action.interpreter;

/**
 * LoopCommandNode
 * @description TODO
 * @author daleyzou
 * @date 2020年10月26日 21:16
 * @version 1.0.0
 */
public class LoopCommandNode extends Node {
    private int number;
    private Node commandNode;
    @Override
    public void interpret(Context context) {
        context.skipToken("LOOK");
        number = context.currentNumber();
        context.nextToken();
        commandNode = new ExpressionNode();
        commandNode.interpret(context);
    }

    @Override
    public void execute() {
        for (int i = 0; i < number; i++) {
            commandNode.execute();
        }
    }
}
