package com.daleyzou.design.action.template;

/**
 * Account
 * @description TODO
 * @author daleyzou
 * @date 2020年11月04日 21:16
 * @version 1.0.0
 */
public abstract class Account {
    public abstract void calculateInterest();
    public boolean validateLogin(){
        System.out.println("验证身份信息");
        return true;
    }

    public void display(){
        System.out.println("展示账户信息");
    }
}
