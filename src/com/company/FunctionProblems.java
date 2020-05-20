package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class FunctionProblems {
    public static void main(String[] args) {

//        changeValues(45,85);
//        int[][] matrix1 = new int[3][3];
//        int[][] matrix2 = new int[3][3];
//        int[][] filledMatrix1 = fillMatrix(matrix1);
//        int[][] filledMatrix2 = fillMatrix(matrix2);
//
//        outputMatrix(filledMatrix1);
//        System.out.println();
//        outputMatrix(filledMatrix2);
//        System.out.println();
//        int[][] sumResult = sumMatrix(filledMatrix1, filledMatrix2);
//        outputMatrix(sumResult);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start: ");
        int start = scanner.nextInt();
        System.out.println("Enter end: ");
        int end = scanner.nextInt();
        System.out.println("Enter your number: ");
        int userNumber = scanner.nextInt();

        int[] filledMatrix = fillMatrix2(start, end, userNumber); //возвращает матрицу
        System.out.println(Arrays.toString(filledMatrix));

        int[] result = selectionSort(filledMatrix);
        System.out.println(Arrays.toString(result));

//        Arrays.sort(filledMatrix);
//        System.out.println(Arrays.toString(filledMatrix));
//
//        int[] sortedArray = sortArray(filledMatrix);
//        System.out.println(Arrays.toString(sortedArray));

    }



    static int[] selectionSort(int[] matrix){
//        этот цикл берет (удерживает) каждую цифру и начинает сравнивать с другими
        for (int i = 0; i < matrix.length; i++){
            // та цифра которая возможно самая минимальная
            int min = matrix[i]; //14
            // адрес (индекс) нашей цифры
            int min_i = i;

            for (int j = i+1; j < matrix.length; j++){
                if (matrix[j] < min){
                    min = matrix[j]; // 10
                    min_i = j; // 3
                }
            }

            if (i != min_i){
                int temp = matrix[i]; //14
                matrix[i] = matrix[min_i]; // 10
                matrix[min_i] = temp;
            }
        }
        return matrix;
    }


//   Bubble sort
    static int[] sortArray(int[] array){
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (j < array.length - 1) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < result.length; i++){
            result[i] = array[i];
        }
        return result;
    }

    static int[] fillMatrix2(int start, int end, int userNumber){
        int[] matrix = new int[10];
        for (int i = 0; i < matrix.length; i++){
            matrix[i] = (int)(Math.random() * (end - start)) + start;
            if (matrix[i] == userNumber){
                System.out.println("Got it!");
            }
        }
        return matrix;
    }

    static int[][] sumMatrix(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix2.length];

        for (int i = 0; i < result.length; i++){
            for (int j = 0; j < result[i].length; j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    static void outputMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    static int[][] fillMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random() * 9) + 1;
            }
        }
        return matrix;
    }

    static void changeValues(int a, int b){
        System.out.println("a:" + a + "\n" + "b:" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:" + a + "\n" + "b:" + b);
    }
}
