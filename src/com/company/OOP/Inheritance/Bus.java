package com.company.OOP.Inheritance;

public class Bus extends Transport implements Movement{

    public Bus(int speed, int numberOfPass, String type, String color, double volume, boolean isAutomatic, int horsePower) {
        super(speed, numberOfPass, type, color, volume, isAutomatic, horsePower);
    }

    public void drive(){
        System.out.println("Bus is being driven");
    }

    public void carry(){
        System.out.println("I'm carrying 25 tons");
    }

}
