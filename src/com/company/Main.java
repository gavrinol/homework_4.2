package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Задание 5
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || j == 2 && i == 0 || i == 2 && j == 0)
                    matrix[i][j] = 1;
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // Задание 6
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int[] arrNew = {4, 2, 0, -2, -4};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - arrNew[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();

        // Задание 7
        int[] arrSec = {5, 4, 3, 2, -1};
        System.out.println(Arrays.toString(arrSec));
        for (int i = 0 ; i < arrSec.length/2 ; i++) {
            int tmp = arrSec[i];
            arrSec[i] = arrSec[arrSec.length - i - 1];
            arrSec[arrSec.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(arrSec));
        System.out.println();

        //Задание 8/9
        int[] arrThird = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int k : arrThird) {
            for (int i : arrThird) {
                if (k + i == -2) {
                    System.out.println(k + " + " + i + " = -2");
                }
            }
        }
        System.out.println();
        // Я сразу сообразил метод решения и оказалось, что я решил 9ую задачу, а не 8ую.
        // В советах было написано, что потребуется использовать Arrays.sort, полагаю, можно решить задачу в один цикл,
        // но с условием, что 2 числа рядом дают в сумме -2, но таких чисел после сортировки массива нет
        Arrays.sort(arrThird);
        System.out.println(Arrays.toString(arrThird));
        for (int i = 0; i < arrThird.length - 1; i++) {
            if (arrThird[i] + arrThird[i+1] == -2){
                System.out.println(arrThird[i] + " + " + arrThird[i+1]);
            }else
                System.out.println("Чисел нет");

        }
        // хотелось бы узнать про такой метод решения

    }
}
