package com.daleyzou.design.structure.bridge;

/**
 * RefinedAbstration
 * @description TODO
 * @author daleyzou
 * @date 2020年09月03日 20:34
 * @version 1.3.1
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        // 这里调用业务代码
        this.impl.operationImpl();
    }
}
