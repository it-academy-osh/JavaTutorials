package com.company.OOP.Inheritance;

public abstract class Transport {
    int speed;
    int numberOfPass;
    String type;
    String color;
    double volume;
    boolean isAutomatic;
    int horsePower;

    public Transport(int speed, int numberOfPass, String type, String color, double volume, boolean isAutomatic, int horsePower) {
        this.speed = speed;
        this.numberOfPass = numberOfPass;
        this.type = type;
        this.color = color;
        this.volume = volume;
        this.isAutomatic = isAutomatic;
        this.horsePower = horsePower;
    }

    public Transport(int speed, String type, String color, double volume, boolean isAutomatic, int horsePower) {
        this.speed = speed;
        this.type = type;
        this.color = color;
        this.volume = volume;
        this.isAutomatic = isAutomatic;
        this.horsePower = horsePower;
    }

    public double fuelConsumption(){
        return volume * 4;
    }

    public void getInfo(){
        System.out.println("Speed: " + speed);
        System.out.println("NumberOfPass: " + numberOfPass);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Volume: " + volume);
        System.out.println("Is transport automatic: " + isAutomatic);
        System.out.println("Horse power: " + horsePower);
        System.out.println("Fuel consumption: " + fuelConsumption());
    }
}
