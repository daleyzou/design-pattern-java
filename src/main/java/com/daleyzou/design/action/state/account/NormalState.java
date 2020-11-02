package com.daleyzou.design.action.state.account;

/**
 * NormalState
 * @description TODO
 * @author daleyzou
 * @date 2020年11月02日 20:22
 * @version 1.0.0
 */
public class NormalState extends AccountStatue {
    public NormalState(AccountStatue accountStatue) {
        this.account = accountStatue.account;
    }
    public NormalState(Account account){
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        this.account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    @Override
    void coumputeInterest() {
        System.out.println("账户正常");
    }

    @Override
    void stateCheck() {
        if (this.account.getBalance() < 0 &&this.account.getBalance() > -2000){
            this.account.setAccountStatue(new OverdraftState(this));
        }else if (this.account.getBalance() == -2000){
            this.account.setAccountStatue(new RestrictedState(this));
        }else if (this.account.getBalance() < -2000){
            System.out.println("操作受限");
        }
    }
}
