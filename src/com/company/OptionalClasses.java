package com.company;

public class OptionalClasses {
    public static void main(String[] args) {

//  Cars car1{
//      model: "BMW i7"
//      year: 2017
//      generation: 7
//      volume: 4.7
//      color: "silver"
//  }



        Cars car1 = new Cars();
        car1.model = "BWM i7";
        car1.year = 2017;
        car1.generation = 7;
        car1.volume = 4.7;
        car1.color = "silver";
        car1.ad();

        Cars car2 = new Cars();
        car2.setData("BWM i5", 4.7, "black", 2010, 5);
        car2.ad();

        Cars car3 = new Cars();
        car3.setData("BWM i7", 5.7, "white", 2020, 7);
        car3.ad();


    }

//    Classes and Objects
//    Toyota - BMW - Mercedes-Benz -> 1000
//    model -> volume -> color -> year -> generation
}
class Cars{
//    1. Переменные (свойства)
//    2. Действия (методы)
    String model;
    double volume;
    String color;
    int year;
    int generation;

    void setData(String carModel, double carVolume, String carColor, int carYear, int carGeneration){
        model = carModel;
        volume = carVolume;
        color = carColor;
        if (carYear > 2015) {
            year = carYear;
        }
        generation = carGeneration;
    }

    void ad(){
        System.out.println("This " + model + " with " + year + " is the best in 2020!");
    }
}
