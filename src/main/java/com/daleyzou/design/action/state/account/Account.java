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
        accountStatue = new NormalState(this);
        System.out.println(this.owner + "进行了开户， 当前账户余额：" + this.balance);
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
        System.out.println(this.owner + "进行了存款， 当前账户余额：" + this.balance);
    }

    public void withdraw(double amount) {
        this.accountStatue.withdraw(amount);
        System.out.println(this.owner + "进行了取款， 当前账户余额：" + this.balance);
    }

    public void computeInterest(){
        this.accountStatue.coumputeInterest();
    }
}
