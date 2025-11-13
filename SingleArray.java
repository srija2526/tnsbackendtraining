package com.avn.tns.oopsdemo;
import java.util.Arrays;
import java.util.Scanner;

public class SingleArray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr2[]=new int[5];
    for(int i=0;i<arr2.length;i++){
        if (sc.hasNextInt()) {
                arr2[i] = sc.nextInt();
            }
    }
    System.out.println(Arrays.toString(arr2));
        

    //int arr[]={1,2,3,4,5};
    //for(int i:arr){
    //    System.out.println(i);
    //}
    
}


}
