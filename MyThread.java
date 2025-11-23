package com.avn.tns.threaddemo;

public class MyThread extends Thread{
    String mesg;
    public void  run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread());
        }
    }

    public static void main(String[] args) {
        MyThread ob=new MyThread();
        ob.start();

        MyThread ob1=new MyThread();
        ob1.start();
    }

}

