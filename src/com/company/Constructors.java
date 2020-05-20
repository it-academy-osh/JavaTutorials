package com.company;

import java.util.Scanner;

public class Constructors {
    public static void main(String[] args) {

        Phone phone1 = new Phone(5255,"Note 10",223);
//        phone1.setNumber(5255);
//        phone1.setModel("Note 10");
//        phone1.setWeight(223);
        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());
        phone1.receiveCall("Murod");
        phone1.sendMessage(5);
        System.out.println();

        Phone phone2 = new Phone(4896,"Note 10 plus",223);
//        phone2.setNumber(4896);
//        phone2.setModel("Note 10 plus");
//        phone2.setWeight(223);
        System.out.println(phone2.getNumber());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getWeight());
        phone2.receiveCall("Husan");
        System.out.println();

        Phone phone3 = new Phone(779609000, "Note 20", 223);
//        phone3.setNumber(779609000);
//        phone3.setModel("Note 20");
//        phone3.setWeight(223);
        System.out.println(phone3.getNumber());
        System.out.println(phone3.getModel());
        System.out.println(phone3.getWeight());
        phone3.receiveCall("Adilet");



    }
}



class Phone{

    private int number;
    private String model;
    private int weight;

    public Phone(int testNumber, String testModel, int weight){
        this(testNumber, testModel);
        this.weight = weight;
    }

    //           int -> String
    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){}

    public void receiveCall(String name){
        System.out.println("Звонит: " + name);
    }

    public int getNumber() {
        return number;
    }

    public void sendMessage(int number){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number; i++){
            System.out.println("Enter number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

