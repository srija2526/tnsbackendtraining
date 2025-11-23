package com.avn.tns.threaddemo;

public class syncdemo extends Thread{
    public synchronized void multi(int no){
        for(int i=0;i<4;i++){
            int result=no*i;
            System.out.println(result);
        }
    }

}
