package com.company;

import java.util.Arrays;

public class temp {
    public static void main(String[] args) {
        int matrix[][] = new int[15][3];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) (Math.random() * 8) + 2;

                if (j == matrix[i].length - 1){
                    matrix[i][j] = matrix[i][j - 2] * matrix[i][j - 1];

                    for (int k = 0; k < i; k++){
                        if (matrix[i][j] == matrix[k][j] && i > 0){
                            if (matrix[i][j - 1] == matrix[k][j - 1] || matrix[i][j - 2] == matrix[k][j - 2]){
                                i--;
                            }
                        }
                    }
                }

            }
        }

        for(int i = 0;i < matrix.length; i++){
            System.out.print("Задание №"+(i+1+" Умножить "));
            for(int h = 0;h < matrix[i].length; h++){
                if(h==0)
                    System.out.print(matrix[i][h]+" на ");
                if(h==1)
                    System.out.println(matrix[i][h]);
            }
        }
    }
}
