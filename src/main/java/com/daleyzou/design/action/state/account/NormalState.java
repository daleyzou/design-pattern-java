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

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        stateCheck();
    }

    @Override
    void coumputeInterest() {
        System.out.println("账户正常");
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
