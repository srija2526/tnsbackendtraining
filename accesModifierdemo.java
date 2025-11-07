package com.avn.tns.otherackm;

import com.avn.tns.modifer.accessModifer;

public class accesModifierdemo {
    public static void main(String[] args) {
        accessModifer a=new accessModifer();
        System.out.println(a.collegename);//public
       // System.out.println(a.name);//protected
       //System.out.println(a.branch);//default only within package
       //System.out.println(a.id);//private
    }

}
