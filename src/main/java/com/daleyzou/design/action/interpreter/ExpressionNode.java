package com.daleyzou.design.action.interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ExpressionNode
 * @description TODO
 * @author daleyzou
 * @date 2020年10月26日 21:17
 * @version 1.0.0
 */
public class ExpressionNode extends Node {
    private List<Node> list = new ArrayList<>();
    @Override
    public void interpret(Context context) {
        while (true){
            if (context.getCurrentToken() == null){
                break;
            }else if (context.getCurrentToken().equals("END")){
                context.skipToken("END");
                break;
            }else {
                CommandNode commandNode = new CommandNode();
                commandNode.interpret(context);
                list.add(commandNode);
            }
        }
    }

    @Override
    public void execute() {
        Iterator<Node> iterator = list.iterator();
        while (iterator.hasNext()){
            iterator.next().execute();
        }
    }
}
