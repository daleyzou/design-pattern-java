package com.daleyzou.design.action.state.account;

/**
 * RestrictedState
 * @description TODO
 * @author daleyzou
 * @date 2020年11月02日 20:23
 * @version 1.0.0
 */
public class RestrictedState extends AccountStatue {
    public RestrictedState(AccountStatue accountStatue) {
        this.account = accountStatue.account;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("受限状态，无法取款");
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        stateCheck();
    }

    @Override
    void coumputeInterest() {
        System.out.println("账户受限， 计算利息");
    }

    @Override
    void stateCheck() {
        if (this.account.getBalance() >= 0){
            this.account.setAccountStatue(new NormalState(this));
        }else if (this.account.getBalance() < 0 &&this.account.getBalance() > -2000){
            this.account.setAccountStatue(new OverdraftState(this));
        }else if (this.account.getBalance() <= -2000){
            this.account.setAccountStatue(new RestrictedState(this));
        }
    }
}
