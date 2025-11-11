package com.avn.tns.oopsdemo;
//interface:combo of abstract+static,default methods.

public interface Bank {
    void deposit(int amount);//abstract method
    void withdraw(int amount);
    //final/constant variable
    int MIN_BAL=1000;
    int DEPOSIT_LIMIT=23000;
    //DEFAULT METHOD
    default void welcome(){
        System.out.println("welcome to Atm");
    }
    //static method
    static void mesg(){
        System.out.println("enable to print");
    }


}
