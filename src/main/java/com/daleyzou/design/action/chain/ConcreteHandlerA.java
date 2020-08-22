package com.daleyzou.design.action.chain;

/**
 * ConcreteHandlerA
 * @description TODO
 * @author dalelyzou
 * @date 2020年07月09日 9:33
 * @version 1.3.0
 */
public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        // 这里 if else 处理业务逻辑
        if (1 > 2){

        }else {
            this.successor.handleRequest(request);
        }
    }
}
