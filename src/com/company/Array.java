package com.company;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int number = 10; // примитивный тип данных
//        int[] grades = new int[5];
//        grades[0] = 5;
//        grades[1] = 6;
//        grades[2] = 7;
//        grades[3] = 8;
//        grades[4] = 3;
//
//        int[] grades = {4,5,6,3,3,9};
//        System.out.println(grades[5]);

//        int[] grades = new int[5];
//        //0 - 4
//        for (int i = 0; i < grades.length; i++){
//            grades[i] = i * 10;
//            System.out.println("i: " + i + " -> " + grades[i]);
//        }
//
//        System.out.println(Arrays.toString(grades));

//        for (int i = 0; i < grades.length; i++){
//            System.out.println(grades[i]);
//        }


        String[] words = new String[3];
        words[0] = "привет";
        words[1] = "салам";
        words[2] = "hi";

//        for (int i = 0; i < words.length; i++){
//            System.out.println(words[i]);
//        }

//        for (String temp:words) {
//            System.out.println(temp);
//        }

        int[] numbers = {4,5,6,8,59};

        for (int num:numbers) {
            System.out.println(num);
        }










    }
}
