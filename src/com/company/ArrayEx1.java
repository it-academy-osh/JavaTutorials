package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int counter = 0;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random() * 200);
                if (matrix[i][j] > 9 && matrix[i][j] < 100){

                    //Это комментарий

                    int two = matrix[i][j] % 10;
                    int one = matrix[i][j] / 10;
                    if ((two + one) % 2 == 0){
                        counter++;
                        System.out.println(matrix[i][j]);
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("Counter: " + counter);
    }
}
