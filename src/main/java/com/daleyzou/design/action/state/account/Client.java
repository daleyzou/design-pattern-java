package com.daleyzou.design.action.state.account;

/**
 * Client
 * @description TODO
 * @author daleyzou
 * @date 2020年11月02日 20:37
 * @version 1.0.0
 */
public class Client {
    public static void main(String[] args){
        Account account = new Account("段誉", 0.0);
        account.deposit(1000.0);
        account.withdraw(3000.0);
        account.withdraw(4000.0);
        account.withdraw(1000.0);
    }
}
