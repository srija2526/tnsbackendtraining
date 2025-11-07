package com.avn.tns.modifer;

public class accessModifermain {
    public static void main(String[] args) {
        accessModifer a=new accessModifer();
        System.out.println(a.collegename);//public
        System.out.println(a.branch);//default only within package
        //System.out.println(a.id);private only within class
        System.out.println(a.name);//protected only within package and outside package subclass thats extends this class
    }
    
    


    

    



}
