package com.company;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] array = new int[12];
        int positive = 0, negative = 0;

        int whileCounter = 0;

        do {
            whileCounter++;
            positive = 0;
            negative = 0;
            for (int i = 0; i < array.length; i++){
                array[i] = (int) (Math.random() * 21) - 10; //[-10:10]:

                if (array[i] > 0){
                    positive++;
                }

                if (array[i] < 0){
                    negative++;
                }

                if(array[i] == 0){
                    i--;
                    continue;
                }
//
//                if (positive == 6 && negative == 6){
//                    break;
//                }

//                if (i == array.length - 1 && positive != array.length/2){
//                    positive = 0;
//                    negative = 0;
//                }

            }
        }
        while(positive != negative);
//        while (positive!=array.length / 2 && negative != array.length / 2);


        System.out.println(Arrays.toString(array));
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("WhileCounter: " + whileCounter);


    }
}
