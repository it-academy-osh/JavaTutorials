package com.company;

public class Test {
    private String name;
    private int age;

    //Конструктор - Constructor
    // по умолчанию - default

    public Test(){}

    public Test(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
