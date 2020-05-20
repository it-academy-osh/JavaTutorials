package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        String grade = scanner.next();

        if (grade.equals("A") || grade.equals("a")){
            System.out.println("Perfect!");
        }
        else if(grade.equals("B") || grade.equals("C")){
            System.out.println("Good!");
        }
        else if(grade.equals("D")){
            System.out.println("Passed!");
        }
        else if(grade.equals("F")){
            System.out.println("Try again!");
        }
        else{
            System.out.println("Invalid grade");
        }

        switch (grade){
            case "A":
            case "a":
                System.out.println("Perfect!");
                break;
            case "B":
            case "C":
                System.out.println("Good!");
                break;
            case "D":
                System.out.println("Passed!");
                break;
            case "F":
                System.out.println("Try again!");
                break;
            default:
                System.out.println("Invalid grade");
        }

    }
}
