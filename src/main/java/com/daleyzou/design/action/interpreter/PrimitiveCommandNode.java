package com.daleyzou.design.action.interpreter;

/**
 * PrimitiveCommandNode
 * @description TODO
 * @author daleyzou
 * @date 2020年10月26日 21:16
 * @version 1.0.0
 */
public class PrimitiveCommandNode extends Node {
    private String name;
    private String text;
    @Override
    public void interpret(Context context) {
        name = context.getCurrentToken();
        context.skipToken(name);
        if (!name.equals("PRINT") && !name.equals("BREAK") && !name.equals("SPACE")){
            System.err.println("非法命令");
        }
        if (name.equals("PRINT")){
            text = context.getCurrentToken();
            context.nextToken();
        }
    }

    @Override
    public void execute() {
        if (name.equals("PRINT")) {
            System.out.print(text);
        } else if (name.equals("SPACE")) {
            System.out.print(" ");
        } else if (name.equals("BREAK")) {
            System.out.println();
        }
    }
}
