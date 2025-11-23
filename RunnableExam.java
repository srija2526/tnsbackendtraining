package com.avn.tns.threaddemo;

public class RunnableExam  extends Sample implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        RunnableExam ob=new RunnableExam();
        Thread t1=new Thread(ob);
        t1.start();

    }
 
}
