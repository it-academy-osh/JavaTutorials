package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class GDC {
    public static void main(String[] args) {

//        int[] divisibles1 = gdc(144);
//        System.out.println(Arrays.toString(divisibles1));
//        int[] divisibles2 = gdc(2020);
//        System.out.println(Arrays.toString(divisibles2));
//        int max = compareForMax(divisibles1, divisibles2);
//        System.out.println(max);


    }


 // "15152"
    static int getIntegerLength(int num){
        return String.valueOf(num).length();
    }

    static void gdc(int a, int b, int aLength, int bLength){}

    static int compareForMax(int[] first, int[] second){
        int max = 0;
        for (int i = 0; i < first.length; i++){
            for (int j = 0; j < second.length; j++){
                if (first[i] == second[j]){
                    max = first[i];
                }
            }
        }
        return max;
    }

    static int[] gdc(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
//                System.out.print(i + " ");
                counter++;
            }
        }
        System.out.println();
        int[] divisibles = new int[counter];
        int k = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisibles[k] = i;
                k++;
            }
        }
        return divisibles;
    }

}
