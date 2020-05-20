package com.company;

import java.util.Scanner;

public class EvklidMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int w = scanner.nextInt();
        int result = present(x,y,z,w);
        System.out.println(result);
    }

//    x(10) + y(25) + z(15) = w(40)
//    x(1) + y(1) + z(1) = w(5)
//    0-w

    static int present(int x, int y, int z, int w){
        int counter = 0;
        for (int i = 0; i <= w; i++){
            for (int j = 0; j <= w; j++){
                for (int k = 0; k <= w; k++){
                    if ( (i*x) + (j*y) + (k*z) == w ){
                        System.out.println("(" + i + ","+ j + "," + k + ")");
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    static void findNumbers(int s, int p){
        int counter = 0;
        for (int i = 1; i < p; i++) {
            for (int j = 1; j < p; j++) {
                if ((s == (i + j)) && (p == (i * j))) {
                    System.out.println(i + " " + j);
                    counter++;
                    break;
                }
            }
            if (counter > 0){
                break;
            }
        }
        if (counter == 0){
            System.out.println("No numbers");
        }
    }

    static int gdc(int a, int b){
        //a = 3430 b = 1365
        int remainder = 0;
        if (a > b) {
            while (a % b != 0) {
                remainder = a % b; // 35
                a = b; // 665
                b = remainder; // 35
            }
        }
        else{
            // a = 1365 b = 3430
            for (int i = 0; i < 100; i++){
                remainder = b % a; // 35
                b = a; // 665
                a = remainder; // 35
                if (remainder == 0){
                    break;
                }
            }
            remainder = b;
        }
        return remainder;
    }

    //15152
    static int getLength(int num){
        return String.valueOf(num).length();
    }
}
