package com.daleyzou.design.action.interpreter;

/**
 * Client
 * @description TODO
 * @author daleyzou
 * @date 2020年10月26日 21:45
 * @version 1.0.0
 */
public class Client {
    public static void main(String[] args){
        String text = "LOOP 5 PRINT 杨过 SPACE SPACE PRINT 小龙女 BREAK END PRINT 郭靖 SPACE SPACE PRINT 黄蓉";
        Context context = new Context(text);

        Node node = new ExpressionNode();
        node.interpret(context);
        node.execute();
    }
}
