package com.avn.tns.oopsdemo;

public class BankMain {
    public static void main(String[] args) {
        Bank o=new BankImpl();
        o.deposit(1000);
        o.withdraw(5000);
        Bank.mesg();
    }

}
