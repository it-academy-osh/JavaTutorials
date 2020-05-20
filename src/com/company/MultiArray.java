package com.company;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {

//        int[] numbers = {1,2,3};
//        System.out.println(Arrays.toString(numbers));
//
//        for (int i = 0; i < numbers.length; i++){
//            System.out.print(numbers[i] + " ");
//        }
//
//        System.out.println();

//        Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из
//        отрезка [-99;99]. Вывести массив на экран. После на отдельной строке вывести на экран значение
//        максимального элемента этого массива (его индекс не имеет значения).

        int[][] matrix = new int[5][8];
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 199) - 99;
                System.out.print(matrix[i][j]+ " ");

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(max);
    }

}
