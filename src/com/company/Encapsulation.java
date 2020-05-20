package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {

//        Инкапсуляция
        Human human1 = new Human();
        human1.setName("Timur");
        human1.setAge(25);
        System.out.println("Выводим значение в main методе: " + human1.getName());
        System.out.println("Выводим значение в main методе: " + human1.getAge());
        human1.speak();
//
//        Triangle triangle1 = new Triangle();
//        triangle1.setA(2);
//        triangle1.setB(5);
//        triangle1.setC(6);
//        System.out.println(triangle1.getArea());
//        System.out.println(triangle1.getPerimeter());

    }
}

class Triangle{

    private int a,b,c;

    public double getArea(){
        double area = (a+b+c)/2.0;
        return Math.pow((area*(area-a)*(area-b)*(area-c)),0.5);
    }

    public int getPerimeter(){
        return (a+b+c);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

class Human{
//  типы доступности (private -> (свойствам, методам), public -> (свойствам, методам)
//  protected -> (свойствам, методам) -> Наследование)

    String name;
    int age;

    //this

    //setters and getters
    //setters - методы с помощью которых можно будет задать значение
    //getters - методы с помощью которых мы получаем значение которую задали

    //setter -> name
    public void setName(String name){
        if (name.isEmpty()){
            System.out.println("Ты ввел пустое имя");
        }
        else {
            //human1.name = name
            this.name = name;
        }
    }

    //getters -> name
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if (age < 0){
            System.out.println("Возраст должен быть положительным");
        }
        else {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

    void speak(){
        if (name != null) {
            System.out.println("Меня зовут " + name + ", и мне " + age + " года");
        }
    }
}
