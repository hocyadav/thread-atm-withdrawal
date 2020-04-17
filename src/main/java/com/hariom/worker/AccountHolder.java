package com.hariom.worker;

import com.hariom.model.Account;

public class AccountHolder implements Runnable {
    private Account account;

    public AccountHolder(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            makeWithdrawal(2000);
        }
    }

    private synchronized void makeWithdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName()+" withdrawal started : "+amount);
            account.withdrawalMoney(amount);
            System.out.println(Thread.currentThread().getName()+" Withdrawal end : "+amount);
        } else {
            System.out.println("Not enough money");
        }
    }


}
