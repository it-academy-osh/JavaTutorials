package com.company;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число дней: ");
        int days = scanner.nextInt();

        int remain = days % 3;
        if (remain == 0){
            System.out.println("GCV");
        }
        else if(remain == 1){
            System.out.println("VGC");
        }
        else if(remain == 2){
            System.out.println("CVG");
        }
        else{
            System.out.println("Enter a correct date");
        }

    }
}
