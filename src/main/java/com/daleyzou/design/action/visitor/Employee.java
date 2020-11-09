package com.daleyzou.design.action.visitor;

/**
 * Employee
 * @description TODO
 * @author daleyzou
 * @date 2020年11月09日 13:17
 * @version 1.0.0
 */
public interface Employee {
    public void accept(Department handle);
}
