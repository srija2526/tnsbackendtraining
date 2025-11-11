package com.avn.tns.oopsdemo;

public class ElectriCar  extends vehicle{
    public int batterycapcity;
     
    public ElectriCar(String brand,String model,int batterycapcity){
        super(brand, model);
        this.batterycapcity=batterycapcity;
    }

}
