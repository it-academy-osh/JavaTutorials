package com.company.OOP.Polymorphism;

public class Test {
    public static void main(String[] args) {
        // int age = Integer.parseInt("123");
        Animal animal = new Dog();
        Dog dog = new Dog();
        Cat cat = new Cat();


    }

    public static void test(Animal animal){
        animal.eat();
    }
}
