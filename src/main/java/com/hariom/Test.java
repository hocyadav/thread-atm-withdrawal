package com.hariom;

import com.hariom.model.Account;
import com.hariom.worker.AccountHolder;

public class Test {
    public static void main(String[] args) {
        Account account = new Account();
        AccountHolder accountHolder = new AccountHolder(account);

        Thread thread1 = new Thread(accountHolder);
        Thread thread2 = new Thread(accountHolder);

        thread1.setName("Hari");
        thread2.setName("Neha");

        thread1.start();
        thread2.start();
        
        //test

    }
}
