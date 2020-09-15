package com.daleyzou.design.structure.proxy.demo1;

/**
 * Proxy
 * @description TODO
 * @author daleyzou
 * @date 2020年09月15日 21:53
 * @version 1.0.0
 */
public class Proxy implements subject {
    private RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest() {
    }

    public void postRequest() {
    }
}
