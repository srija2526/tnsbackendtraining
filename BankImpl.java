package com.avn.tns.oopsdemo;

public class BankImpl implements Bank {
    int balance=1000;
    public void deposit(int amount){
        if(amount<=DEPOSIT_LIMIT){
            int bal=amount+balance;
            System.out.println(bal);

        }
        else{
            System.err.println("exceeds the limit");
        }
    }
     public void withdraw(int amount) {
        int balance=25000;
        if (balance - amount >= MIN_BAL) {
            balance = balance- amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.err.println("Insufficient balance! Minimum balance required: " + MIN_BAL);
        }
    }

}
