package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int dig = 0, countEven = 0, countOdd = 0;
        String evens = "", odds = "";
        // 34560
        while (n != 0){
            dig = n % 10;
            if (dig % 2 == 0) {
                countEven++;
                evens = evens + Integer.toString(dig) + ",";
            }
            else {
                countOdd++;
                odds = odds + Integer.toString(dig) + ",";
            }
            n = n / 10;
        }


        System.out.println("Even digits in this number: " + countEven + " (" + evens + ")");
        System.out.println("Odd digits in this number: " + countOdd + " (" + odds + ")");



        // 1   1  2   3 5 8 13
        // n1 n2  n3
    }
}
