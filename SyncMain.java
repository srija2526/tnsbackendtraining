package com.avn.tns.threaddemo;

public class SyncMain {
    public static void main(String[] args) {
        
        syncdemo ob=new syncdemo();
         
        Thread t1=new Thread(){
            public  void run(){
                ob.multi(2);

            }
        };
         Thread t2=new Thread(){
            public void run(){
                ob.multi(4);
            }
         };

         t1.start();
         t2.start();


    }

}
