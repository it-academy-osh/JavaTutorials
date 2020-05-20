package com.company.OOP.Inheritance;

public class Truck extends Transport implements Movement{

    int maxWeight;

    public Truck(int maxWeight, int speed, String type, String color, double volume, boolean isAutomatic, int horsePower) {
        super(speed, type, color, volume, isAutomatic, horsePower);
        this.maxWeight = maxWeight;
    }


    public void getInfo(){
        super.getInfo();
        System.out.println("Max weight: " + maxWeight);
        drive();
        carry();
    }


    @Override
    public void drive() {

    }

    @Override
    public void carry() {

    }
}
