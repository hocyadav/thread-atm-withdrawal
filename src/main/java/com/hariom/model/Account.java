package com.hariom.model;

public class Account {
    private int balance = 6000;

    public int getBalance() {
        return this.balance;
    }
    
    public void withdrawalMoney(int amount){
        balance = balance - amount;
    }
    
}
