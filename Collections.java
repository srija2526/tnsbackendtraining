package com.avn.tns.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListDemo {
    public static void main(String[] args) {
        //List
        List<Integer> l=new ArrayList<Integer>();
        l.add(23);
        l.add(78);
        l.add(23);
        System.out.println(l.get(1));
        System.out.println(l.contains(23));
        //LinkedList
        List<Integer> l1=new LinkedList<Integer>();
        l1.add(45);
        l1.add(1,65);
        l1.add(78);
        Iterator itr=l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        for(int i:l1){
            System.out.println(i);
        }
        // set
        Set s=new HashSet();
        s.add(45);
        s.add(89);
        s.add(90);
        s.add(90);
        System.out.println(s);
        //Treeset
        Set<String> s1=new TreeSet<String>();
        s1.add("arija");
        s1.add("bob");
        s1.add("keru");
        System.out.println("this is from Treeset");
        System.out.println(s1);





            
        
    }

}