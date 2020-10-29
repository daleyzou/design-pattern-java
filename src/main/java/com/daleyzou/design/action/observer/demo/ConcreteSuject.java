package com.daleyzou.design.action.observer.demo;

/**
 * ConcreteSuject
 * @description TODO
 * @author daleyzou
 * @date 2020年10月28日 21:58
 * @version 1.0.0
 */
public class ConcreteSuject extends Subject {
    @Override
    public void notice() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
