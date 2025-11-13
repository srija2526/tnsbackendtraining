package com.avn.tns.oopsdemo;

import java.util.Scanner;

public class InputTaking {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         System.out.println("enter name");
        String name =s.nextLine();
        System.out.println(name);
         System.out.println("enter num");
        int no=s.nextInt();
        System.out.println(no);

    }

}
