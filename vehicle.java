package com.avn.tns.oopsdemo;

public class vehicle {

    public String brand;
    public String model;

    public vehicle(String brand,String model){
        super();//the parent variable in child class
        this.brand=brand;//variable are belonging to this class
        this.model=model;
    }

    void startEngine(){
        System.out.println("when engine is started the vehicle starts");
    }
}
