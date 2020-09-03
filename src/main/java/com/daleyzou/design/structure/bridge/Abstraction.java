package com.daleyzou.design.structure.bridge;

/**
 * Abstraction
 * @description TODO
 * @author daleyzou
 * @date 2020年09月03日 20:30
 * @version 1.3.1
 */
public abstract class Abstraction {
    protected Implementor impl;

    public void setImpl(Implementor impl) {
        this.impl = impl;
    }

    public abstract void operation();
}
