package com.company;


import java.util.Scanner;

public class If {
    public static void main(String[] args){
        //Условный оператор
        System.out.println("Добро пожаловать в клуб!");

        //String string = new String("Hello");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько вам лет?");
        int myAge = scanner.nextInt();

        System.out.println("Ваше имя...");
        String name = scanner.next();

        if(myAge >= 18){ //true -> правда //false -> ложь
            System.out.println("Заходите " + name);
        }
        else if(myAge >= 16 && myAge < 18){
            System.out.println("Есть паспорт? (да/нет)");
            String answer = scanner.next();
            if (answer.equals("да")){
                System.out.println("Заходите " + name);
            }
            else {
                System.out.println("Гуляйте");
            }
        }
        else{
            System.out.println("Гуляй");
        }
    }
}
