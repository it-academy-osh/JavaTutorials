package com.company;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int[][] matrix = new int[15][3];

//        переменная i нужна чтобы получить нам строки
        for (int i = 0; i < matrix.length; i++){
            //        переменная j нужна чтобы получить нам столбцы
            for (int j = 0; j < matrix[i].length; j++){

//                генерация чисел
                matrix[i][j] = (int) (Math.random() * 8) + 2;
//              мы убеждаемся что мы заполняем 3 столбец
                if (j == matrix[i].length - 1){
//                    заполняем ячейку произведением последних двух столбцов
                    matrix[i][j] = matrix[i][j-1] * matrix[i][j-2];

//                    мы должны проверить на дубликат 3 столбец с предыдущими столбцами
                    for (int k = 0; k < i; k++){
//                        если мы находим дубликат, и если мы заполняем строку которая больше нуля
                        if (matrix[i][j] == matrix[k][j] && i > 0){
//                            мы уже проверяем на равенство множителей (столбцов)
                            if (matrix[i][j-2] == matrix[k][j-2] || matrix[i][j-2] == matrix[k][j-1]){
//                              если это так, то мы заново заполняем строку пока они не будут уникальны
                                i--;
                            }
                        }
                    }

                }



            }
        }

        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

    }
}
