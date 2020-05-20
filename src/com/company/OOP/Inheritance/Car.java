package com.company.OOP.Inheritance;

public class Car extends Transport implements Movement{

    String equipment;

    public Car(String equipment, int speed, int numberOfPass, String type, String color, double volume, boolean isAutomatic, int horsePower) {
        super(speed, numberOfPass, type, color, volume, isAutomatic, horsePower);
        this.equipment = equipment;
    }

    public void getInfo(){
        System.out.println("Equipment: " + equipment);
        super.getInfo();
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
