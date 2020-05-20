package com.company;

public class ClassesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Timur";
        person1.setAge(18);

        person1.speak();
        person1.sayHello();
        int retire1 = person1.calculateYearsToRetirement(); //43
        System.out.println("Years to retirement: " + retire1);

        Person person2 = new Person();
        person2.name = "Islambek";
        person2.setAge(25);
        person2.speak();
        person2.sayHello();
        int retire2 = person2.calculateYearsToRetirement(); // 40
        System.out.println("Years to retirement: " + retire2);

        System.out.println("Average of years to retirement: " + (retire1 + retire2) / 2);

        System.out.println();
        System.out.println();

        sayHello(25,85);
        sayHello(105,112);

    }

    static void sayHello(int a, int b){
        System.out.println((a+b)/2);
    }

}

class Person {
            // У класса могут быть:
            //Данные (свойтсва)
            //Действия

            String name;
            int age;

            //void - этот метод ничего не возвращает

            //Типы возвращаемого значения
            //int, String, double, char, int[], int[][]

            int calculateYearsToRetirement() {
                int years = 65 - age;
                return years;
    }

//    int, String, double, char, int[], int[][]
    void setAge(int userAge){
        if (userAge > 20) {
            age = userAge;
        }
        else{
            System.out.println("Too early baby.");
        }
    }

    void speak() {
        System.out.println("My name is " + name +
                ", and age is: " + age);
    }

    void sayHello() {
        System.out.println("Hello " + name);
    }
}


