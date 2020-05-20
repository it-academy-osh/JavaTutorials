package com.company;
import java.io.*;
import java.util.*;

public class ArrayExplanation {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 7; i++){
            numbers.add(i);
        }

        for (int i: numbers) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                i = 0;
            }
            else if(numbers.size() == 1){
                break;
            }
            else{
                numbers.remove(i);
                System.out.println("\ndeleted: " + numbers.get(i));
            }
        }

        System.out.println();

        for (int i: numbers) {
            System.out.print(i + " ");
        }
    }
}






