package com.daleyzou.design.action.state.account;

/**
 * Account
 * @description TODO
 * @author daleyzou
 * @date 2020年11月02日 20:00
 * @version 1.0.0
 */
public class Account {
    private AccountStatue accountStatue;

    private String owner;

    private double balance;

    public Account(String owner, double init) {
        this.owner = owner;
        this.balance = init;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountStatue(AccountStatue accountStatue) {
        this.accountStatue = accountStatue;
    }

    public void deposit(double amount) {
        this.accountStatue.deposit(amount);
    }

    public void withdraw(double amount) {
        this.accountStatue.withdraw(amount);
    }

    public void computeInterest(){
        this.accountStatue.coumputeInterest();
    }
}
