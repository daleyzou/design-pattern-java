package com.daleyzou.design.action.state.account;

/**
 * AccountStatue
 * @description TODO
 * @author daleyzou
 * @date 2020年11月02日 19:59
 * @version 1.0.0
 */
public abstract class AccountStatue {
    private Account account;
    public void deposit(double amount){

    }
    public void withdraw(double amount){

    }
    abstract void coumputeInterest();
    abstract void stateCheck();
}