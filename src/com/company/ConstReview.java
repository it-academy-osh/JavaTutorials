package com.company;

import test4.Cat;

import java.util.Scanner;

public class ConstReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person1 person1 = new Person1();


        System.out.println("Please enter your details...");
        System.out.println("Your're the last one");
        String fullName = scanner.next();
        int age = scanner.nextInt();

        person1.setFullName(fullName);

        person1.setAge(age);

        person1.move();
        person1.talk();

        Person1 person2 = new Person1("Amanov Timur", 23);
        person2.move();
        person2.talk();

    }
}

class Person1{
    private String fullName;
    private int age;


    public Person1(){

    }

    public Person1(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }


    public void move(){
        System.out.println(fullName + " делает пробежку...");
    }

    public void talk(){
        System.out.println(fullName + " говорит...");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
