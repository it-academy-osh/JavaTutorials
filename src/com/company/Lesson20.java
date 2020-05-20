package com.company;


public class Lesson20 {
    public static void main(String[] args) {
        //static (свойства, методы)
        //final (Константа)
        //StringBuilder
        //String -> concat

        //Объекты
        //mutable - изменяемый
        //immutable - неизменяемый
        //GarbageCollector
        String string1 = "hello";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1 + string2 + string3;
        //string1 + string2 = newString ("hello my")
//        String stringAll = newString + string3; ("hello my friend");
        //newString + string3 = newString2
//        System.out.println(stringAll);

        //1 1 1 1 1

        StringBuilder builder = new StringBuilder("hello");
        System.out.println(builder.toString());
        builder.append(string2).append(string3);
        System.out.println(builder.toString());

        System.out.println();

        //Форматирование строк

        String name = "Timur";
        //s - string
        //d - digit
        //f - float
        System.out.printf("This is %s a string \n", name);
        System.out.printf("This is an int, %d \n", 1000);
        System.out.printf("%f This is %s a string, %d\n", 10.4, "Java", 5);
        System.out.printf("Float %.2f\n", 25.3);
        System.out.printf("Digit: %d\n", 5);
        System.out.printf("Digit: %d\n", 5232);
        System.out.printf("Digit: %d\n", 5202020);
        System.out.printf("Digit: %d\n", 523200000);
    }
}



