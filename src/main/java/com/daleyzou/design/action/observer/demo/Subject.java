package com.daleyzou.design.action.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject
 * @description TODO
 * @author daleyzou
 * @date 2020年10月28日 21:57
 * @version 1.0.0
 */
public abstract class Subject {
    List<Observer> observers = new ArrayList<>();
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }
    public abstract void notice();
}
