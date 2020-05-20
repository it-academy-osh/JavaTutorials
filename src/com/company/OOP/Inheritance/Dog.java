package com.company.OOP.Inheritance;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public String getName(){
        return super.getName();
    }

    public void bark(){
        System.out.println("I am barking");
    }
}
