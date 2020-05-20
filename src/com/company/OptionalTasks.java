package com.company;

public class OptionalTasks {
    public static void main(String[] args) {
//        Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
//        Определить и вывести на экран сообщение о том, является ли массив строго возрастающей
//        последовательностью.

        //   [1, 1, 0, -1, -1, 1, 0, 0, 1, 1, -1]
        //int ones = 5
        //int zeros = 3
        //int minus = 3



        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 90) + 10;
            if (i > 0){
                if (array[i] < array[i-1]){
                    i--;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }



        System.out.println();





    }
}
